using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading;

namespace CallbackService
{
    [ServiceBehavior(InstanceContextMode = InstanceContextMode.PerSession, ConcurrencyMode = ConcurrencyMode.Multiple)]
    public class MySuperCalc : ISuperCalc
    {
        double result;
        ISuperCalcCallback callback = null;
        public MySuperCalc()
        {
            callback = OperationContext.Current.GetCallbackChannel
            <ISuperCalcCallback>();
        }
        public void Factorial(double n)
        {
            Console.WriteLine("...called Factorial({0})", n);
            Thread.Sleep(1000);
            result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            callback.FactorialResult(result);
            Console.WriteLine("...Factorial({0}) finished", n);
        }
        public void DoSomething(int sec) { 
        }
    }
}
