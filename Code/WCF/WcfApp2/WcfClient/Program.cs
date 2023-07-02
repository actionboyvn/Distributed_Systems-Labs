using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using WcfClient.ServiceReference1;
using WcfClient.ServiceReference2;
using WcfClient.ServiceReference3;

namespace WcfClient
{
    class Program
    {
        static CalculatorClient myClient = new CalculatorClient("BasicHttpBinding_ICalculator");
        static async Task<double> callHMultiplyAsync(double n1, double n2)
        {
            Console.WriteLine("2......called callHMultiplyAsync");
            double reply = await myClient.HMultiplyAsync(n1, n2);
            Console.WriteLine("2......finished HMultipleAsync");
            return reply;
        }
        static void Main(string[] args)
        {
            ComplexNum cnum1 = new ComplexNum();
            cnum1.real = 1.2;
            cnum1.imag = 3.4;
            ComplexNum cnum2 = new ComplexNum();
            cnum2.real = 5.6;
            cnum2.imag = 7.8;
            Console.WriteLine("\nCLIENT1 - START");
            Console.WriteLine("...calling addCNum(...)");
            ComplexNum result1 = myClient.addCNum(cnum1, cnum2);
            Console.WriteLine("addCNum(...) = ({0},{1})", result1.real, result1.imag);
            Thread.Sleep(100);
            Console.WriteLine("2...calling HMultiply ASYNCHRONOUSLY !!!");
            Task<double> asyResult = callHMultiplyAsync(1.1, -3.3);

            ComplexNum res = myClient.addCNum(cnum1, cnum2);
            Console.WriteLine("2...res = " + res.imag);
            double result = asyResult.Result;
            Console.WriteLine("2...HMultiplyAsync Result = " + result);

            Console.WriteLine("\nCLIENT2 – START (Oneway):");
            AsyncServiceClient client2 = new AsyncServiceClient("BasicHttpBinding_IAsyncService");
            Console.WriteLine("...calling Fun 1");
            client2.Fun1("Client2");
            Thread.Sleep(10);
            Console.WriteLine("...continue after Fun 1 call");
            Console.WriteLine("...calling Fun 2");
            client2.Fun2("Client2");
            Thread.Sleep(10);
            Console.WriteLine("...continue after Fun 2 call");

            Console.WriteLine("\nCLIENT3 – START (Callbacks):");
            SuperCalcCallback myCbHandler = new SuperCalcCallback();
            InstanceContext instanceContext = new InstanceContext(myCbHandler);
            SuperCalcClient client3 = new SuperCalcClient(instanceContext);
            double value1 = 9;
            Console.WriteLine("...calling Factorial({0})...", value1);
            client3.Factorial(value1);
            value1 = 10;
            Console.WriteLine("...calling Factorial({0})...", value1);
            client3.Factorial(value1);
            Console.WriteLine("--> Press ENTER to continue");
            Console.ReadLine();
            myClient.Close();
            client2.Close();
            client3.Close();

        }
    }
}
