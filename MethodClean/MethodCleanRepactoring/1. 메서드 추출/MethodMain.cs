using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring.메서드_추출
{
    public class MethodMain
    {
        static OrderList OrderList = new OrderList();
        private static MethodMain mgr = null;
        public MethodMain()
        {
            mgr = new MethodMain();
        }
        public static void PrintOwing(double pPreviousAmount)
        {
            PrintBanner();
            double outstanding = getOutsstanding(pPreviousAmount * 1.2);
            PrintDetails(outstanding);
            Console.ReadKey();
        }
        /// <summary>
        /// 지역변수를 다시 대입
        /// Step1. 상위 계층의 지역변수가 이 메서드 안에서만 쓰이기 때문에
        /// Step2. 지역변수를 추출한 코드에서만 선언.
        /// Step3. 반환값의 이름 변경
        /// </summary>
        /// <param name="enumGet"></param>
        /// <param name="outstanding"></param>
        /// <returns></returns>
        private static double getOutsstanding(double pInitalValue)
        {
            double resultAmount = pInitalValue;
            IEnumerator enumGet = ((IEnumerable)OrderList).GetEnumerator();

            while (enumGet.MoveNext())
            {
                Order each = (Order)enumGet.Current;
                resultAmount = each.getAmount();
            }
            return resultAmount;
        }
        /// <summary>
        /// 지역변수 사용 (읽히기만 할때)
        /// </summary>
        /// <param name="outstanding"></param>
        private static void PrintDetails(double outstanding)
        {
            foreach (Order pOrder in OrderList)
            {
                Console.WriteLine("고객명" + pOrder.Name);
                Console.WriteLine("외상액" + outstanding);
            }
        }
        /// <summary>
        /// 지역변수 사용 안함(제일 간단한 구조)
        /// </summary>
        private static void PrintBanner()
        {
            Console.WriteLine("*****************");
            Console.WriteLine("****고객외상*****");
            Console.WriteLine("*****************");
        }
    }
}
