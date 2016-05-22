using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodClean._6._메서드를_메서드_객체로_전환
{
    public class Account
    {
        int gamma(int pInpuVal, int pQuantity, int pYearDate)
        {
            int importantValue1 = (pInpuVal * pQuantity) + Delta();
            int importantValue2 = (pInpuVal * pYearDate) + 100;
            if ((pYearDate - importantValue1) > 100)
                importantValue2 -= 20;
            int importantValue3 = importantValue2 + 7;

            return importantValue3 - 2 * importantValue1;
        }

        private int Delta()
        {
            throw new NotImplementedException();
        }
    }
}
