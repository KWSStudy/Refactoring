using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodClean.임시변수를_메서드_호출로_전환
{
    class MethodMain
    {
        int Quantity;
        int ItemPrice;

        double getPrice()
        {
            int basePriece = Quantity * ItemPrice;
            double discountFactor;

            if (basePriece > 1000) discountFactor = 0.95;
            else discountFactor = 0.98;
            return basePriece * discountFactor;
        }
    }
}
