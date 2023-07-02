﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WcfClient.ServiceReference1 {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="ServiceReference1.ICalculator")]
    public interface ICalculator {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICalculator/Add", ReplyAction="http://tempuri.org/ICalculator/AddResponse")]
        double Add(double val1, double val2);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICalculator/Add", ReplyAction="http://tempuri.org/ICalculator/AddResponse")]
        System.Threading.Tasks.Task<double> AddAsync(double val1, double val2);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICalculator/Multiply", ReplyAction="http://tempuri.org/ICalculator/MultiplyResponse")]
        double Multiply(double val1, double val2);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICalculator/Multiply", ReplyAction="http://tempuri.org/ICalculator/MultiplyResponse")]
        System.Threading.Tasks.Task<double> MultiplyAsync(double val1, double val2);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICalculator/Summarize", ReplyAction="http://tempuri.org/ICalculator/SummarizeResponse")]
        double Summarize(double n1);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICalculator/Summarize", ReplyAction="http://tempuri.org/ICalculator/SummarizeResponse")]
        System.Threading.Tasks.Task<double> SummarizeAsync(double n1);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface ICalculatorChannel : WcfClient.ServiceReference1.ICalculator, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class CalculatorClient : System.ServiceModel.ClientBase<WcfClient.ServiceReference1.ICalculator>, WcfClient.ServiceReference1.ICalculator {
        
        public CalculatorClient() {
        }
        
        public CalculatorClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public CalculatorClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public CalculatorClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public CalculatorClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public double Add(double val1, double val2) {
            return base.Channel.Add(val1, val2);
        }
        
        public System.Threading.Tasks.Task<double> AddAsync(double val1, double val2) {
            return base.Channel.AddAsync(val1, val2);
        }
        
        public double Multiply(double val1, double val2) {
            return base.Channel.Multiply(val1, val2);
        }
        
        public System.Threading.Tasks.Task<double> MultiplyAsync(double val1, double val2) {
            return base.Channel.MultiplyAsync(val1, val2);
        }
        
        public double Summarize(double n1) {
            return base.Channel.Summarize(n1);
        }
        
        public System.Threading.Tasks.Task<double> SummarizeAsync(double n1) {
            return base.Channel.SummarizeAsync(n1);
        }
    }
}
