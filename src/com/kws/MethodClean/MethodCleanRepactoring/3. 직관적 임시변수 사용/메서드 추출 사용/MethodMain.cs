using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring.직관적_임시변수_사용.메서드_추출_사용
{
    class MethodMain
    {
        int Quantity;
        int ItemPrice;

        double Price()
        {
            //결제액(price) = 총 구매액(base price) - 
            //대량 구매 할인(quantity discount) + 배송비(shipping)
            return basePrice() - quantityDiscount() + shipping();
        }

        private double shipping()
        {
            return Math.Min(Quantity * ItemPrice * 0.1, 100.0);
        }

        private double quantityDiscount()
        {
            return Math.Max(0, Quantity - 500) * ItemPrice * 0.05;
        }

        private int basePrice()
        {
            return Quantity * ItemPrice;
        }
    }
}
