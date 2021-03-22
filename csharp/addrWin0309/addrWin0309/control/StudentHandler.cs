using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace adressTest0218.control
{
    class StudentHandler
    {
        static StudentHandler inst;

        static Random r = new Random();

        List<Student> addrList = new List<Student>();

        public List<Student> getList()
        {
            return addrList;
        }

        public static StudentHandler getInst()
        {
            if(inst == null)
            {
                inst = new StudentHandler();
            }
            return inst;
        }
        public void randData(int count)
        {
            string[] name = { "홍길동", "김길동", "이길동", "박길동", "최길동" };
            string[] tel = { "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555" };
            string[] adress = { "대구시 동구 신암동", "서울시 동구 신암동", "대전시 동구 신암동", "부산시 동구 신암동", "광주시 동구 신암동" };
            string[] email = { "hong@naver.com", "kim@naver.com", "lee@naver.com", "park@naver.com", "choi@naver.com" };

            //Random r = new Random();
            for (int i = 0; i < count; i++)
            {
                addrList.Add(new Student(getId(), name[r.Next(0, 5)], tel[r.Next(0, 5)], adress[r.Next(0, 5)], email[r.Next(0, 5)]));
            }
        }
        public void addItem()
        {
            Console.WriteLine("----------------------");
            Console.WriteLine("주소록 정보 입력 ");
            Console.WriteLine("----------------------");
            Console.Write("ID : ");
            string id = getId();
            Console.Write("이름 : ");
            string name = Console.ReadLine();
            Console.Write("전화 : ");
            string tel = Console.ReadLine();
            Console.Write("주소 : ");
            string address = Console.ReadLine();
            Console.Write("이메일 : ");
            string email = Console.ReadLine();
            //Student st = new Student(name, tel, address, email);
            //return new Student(name, tel, address, email);
            addrList.Add(new Student(id, name, tel, address, email));

        }

        public void viewItem()
        {
            if(addrList.Count == 0)
            { MessageBox.Show("데이터가 없습니다."); return; }
            for (int i = 0; i < addrList.Count; i++)
            {
                Console.WriteLine(i + 1 + "번-------------------");
                Console.WriteLine("이름 : " + addrList[i].Name);
                Console.WriteLine("전화 : " + addrList[i].Tel);
                Console.WriteLine("주소 : " + addrList[i].Address);
                Console.WriteLine("이메일 : " + addrList[i].Email);
                Console.WriteLine("ID : " + addrList[i].Id);
                Console.WriteLine("----------------------");
            }
        }

        public void delItem(string cnt)
        {
            //Console.WriteLine("------------------");
            //Console.WriteLine("주소록 정보 삭제");
            //Console.WriteLine("------------------");
            //Console.WriteLine("삭제할 이름: ");

            string name = cnt;

            for (int i = 0; i < addrList.Count; i++)
            {
                if (cnt.Equals(addrList[i].Name))
                {
                    addrList.RemoveAt(i);
                    i = -1;
                }
            }
        }
        public void delItemID()
        {
            Console.WriteLine("------------------");
            Console.WriteLine("주소록 정보 삭제");
            Console.WriteLine("------------------");
            Console.WriteLine("삭제할 ID : ");

            string id = Console.ReadLine();

            for (int i = 0; i < addrList.Count; i++)
            {
                if (id.Equals(addrList[i].Id))
                {
                    addrList.RemoveAt(i);
                    i = -1;
                }
            }
        }

        public void delItemAll()
        {
            addrList.Clear();
        }

        public string getId()
        {
            //Random r = new Random();
            string rdata = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "!@#$%^&*()";
            StringBuilder rs = new StringBuilder();
            for (int i = 0; i < 10; i++)
            {
                rs.Append(rdata[(int)(r.NextDouble() * rdata.Length)]);

            }
            //Console.WriteLine("id : " + rs.ToString());
            return rs.ToString();
        }

        public void updateItem()
        {
            Console.WriteLine("수정할 아이디를 입력해주세요 : ");
            string id = Console.ReadLine();

            Console.WriteLine("수정할 목록을 알려주세요 : ");
            Console.WriteLine("1. 이름 ");
            Console.WriteLine("2. 전화번호 ");
            Console.WriteLine("3. 주소 ");
            Console.WriteLine("4. 이메일 ");
            string change = Console.ReadLine();

            switch (change)
            {
                case "1":
                    for (int i = 0; i < addrList.Count; i++)
                    {
                        if (id.Equals(addrList[i].Id))
                        {
                            Console.WriteLine("수정 할 이름 입력 : ");
                            string data = Console.ReadLine();
                            addrList[i].Name = data;
                            break;
                        }
                    }
                    break;
                case "2":
                    for (int i = 0; i < addrList.Count; i++)
                    {
                        if (id.Equals(addrList[i].Id))
                        {
                            Console.WriteLine("수정 할 전화번호 입력 : ");
                            string data = Console.ReadLine();
                            addrList[i].Tel = data;
                            break;
                        }
                    }
                    break;
                case "3":
                    for (int i = 0; i < addrList.Count; i++)
                    {
                        if (id.Equals(addrList[i].Id))
                        {
                            Console.WriteLine("수정 할 주소 입력 : ");
                            string data = Console.ReadLine();
                            addrList[i].Address = data;
                            break;
                        }
                    }
                    break;
                case "4":
                    for (int i = 0; i < addrList.Count; i++)
                    {
                        if (id.Equals(addrList[i].Id))
                        {
                            Console.WriteLine("수정 할 이메일 입력 : ");
                            string data = Console.ReadLine();
                            addrList[i].Email = data;
                            break;
                        }
                    }
                    break;
                default:
                    Console.WriteLine("존재하지 않는 주소록 목록입니다.");
                    break;
            }
        }
    }
}
