using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DescriptFunction
{
    class MyMath
    {
        public static int Power(int input)
        {
            return input * input;
        }
        public int Power(int input, int count)
        {
            for (int i = 0; i < count; i++)
            {
                input *= input;
            }
            return input;
        }
        public int SumAll(int end)
        {
            int sum = 0;
            for (int i = 0; i < end; i++)
            {
                sum += i;
            }
            return sum;
        }
        public int SumAll(int start, int end)
        {
            for (int i = start; i < end; i++)
            {
                start += i;
            }
            return start;
        }
    }
}
