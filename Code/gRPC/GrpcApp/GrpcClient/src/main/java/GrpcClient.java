import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class GrpcClient {

    public static void main(String[] args)  {
        String address = "localhost"; //here we use service on the same host
        int port = 50001;
        ServiceNameGrpc.ServiceNameBlockingStub bStub;
        ServiceNameGrpc.ServiceNameStub nonbStub;
        System.out.println("Running gRPC client...");
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(address, port) .usePlaintext().build();
        bStub = ServiceNameGrpc.newBlockingStub(channel);
        nonbStub = ServiceNameGrpc.newStub(channel);

        TheRequest request = TheRequest.newBuilder().setName("Hien")
                .setAge(33).build();
        System.out.println("...calling unaryProcedure");
        TheResponse response = bStub.unaryProcedure(request);
        System.out.println("...after calling unaryProcedure");
        System.out.println("--> Response: " + response);

        Iterator<TheResponse> respIterator;
        System.out.println("...calling streamProcedure");
        respIterator = bStub.streamProcedure(request);
        System.out.println("...after calling streamProcedure");
        TheResponse strResponse;
        while(respIterator.hasNext()) {
            strResponse = respIterator.next();
            System.out.println("-->" + strResponse.getMessage());
        }

        System.out.println("...async calling unaryProcedure");
        nonbStub.unaryProcedure(request, new UnaryObs());
        System.out.println("...after async calling unaryProcedure");
        System.out.println("...async calling streamProcedure");
        nonbStub.streamProcedure(request, new UnaryObs());
        System.out.println("...after async calling streamProcedure");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ///////////////////FACTORIAL AND FIBONACI///////////////////
        ServiceNameGrpc.ServiceNameStub nonbStub2;
        nonbStub2 = ServiceNameGrpc.newStub(channel);
        TheRequest2 request2 = TheRequest2.newBuilder().setType(false).setN(5).build();
        System.out.println("...async calling Factorial");
        nonbStub2.procFacFib(request2, new UnaryObs2());
        System.out.println("...after async calling Factorial");
        request2 = TheRequest2.newBuilder().setType(true).setN(6).build();
        System.out.println("...async calling Fibonacci");
        nonbStub2.procFacFib(request2, new UnaryObs2());
        System.out.println("...after async calling Fibonacci");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        channel.shutdown();
    }

    private static class UnaryObs implements StreamObserver<TheResponse> {
        public void onNext(TheResponse theResponse) {
            System.out.println("-->async unary onNext: " +
                    theResponse.getMessage());
        }
        public void onError(Throwable throwable) {
            System.out.println("-->async unary onError");
        }
        public void onCompleted() {
            System.out.println("-->async unary onCompleted");
        }
    }
    private static class UnaryObs2 implements StreamObserver<TheResponse2> {
        public void onNext(TheResponse2 theResponse2) {
            System.out.println("-->async unary onNext: " +
                    theResponse2.getRes());
        }
        public void onError(Throwable throwable) {
            System.out.println("-->async unary onError");
        }
        public void onCompleted() {
            System.out.println("-->async unary onCompleted");
        }
    }
}