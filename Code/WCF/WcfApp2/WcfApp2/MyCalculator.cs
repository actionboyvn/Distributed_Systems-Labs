using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading;

namespace WcfApp2
{
    [ServiceBehavior(InstanceContextMode = InstanceContextMode.Single, ConcurrencyMode = ConcurrencyMode.Multiple)]
    public class MyCalculator : ICalculator
    {
        public ComplexNum addCNum(ComplexNum n1, ComplexNum n2)
        {
            Console.WriteLine(String.Format("...called addCNum({0},{1},{2},{3})",n1.real, n1.imag, n2.real, n2.imag));
            return new ComplexNum(n1.real + n2.real, n1.imag + n2.imag);
        }
        public double HMultiply(double n1, double n2)
        {
            Console.WriteLine("...called HMultiply(with 5s delay)");
            Thread.Sleep(5000);
            return n1 * n2;
        }
    }
}