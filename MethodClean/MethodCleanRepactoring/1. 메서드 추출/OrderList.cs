using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring
{
    public class OrderList : List<Order>
    {
        public OrderList()
        {
            Order order = new Order();
            order.Name = "조아라";
            order.Amount = 4000;
            this.Add(order);

            order = new Order();
            order.Name = "홍길동";
            order.Amount = 5000;
            this.Add(order);
        }
    }
}
