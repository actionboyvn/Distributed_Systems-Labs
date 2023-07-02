import com.google.protobuf.ByteString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.example.model.*;

public class GrpcServer {
    public static void main(String[] args) {
        int port = 50001;
        System.out.println("Starting gRPC server...");
        Server server = ServerBuilder.forPort(port)
                .addService(new MyServiceImpl()).build();
        try {
            server.start();
            System.out.println("...Server started");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class MyServiceImpl extends ServiceNameGrpc.ServiceNameImplBase {
        public void unaryProcedure(TheRequest req,
                                   StreamObserver<TheResponse> responseObserver) {
            String msg;
            System.out.println("...called UnaryProcedure - start");
            if (req.getAge() > 18)
                msg = "Mr/Ms " + req.getName();
            else
                msg = "Boy/Girl";
            TheResponse response = TheResponse.newBuilder()
                    .setMessage("Hello " + msg)
                    .build();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("...called UnaryProcedure - end");
        }

        public void streamProcedure(TheRequest req,
                                    StreamObserver<TheResponse> responseObserver) {
            for (int i = 0; i < 5; i++) {
                TheResponse response = TheResponse.newBuilder()
                        .setMessage("Stream chunk " + (i + 1)).build();
                // [enter here Thread.sleep to easier trace the operation]
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }

        public void procFacFib(TheRequest2 req,
                               StreamObserver<TheResponse2> responseObserver) {
            if (req.getType() == false) {
                int res = 1;
                for (int i = 1; i <= req.getN(); i++) {
                    res *= i;
                    TheResponse2 response2 = TheResponse2.newBuilder()
                            .setRes(res).build();
                    // [enter here Thread.sleep to easier trace the operation]
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    responseObserver.onNext(response2);
                }
            } else {
                int f1 = 1;
                int f2 = 1;
                for (int i = 1; i <= req.getN(); i++) {
                    int temp = f1 + f2;
                    f1 = f2;
                    f2 = temp;
                    TheResponse2 response2 = TheResponse2.newBuilder()
                            .setRes(temp).build();
                    // [enter here Thread.sleep to easier trace the operation]
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    responseObserver.onNext(response2);
                }
            }
            responseObserver.onCompleted();
        }
    }
}