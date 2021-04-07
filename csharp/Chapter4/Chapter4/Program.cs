using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Chapter4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("안녕");
            Console.WriteLine("안녕");
            Console.WriteLine("안녕");
            Console.WriteLine("안녕");
            Console.WriteLine("안녕");

            for (int i = 0; i < 4; i++)
            {

                Console.WriteLine("안녕");
            }


            Console.WriteLine("안녕"+1);
            Console.WriteLine("안녕"+2);
            Console.WriteLine("안녕"+3);
            Console.WriteLine("안녕"+4);

            for (int i = 0; i < 4; i++)
                Console.WriteLine("안녕"+(i+1));

            Console.WriteLine("안녕하니"[0]);
            Console.WriteLine("안녕하니"[1]);
            Console.WriteLine("안녕하니"[2]);
            Console.WriteLine("안녕하니"[3]);

            for (int i = 0; i < 4; i++)
                Console.WriteLine("안녕하니"[i]);

            string name = "김동혁";
            string[] names = { "김동혁", "정연우", "임수환" };

            for (int i = 0; i < name.Length; i++)
            {
                Console.WriteLine(name[i]);
            }

            for (int i = 0; i < names.Length; i++)
            {
                Console.WriteLine(names[i]);
            }

            string[] hansomeguy = new string[10];

            for (int i = (int)'A'; i <= (int)'z'; i++)
            {
                Console.Write((char)i);
            }
            Console.WriteLine("..");

            for (int i = (int)'가'; i <= (int)'힣'; i++)
            {
                Console.Write((char)i);

                if (i == (int)'강')
                    break;
                if (i == (int)'힣')
                    i = (int)'가';
            }

            //while (true)
            //{
            //    Console.WriteLine(new Random().Next(int.MaxValue));
            //}

            // for
            // do while
            // while
            // c#에서는 foreach

            while (false)
            {
                Console.WriteLine("이동준");
            }
            do
            {
                Console.WriteLine("이동준");
            } while (false);

            int count = 100;
            while (count < 100)
            {
                Console.WriteLine("카운트값은 " + count + "입니다.");
            }
            do
            {
                Console.WriteLine("do while count" + count);
            } while (count < 100);

            int sum = 0;
            for (int i = 1; i <= 100; i++)
            {
                //if(i%2==0)
                //sum += i;

                //continue 이용
                if (i % 2 != 0)
                    continue;
                sum += i;
            }
            Console.WriteLine(sum);

            int countIndex = 0;
            foreach (var abcd in names)
            {
                if (countIndex == 0)
                {
                    countIndex++;
                    continue;
                }

                Console.WriteLine(abcd + " is Good man");
            }

            for (int i = 0; i < names.Length; i++)
            {
                if (i == 0)
                    continue;
                Console.WriteLine(names[i] + " is Good man");
            }

            
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
            Console.WriteLine();

            for (int i = 0; i < 10; i++)
            {
                for (int j = 10; j > i; j--)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
            Console.WriteLine();

            for (int i = 0; i < 10; i++)
            {
                for (int j = 9; j > i; j--)
                {
                    Console.Write(" ");
                }
                for (int j = 0; j < i*2+1; j++)
                {
                    Console.Write("*");
                }

                Console.WriteLine();
            }
            Console.WriteLine();

            for (int i = 0; i < 10; i++)
            {
                for (int j = 9; j > i; j--)
                {
                    Console.Write(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++)
                {
                    Console.Write("*");
                }
                
                Console.WriteLine();
            }
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    Console.Write(" ");
                }
                for (int j = 20; j > i*2+3; j--)
                {
                    Console.Write("*");
                }
                
                Console.WriteLine();
            }

            for (int i = 0; i < 5+1; i++)
            {
                for (int j = 5; j > i; j--)
                {
                    Console.Write(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++)
                {
                    Console.Write("*");
                }

                Console.WriteLine();
            }
            for (int i = 0; i < 5+1; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    Console.Write(" ");
                }
                for (int j = 10; j > i*2+1; j--)
                {
                    Console.Write("*");
                }

                Console.WriteLine();
            }

            //goto문
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("외부 반복문");
                for (int j = 0; j < 10; j++)
                {
                    Console.WriteLine("내부 반복문");
                    goto Example;
                }
            }

            Example: Console.WriteLine("go to");

            string teacher = Console.ReadLine();

            if (teacher == "이동준")
            {
                goto Example;
            }

            //ToUpper, ToLower
            string example = "exAmPle";
            Console.WriteLine(example.ToUpper());
            Console.WriteLine(example.ToLower());
            example = example.ToUpper();
            //Split
            string guys = "김동혁, 장승민, 정연우, 임수환";
            string[] guys_array = guys.Split(',');
            foreach (var item in guys_array)
            {
                Console.WriteLine(item + "님 하이");
            }
            //join - split의 반대(하나의 string변수로 뭉침)
            string guys2 = string.Join(",", guys_array);
            Console.WriteLine(guys2);
            //Trim -문자열 양 옆의 공백 제거
            string trim = " 안 녕 하 니 월 월 ";
            Console.WriteLine("!" + trim + "!");
            Console.WriteLine("!" + trim.Trim() + "!");
        }
    }
}
