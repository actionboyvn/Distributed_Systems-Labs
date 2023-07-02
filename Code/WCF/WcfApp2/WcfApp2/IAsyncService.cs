﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace WcfApp2
{
    [ServiceContract]
    public interface IAsyncService
    {
        [OperationContract(IsOneWay = true)]
        void Fun1(String s1);
        [OperationContract]
        void Fun2(String s2);
    }
}
