using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodClean
{
    public class Order 
    {
        public Order()
        {
            Name = "조아라";
            Amount = 4000;
        }
        public String Name
        {
            get;
            set;
        }
        public double Amount
        {
            get;
            set;
        }

        internal double getAmount()
        {
            return Amount * 0.5;
        }
    }
}
