using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring
{
    public class Order 
    {
        public Order()
        {


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
