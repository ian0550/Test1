using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Study0407
{
    class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("5개의 숫자를 입력하라: ");
            //int[] num = new int[5];
            //for (int i = 0; i < num.Length; i++)
            //{
            //    num[i] = int.Parse(Console.ReadLine());
            //}
            //int min = num[0];
            //int max = num[0];
            //for (int i = 1; i < num.Length; i++)
            //{
            //    if(min > num[i])
            //    {
            //        min = num[i];
            //    }
            //    if (max < num[i])
            //    {
            //        max = num[i];
            //    }
            //}
            //Console.WriteLine("min : " + min);
            //Console.WriteLine("max : " + max);

            int[] seq = new int[10];
            seq[0] = 1;
            seq[1] = 1;
            
            for (int i = 0; i < 20; i++)
            {
                int count = 1;
                if (seq[i + 1] != 0 && seq[i] == seq[i + 1])
                {
                    count++;
                }
                if (seq[i + 2] == 0)
                {
                    seq[i + 2] = count;
                    i = 0;
                }
            }
        }
    }
}
