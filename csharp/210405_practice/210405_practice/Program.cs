using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _210405_practice
{
    class Program
    {
        static void Main(string[] args)
        {

            //Console.WriteLine("cm로 변환 할 inch를 입력해주세요");
            //double inch = double.Parse(Console.ReadLine());
            //Console.WriteLine(inch + "는 " + (inch*2.54) + "cm 입니다.\n");

            //Console.WriteLine("pound로 변환 할 kg를 입력해주세요");
            //double pound = double.Parse(Console.ReadLine());
            //Console.WriteLine(pound + "는 " + (pound * 2.20462262) + "cm 입니다.\n");

            //Console.WriteLine("원의 반지름을 입력해주세요");
            //double radii = double.Parse(Console.ReadLine());
            //Console.WriteLine("원 둘레는 " + (radii*3.14*2) + "cm 입니다.");
            //Console.WriteLine("원 넓이는 " + (3.14 * radii * radii) + "입니다.");

            Console.WriteLine("숫자를 2개 입력해주세요");
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int cal1, cal2, cal3;

            Console.WriteLine("1." + a);
            Console.WriteLine("2." + b);
            Console.WriteLine("3." + b % 10 * a);
            Console.WriteLine("4." + b / 10 % 10 * a);
            Console.WriteLine("5." + b / 100 * a);



        }
    }
}
