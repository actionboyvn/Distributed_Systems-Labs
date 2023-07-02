using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.ServiceModel.Description;
using System.Text;
using System.Threading.Tasks;
using CallbackService;
using WcfApp2;

namespace WcfServiceHost
{
    class Program
    {
        static void Main(string[] args)
        {
            // Krok 1 URI dla bazowego adresu serwisu
            Uri baseAddress = new Uri("http://localhost:8733/Design_Time_Addresses/WcfApp2/MyCalculator/");
            // Krok 2 Instancja serwisu
            ServiceHost myHost = new
            ServiceHost(typeof(MyCalculator), baseAddress);
            // Krok 3 Endpoint serwisu
            BasicHttpBinding myBinding = new BasicHttpBinding();
            ServiceEndpoint endpoint1 = myHost.AddServiceEndpoint(
                                            typeof(ICalculator),
                                            myBinding,
                                            "endpoint1");
            // Krok 4 Ustawienie metadanych
            ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
            smb.HttpGetEnabled = true;
            myHost.Description.Behaviors.Add(smb);
            try
            {
                // Krok 5 Uruchomienie serwisu.
                myHost.Open();
                Console.WriteLine("Service 1 is started and running.");
                //Console.WriteLine("Press <ENTER> to STOP service...");
                Console.WriteLine();
                //Console.ReadLine(); // aby nie kończyć natychmiast:
                //myHost.Close();
            }
            catch (CommunicationException ce)
            {
                Console.WriteLine("Exception occured: {0}", ce.Message);
                myHost.Abort();
            }

            Uri baseAddress2 = new Uri("http://localhost:8734/Design_Time_Addresses/WcfApp2/AsyncService/");
            // Krok 2 Instancja serwisu
            ServiceHost myHost2 = new
            ServiceHost(typeof(AsyncService), baseAddress2);
            // Krok 3 Endpoint serwisu
            BasicHttpBinding myBinding2 = new BasicHttpBinding();
            ServiceEndpoint endpoint2 = myHost2.AddServiceEndpoint(
                                            typeof(IAsyncService),
                                            myBinding2,
                                            "endpoint2");
            // Krok 4 Ustawienie metadanych
            ServiceMetadataBehavior smb2 = new ServiceMetadataBehavior();
            smb2.HttpGetEnabled = true;
            myHost2.Description.Behaviors.Add(smb2);
            try
            {
                // Krok 5 Uruchomienie serwisu.
                myHost2.Open();
                Console.WriteLine("Service 2 is started and running.");
                //Console.WriteLine("Press <ENTER> to STOP service...");
                Console.WriteLine();
                //Console.ReadLine(); // aby nie kończyć natychmiast:
                //myHost2.Close();
            }
            catch (CommunicationException ce)
            {
                Console.WriteLine("Exception occured: {0}", ce.Message);
                myHost2.Abort();
            }

            Uri baseAddress3 = new Uri("http://localhost:8735/Design_Time_Addresses/WcfApp2/MySuperCalc/");
            ServiceHost myHost3 = new ServiceHost(typeof(MySuperCalc), baseAddress3);
            WSDualHttpBinding myBinding3 = new WSDualHttpBinding();
            ServiceEndpoint endpoint3 =
            myHost3.AddServiceEndpoint(typeof(ISuperCalc), myBinding3, "endpoint3");
            ServiceMetadataBehavior smb3 = new ServiceMetadataBehavior();
            smb3.HttpGetEnabled = true;
            myHost3.Description.Behaviors.Add(smb3);
            try
            {
                // Krok 5 Uruchomienie serwisu.
                myHost3.Open();
                Console.WriteLine("Service 3 is started and running.");
                Console.WriteLine("Press <ENTER> to STOP service...");
                Console.WriteLine();
                Console.ReadLine(); // aby nie kończyć natychmiast:
                myHost.Close();
                myHost2.Close();
                myHost3.Close();
            }
            catch (CommunicationException ce)
            {
                Console.WriteLine("Exception occured: {0}", ce.Message);
                myHost3.Abort();
            }
        }
    }
}
