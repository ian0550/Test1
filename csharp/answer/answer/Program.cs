using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace answer
{
    class Program
    {
        static void Main(string[] args)
        {
            int year = int.Parse(Console.ReadLine());
            switch (year % 12)
            {
                case 0:
                    Console.WriteLine("원숭이띠");
                    break;
                case 1:
                    Console.WriteLine("닭띠");
                    break;
                case 2:
                    Console.WriteLine("개띠");
                    break;
                case 3:
                    Console.WriteLine("돼지띠");
                    break;
                case 4:
                    Console.WriteLine("쥐띠");
                    break;
                case 5:
                    Console.WriteLine("소띠");
                    break;
                case 6:
                    Console.WriteLine("호랑이띠");
                    break;
                case 7:
                    Console.WriteLine("토끼띠");
                    break;
                case 8:
                    Console.WriteLine("용띠");
                    break;
                case 9:
                    Console.WriteLine("뱀띠");
                    break;
                case 10:
                    Console.WriteLine("말띠");
                    break;
                case 11:
                    Console.WriteLine("양띠");
                    break;
                default:
                    break;
            }

            while (true)
            {
                Console.WriteLine("시간을 입력해주세요 :");
                int h = int.Parse(Console.ReadLine());
                Console.WriteLine("분을 입력해주세요 :");
                int m = int.Parse(Console.ReadLine()) - 45;

                if (m >= 0)
                {
                    Console.WriteLine("알람시간 : " + h + "시 " + m + "분");
                }
                else
                {
                    h -= 1;
                    m = 60 + m;
                    if(h==0)
                    {
                        h = 12;
                    }
                    Console.WriteLine("알람시간 : " + h + "시 " + m + "분");
                }
            }
            

        }
    }
}
