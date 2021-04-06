using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Chapter3
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            //if (name == "손우혁")
            {
                Console.WriteLine("마마무 짱");
            }

            int a = 100;
            if (a > 50)
            {
                Console.WriteLine("크다");
            }
            else
            {
                Console.WriteLine("작다");
            }
            if (a > 50)
            {
                Console.WriteLine("크다");
            }
            if (a < 50)
            {
                Console.WriteLine("작다");
            }
            Console.WriteLine("숫자를 입력하세요");
            int n = int.Parse(Console.ReadLine());
            if (n%2 == 0)
            {
                Console.WriteLine("짝수입니다.");
            }
            else
            {
                Console.WriteLine("홀수 입니다.");
            }

            if (a > 0)
            {
                Console.WriteLine("a의 값이 양수");
                if (a > 50)
                {
                    Console.WriteLine("a의 값이 50초과");
                }
                else
                {
                    Console.WriteLine("a의 값이 50미만");
                }
            }
            else
            {
                Console.WriteLine("a는 음수입니다.");
                if (a > -50)
                {
                    Console.WriteLine("a는 -50보다 큽니다.");
                }
                else
                {
                    Console.WriteLine("a는 -50보다 작습니다.");
                }
            }

            int b = 100;
            if(b < 50)
            {
                Console.WriteLine("b는 50보다 작습니다.");
            }
            else if (b < 70)
            {
                Console.WriteLine("b는 70보다 작습니다.");
            }
            else
            {
                Console.WriteLine("b의 값은 " + b + "입니다.");
            }

            int dice = 3;
            switch (dice)
            {
                case 1:
                    Console.WriteLine("주사위 : 1");
                    break;
                case 2:
                    Console.WriteLine("주사위 : 2");
                    break;
                case 3:
                    break;
                case 4:
                case 5:
                case 6:
                    Console.WriteLine("주사위 : 3,4,5,6");
                    break;
                default:
                    Console.WriteLine("1~6 중 하나가 아님");
                    break;
            }

            if(dice == 1)
            {
                Console.WriteLine("주사위 : 1");
            }else if(dice == 2)
            {
                Console.WriteLine("주사위 : 2");
            }
            else if (dice == 3)
            {
            }
            else if(dice == 4 || dice == 5 || dice == 6)
            {
                Console.WriteLine("주사위 : 3,4,5,6");
            }
            else
            {
                
            }

            int keyCm = 173;
            //키가 170~180 : 애매함
            //if(170 <= keyCm < 180 ) //이렇게 적으면 안 됨

            if (keyCm >= 170)
            {
                if(keyCm < 180)
                    Console.WriteLine("루저인데 애매함");
            }

            if (keyCm>=170 && keyCm<180) //논리곱
                Console.WriteLine("루저인데 애매함");

            if (keyCm<100 || keyCm>200) //논리합
                Console.WriteLine("너무 작거나 크다");

            if (keyCm >= 100 ^ keyCm >= 200) //XOR
                Console.WriteLine("");

            //삼항연산자
            //간단한 조건식은 한 줄로 다 표현함
            //얘네 둘이 같은 코드
            int c = a % 2 == 0 ? -1 : 0;

            if (a % 2 == 0)
                c = -1;
            else
                c = 0;

            //string에 특정한 문장 혹은 글자가 있을 때
            string dj = "이동준";
            if (dj.Contains("동"))
                Console.WriteLine("동태");
            if(dj.Contains("이동"))
                Console.WriteLine("Move준");


            Console.WriteLine("연도를 입력 :");
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
            Console.WriteLine("월을 입력 : ");
            int mon = int.Parse(Console.ReadLine());
            switch (mon)
            {
                case 12:
                case 1:
                case 2:
                    Console.WriteLine("겨울");
                    break;
                case 3:
                case 4:
                case 5:
                    Console.WriteLine("봄");
                    break;
                case 6:
                case 7:
                case 8:
                    Console.WriteLine("여름");
                    break;
                case 9:
                case 10:
                case 11:
                    Console.WriteLine("가을");
                    break;
                default:
                    Console.WriteLine("정확한 월이 아님");
                    break;
            }
        }
    }
}
