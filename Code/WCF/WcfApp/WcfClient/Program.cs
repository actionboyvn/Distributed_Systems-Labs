using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using WcfClient.ServiceReference1;

namespace WcfClient
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("... The client is started");
            // Step 1: Create client proxy based on communication channel.
            // base address:
            Uri baseAddress;
            // binding, address, endpoint address:
            BasicHttpBinding myBinding = new BasicHttpBinding();
            baseAddress = new Uri("http://localhost:8737/Design_Time_Addresses/WcfApp/MyCalculator/endpoint1");
            EndpointAddress eAddress = new EndpointAddress(baseAddress);
            // channel factory:
            ChannelFactory<ICalculator> myCF = new
            ChannelFactory<ICalculator>(myBinding, eAddress);
            // client proxy (here myClient) based on channel
            ICalculator myClient = myCF.CreateChannel();
            // Step 2: service operations call.
            Console.Write("...calling Add (for entpoint1) ");
            double result = myClient.Add(-3.7, 9.5); //just example values
            Console.WriteLine("Result = " + result);

            CalculatorClient myClient2 = new CalculatorClient("WSHttpBinding_ICalculator");
            Console.Write("...calling Multiply (for endpoint2) - ");
            result = myClient2.Multiply(-3.7, 9.5); //just example values
            Console.WriteLine("Result = " + result);

            Console.WriteLine("...calling Sumarize - ");
            result = myClient.Summarize(10);
            Console.WriteLine("Summarize(10) result client1 = " + result);
            result = myClient.Summarize(11);
            Console.WriteLine("Summarize(11) result client1 = " + result);
            result = myClient2.Summarize(12);
            Console.WriteLine("Summarize(12) result client2 = " + result);
            result = myClient2.Summarize(13);
            Console.WriteLine("Summarize(13) result client2 = " + result);


            Console.WriteLine("...press <ENTER> to STOP client...");
            Console.WriteLine();
            Console.ReadLine(); // to not finish app immediately:
           
            ((IClientChannel)myClient).Close();
            Console.WriteLine("...Client closed - FINISHED");
        }
    }    
}
