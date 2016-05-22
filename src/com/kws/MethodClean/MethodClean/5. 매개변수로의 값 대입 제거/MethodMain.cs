using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodClean._5._매개변수로의_값_대입_제거
{
    class MethodMain
    {
        int discount(int pIntpuVal, int pQuantity, int pYearDate)
        {
            if (pIntpuVal > 50) pIntpuVal -= 2;
            if (pQuantity > 100) pIntpuVal -= 1;
            if (pYearDate > 10000) pIntpuVal -= 4;
            return pIntpuVal;
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
