using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using adressTest0218.control;
using adressTest0218.view;

namespace adressTest0218
{
    class Program
    {
        static void Main(string[] args) {
            Menu m = new Menu();
            StudentCtrl sc = new StudentCtrl();

            while (true) {
                switch (m.mainMenu()) {
                    case Menu.MENU_MAIN_ADD:
                        sc.addItem();
                        break;
                    case Menu.MENU_MAIN_VIEW:
                        sc.viewItem();
                        break;
                    case Menu.MENU_MAIN_RANDOM_ADD:
                        sc.randData(5);
                        break;
                    case Menu.MENU_MAIN_DELETE:
                        sc.delItem(m.delMenu());
                        break;
                    case Menu.MENU_MAIN_DELETE_ALL:
                        sc.delItemAll();
                        break;
                    case Menu.MENU_MAIN_UPDATE:
                        sc.updateItem(m.updateMenu());
                        break;
                    case Menu.MENU_MAIN_EXIT:
                        Console.WriteLine("프로그램 종료");
                        Environment.Exit(0);
                        break;
                    case Menu.MENU_MAIN_FORMAT_ERROR:
                        break;
                    default:
                        Console.WriteLine("잘못된 입력입니다.");
                        break;

                }
            }
        }

        

       

        

        //public static void randData()
        //{
        //    string[] name =
        //        {"홍길동", "김길동",
        //        "이길동", "박길동", "최길동"};
        //    string[] tel = {"010-1111-1111",
        //        "010-2222-2222", "010-2222-3333",
        //        "010-2222-4444", "010-2222-5555"};
        //    string[] address = {"대구시 동구 신암동",
        //        "광주시 동구 신암동", "서울시 동구 신암동",
        //        "대전시 동구 신암동", "부산시 동구 신암동"};
        //    string[] email = {"hong@naver.com",
        //        "kim@naver.com", "lee@naver.com",
        //        "park@naver.com", "choi@naver.com"};

        //    Random r = new Random();
        //    for (int i = 0; i < 10; i++)
        //    {
        //        addrList.Add(new Student(
        //            name[r.Next(0, 5)],
        //            tel[r.Next(0, 5)],
        //            address[r.Next(0, 5)],
        //            email[r.Next(0, 5)]));
        //    }
        //}

        //static void delItem()
        //{
        //    Console.WriteLine("-----------------");
        //    Console.WriteLine("주소록 정보 삭제");
        //    Console.WriteLine("-----------------");
        //    Console.Write("삭제할 이름: ");
        //    string name = Console.ReadLine();

        //    for (int i=0; i<addrList.Count; i++)
        //    {
        //        if (name.Equals(addrList[i].Name))
        //        {
        //            addrList.RemoveAt(i--);
        //        }
        //    }

        //    /*
        //    int cnt = 0;
        //    while (cnt < addrList.Count)
        //    {
        //        if (name.Equals(addrList[cnt].Name))
        //        {
        //            addrList.RemoveAt(cnt);
        //        }
        //        else
        //        {
        //            cnt++;
        //        }
        //    }
        //    */
        //}

        
    }
}
