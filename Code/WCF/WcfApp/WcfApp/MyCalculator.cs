using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfApp
{
    [ServiceBehavior(InstanceContextMode = InstanceContextMode.Single)]
    public class MyCalculator : ICalculator
    {
        double sum = 0;
        public double Add(double val1, double val2)
        {
            double result = val1 + val2;
            Console.WriteLine("Adding: " + val1 + " and " + val2);
            Console.WriteLine("Result: " + result);
            return result;
        }

        public double Multiply(double val1, double val2)
        {
            double result = val1 * val2;
            Console.WriteLine("Multiplying: " + val1 + " i " + val2);
            Console.WriteLine("Result: " + result);
            return result;
        }

        public double Summarize(double n1)
        {
            sum += n1;
            Console.WriteLine("Current sum: " + sum);
            return sum;
        }

    }
}
