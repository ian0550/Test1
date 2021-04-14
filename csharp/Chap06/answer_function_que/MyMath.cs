using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace answer_function_que
{
    class MyMath
    {
        public int end;
        public static int Power(int input)
        {
            return input * input;
        }
        public static int Power(int input, int count)
        {
            for (int i = 0; i < count; i++)
            {
                input *= input;
            }
            return input;
        }
        public static int SumAll(int end)
        {
            int sum = 0;
            for (int i = 0; i <= end; i++)
            {
                sum += i;
            }
            return sum;
        }
        public static int SumAll(int start, int end)
        {
            int sum=0;
            for (int i = start; i <= end; i++)
            {
                sum += i;
            }
            return sum;
        }

        public int SumAll()
        {
            int sum = 0;
            for (int i = 0; i < this.end; i++)
            {
                sum += i;
            }
            return sum;
        }

        private int abc;
        public int getABC()
        {
            return abc;
        }
    }
}
