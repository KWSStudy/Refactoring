using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring.임시변수를_메서드_호출로_전환
{
    class MethodMain
    {
        int Quantity;
        int ItemPrice;

        double getPrice()
        {
            return basePrice() * DiscountFactor();
        }

        private double DiscountFactor()
        {
            if (basePrice() > 1000) return 0.95;
            else return 0.98;
        }

        private int basePrice()
        {
            return Quantity * ItemPrice;
        }
    }
}
