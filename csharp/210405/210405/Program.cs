using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _210405
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("WriteWriteLine" + Environment.NewLine);
            //모든 운영체제에서 적용 가능한 줄바꿈
            Console.WriteLine("WriteLine");
            Console.WriteLine("WriteLine");
            Console.WriteLine("WriteWrite");
            Console.WriteLine("\"Write\"");
            Console.WriteLine("\"\\\"Write\\\"\"");//escape 문자

            Console.WriteLine(1 / 2.0);
            Console.WriteLine(1.0 / 2);


            Console.WriteLine(5 + 3);
            Console.WriteLine(5 - 3);
            Console.WriteLine(5 * 3);
            Console.WriteLine(5 / 3);
            Console.WriteLine(5 % 3);

            Console.WriteLine(-4 % 3);
            Console.WriteLine(4 % -3);


            Console.WriteLine("안녕하세요"[0]);//안
            Console.WriteLine("안녕하세요"[4]);//요
            // Console.WriteLine("안녕하세요"[5]);//error
            Console.WriteLine((int)"안녕하세요"[0]);//안
            Console.WriteLine(Convert.ToString((int)"안녕하세요"[0], 16));


            Console.WriteLine(1 == 1);
            Console.WriteLine(1 != 1);
            bool result = true;
            bool result2 = false;

            Console.WriteLine(!result); //논리 부정 연산자
            Console.WriteLine(!result2);
            Console.WriteLine(result || result2);
            Console.WriteLine(result && result2);
            Console.WriteLine(result2 || result2);


            Console.WriteLine(long.MaxValue);
            Console.WriteLine(int.MaxValue);

            int a = int.MaxValue; //2147483647
            int b = int.MaxValue;
            Console.WriteLine(a + b);
            Console.WriteLine((long)a + b);

            uint c = uint.MaxValue;
            Console.WriteLine(c);

            int conclusion = 100;
            conclusion++;
            Console.WriteLine(conclusion);
            conclusion++;
            Console.WriteLine(conclusion);

            string input = Console.ReadLine();
            Console.WriteLine("안녕 나는 " + input + "이야");

            int number = int.Parse(Console.ReadLine()); //정수
            double num = double.Parse(Console.ReadLine()); //실수
            Console.WriteLine(number/num);

        }
    }
}
