using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfApp2
{
    [ServiceContract]
    public interface ICalculator
    {
        [OperationContract]
        ComplexNum addCNum(ComplexNum n1, ComplexNum n2);
        [OperationContract]
        double HMultiply(double n1, double n2);
    }
    [DataContract]
    public class ComplexNum
    {
        string description = "Complex number";
        [DataMember]
        public double real;
        [DataMember]
        public double imag;
        [DataMember]
        public string Desc
        {
            get { return description; }
            set { description = value; }
        }
        public ComplexNum(double r, double i)
        {
            this.real = r;
            this.imag = i;
        }
    }
}
