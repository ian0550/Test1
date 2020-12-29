using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsileApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            /*   int[] ab = new int[100];
               ab[0] = 10;
               *//* ab[100] = 1; // 이건 안됨 *//*
               int ex = int.Parse(Console.ReadLine());
               int[] abcd = new int[ex];
               Array.Sort(ab);
               Array.Reverse(ab);*/

            Console.WriteLine("몇개의 값을 받을건지 적으세요 : ");
            int arr = int.Parse(Console.ReadLine());
            int[] a = new int[arr];

            for (int i = 0; i < arr; i++)
            {
                Console.WriteLine( (i+1)+"값을 입력하세요 : ");
                a[i] = int.Parse(Console.ReadLine());
            }
            int temp = 0;
            int max = 0, max_num = 0;
            int min = a[0], min_num=0;
            for (int i = 0; i < arr; i++)
            {
                if (max <= a[i])
                {
                    max = a[i];
                    max_num = i+1;
                    Console.WriteLine("max a["+i+"] : "+ a[i]);
                }
                else if(min>a[i])
                {
                    min = a[i];
                    min_num = i+1;
                    Console.WriteLine("min a[" + i + "] : " + a[i]);
                }
            }
            Array.Sort(a);

            Console.WriteLine("최소값 : " + a[0] + ", 번호 : " + min_num + ", 최대값 : " + a[arr-1] + ", 번호 : " + max_num);


            Console.WriteLine("3번 문제");
            int[] ab = new int[100];
            int mul = 1;
            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine((i + 1) + "값을 입력하세요 : ");
                int num = int.Parse(Console.ReadLine());
                mul *= num;
            }
            Console.WriteLine(mul);

            //for (int i = 0; i < mul; i++)
            //{
            //    ab[i] = 
            //}
        }
    }
}
