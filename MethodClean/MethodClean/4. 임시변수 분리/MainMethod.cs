using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodClean.임시변수_분리
{
    class MainMethod
    {
        int PrimaryForce;
        int Mass;
        int Delay;
        double getDistanceTravelled(int pTime)
        {
            double result;
            double acc = PrimaryForce / Mass; //초기 가속도 저장
            int primaryTime = Math.Min(pTime, Delay);
            result = 0.5 * acc * primaryTime * primaryTime;
            int secondaryTime = pTime - Delay;
            if (secondaryTime > 0)
            {
                double primaryVel = acc * Delay;
                acc = (PrimaryForce + secondaryTime) / Mass; //두 번째 힘으로 생긴 가속 더한 값 저장
                result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
            }
            return result;
        }
    }
}
