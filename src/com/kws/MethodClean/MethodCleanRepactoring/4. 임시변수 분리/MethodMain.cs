using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodCleanRepactoring._4._임시변수_분리
{
    class MethodMain
    {
        int PrimaryForce;
        int Mass;
        int Delay;
        /// <summary>
        /// 해기스가 이동한 거리 계산
        /// </summary>
        /// <param name="pTime"></param>
        /// <returns></returns>
        double getDistanceTravelled(int pTime)
        {
            double result;
            double primaryAcc = PrimaryForce / Mass;
            int primaryTime = Math.Min(pTime, Delay);
            result = 0.5 * primaryAcc * primaryTime * primaryTime;
            int secondaryTime = pTime - Delay;
            if (secondaryTime > 0)
            {
                double primaryVel = primaryAcc * Delay;
                double secondaryAcc = (PrimaryForce + secondaryTime) / Mass;
                result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
            }
            return result;
        }
    }
}
