using adressTest0218.control;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace adressTest0218
{
    class Program
    {
        //static Student stud;
        const int MENU_ADD = 1;
        const int MENU_VIEW = 2;
        const int MUNU_RANDOM_ADD = 3;
        const int MENU_DELETE = 4;
        const int MENU_UPDATE = 5;
        const int MENU_DELETE_ALL = 6;
        //const int MENU_ADD_ID = 6;
        const int MENU_DELETE_ID = 7;
        const int MUNU_EXIT = 8;

        //static List<Student> addrList = new List<Student>();


        static void Main(string[] args)
        {
            //stud = Student.getInst();

            //Student st = null;
            StudentHandler sh = new StudentHandler();
            while (true)
            {
                switch (getMenu())
                {
                    case MENU_ADD:
                        Console.WriteLine("정보추가");
                        //st = addItem();
                        sh.addItem();
                        break;
                    case MENU_VIEW:
                        Console.WriteLine("정보 보기");
                        sh.viewItem();
                        break;
                    case MUNU_RANDOM_ADD:
                        Console.WriteLine("랜덤데이터 추가");
                        sh.randDataID();
                        break;
                    case MENU_DELETE:
                        Console.WriteLine("이름으로 정보 삭제");
                        sh.delItem();
                        break;
                    case MENU_UPDATE:
                        Console.WriteLine("주소록 정보 수정");
                        sh.updateItem(); 
                        break;
                    case MENU_DELETE_ALL:
                        Console.WriteLine("모든 데이터 삭제");
                        sh.delItemAll();
                        break;
                    //case MENU_ADD_ID:
                    //    delItemAll();
                    //    break;
                    case MENU_DELETE_ID:
                        Console.WriteLine("아이디로 데이터 삭제");
                        sh.delItemID();
                        break;
                    case MUNU_EXIT:
                        Environment.Exit(0);
                        break;
                }
            }
        }

        

        public static int getMenu()
        {
            Console.WriteLine("----------------------");
            Console.WriteLine("1.주소록 정보 추가");
            Console.WriteLine("2.주소록 정보 보기");
            Console.WriteLine("3.주소록 랜덤 추가");
            Console.WriteLine("4.주소록 정보 삭제");
            Console.WriteLine("5.주소록 정보 수정");
            Console.WriteLine("6.전체 데이터 삭제");
            Console.WriteLine("7.종료");
            Console.WriteLine("----------------------");
            Console.WriteLine("메뉴 선택 : ");
            int menu = Convert.ToInt32(Console.ReadLine());
            return menu;
        }

        //public static void randData()
        //{
        //    string[] name = { "홍길동", "김길동", "이길동", "박길동", "최길동" };
        //    string[] tel = { "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555" };
        //    string[] adress = { "대구시 동구 신암동", "서울시 동구 신암동", "대전시 동구 신암동", "부산시 동구 신암동", "광주시 동구 신암동" };
        //    string[] email = { "hong@naver.com", "kim@naver.com", "lee@naver.com", "park@naver.com", "choi@naver.com" };

        //    Random r = new Random();
        //    for(int i=0; i<5; i++)
        //    {
        //        addrList.Add(new Student(name[r.Next(0, 5)], tel[r.Next(0, 5)], adress[r.Next(0, 5)], email[r.Next(0, 5)]));
        //    }
        //}

        


        
    }
}
