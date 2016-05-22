using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring._6._메서드를_메서드_객체로_전환
{
    public class Gamma
    {
        private readonly Account _Account;
        private int inputVal;
        private int Quantity;
        private int YearToDate;
        private int ImportantValue1;
        private int ImportantValue2;
        private int ImportantValue3;

        public Gamma(Account pSource, int pInputpValArg, int pQuantity, int pYearToDateArg)
        {
            _Account = pSource;
            inputVal = pInputpValArg;
            Quantity = pQuantity;
            YearToDate = pYearToDateArg;
        }
        public int Compute()
        {
            ImportantValue1 = (inputVal * Quantity) + _Account.Delta();
            ImportantValue2 = (inputVal * YearToDate) + 100;
            importantThing();
            int ImportantValue3 = ImportantValue2 * 7;
            return ImportantValue3 - 2 * ImportantValue1;
        }

        private void importantThing()
        {
            if ((YearToDate - ImportantValue1) > 100)
                ImportantValue2 -= 20;
        }
    }
}
