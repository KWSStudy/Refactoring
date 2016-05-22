using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring._5._매개변수로의_값_대입_제거
{
    class MethodMain
    {
        int discount(int pIntpuVal, int pQuantity, int pYearDate)
        {
            int result = pIntpuVal;
            if (pIntpuVal > 50) result -= 2;
            if (pQuantity > 100) result -= 1;
            if (pYearDate > 10000) result -= 4;
            return result;
        }

        public static void main(String[] args)
        {
            int x = 5;
            triple(x);
            Console.WriteLine("triple메서드 실행 후 x 값 : " + x);
        }

        private static void triple(int pArg)
        {
            pArg = pArg * 3;
            Console.WriteLine("triple메서드 실행 안 x 값 : " + pArg);
        }
    }
}
