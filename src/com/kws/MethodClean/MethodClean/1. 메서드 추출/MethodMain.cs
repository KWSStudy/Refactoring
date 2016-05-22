using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodClean.메서드_추출
{
    public class MethodMain
    {
        static Order OrderVO = new Order();
        private static MethodMain mgr = null;
        public MethodMain()
        {
            mgr = new MethodMain();
        }
        /// <summary>
        /// 1. 선언
        /// 2. 출력
        /// 3. 조건문
        /// 4. 출력
        /// </summary>
        public static void PrintOwing()
        {
            IEnumerator enumGet = ((IEnumerable)OrderVO).GetEnumerator();

            double outstanding = 0.0;

            Console.WriteLine("*****************");
            Console.WriteLine("****고객외상*****");
            Console.WriteLine("*****************");

            while (enumGet.MoveNext())
            {
                Order each = (Order)enumGet.Current;
                outstanding = each.getAmount();
            }

            Console.WriteLine("고객명" + OrderVO.Name);
            Console.WriteLine("외상액" + outstanding);
            
            Console.ReadKey();
        }
    }
}
