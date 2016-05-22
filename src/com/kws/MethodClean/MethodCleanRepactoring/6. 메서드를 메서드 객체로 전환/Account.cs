using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring._6._메서드를_메서드_객체로_전환
{
    public class Account
    {
        int gamma(int pInpuVal, int pQuantity, int pYearDate)
        {
            return new Gamma(this, pInpuVal, pQuantity, pYearDate).Compute();
        }
        internal int Delta()
        {
            throw new NotImplementedException();
        }
    }
}
