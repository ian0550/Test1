﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using adressTest0218.util;

namespace adressTest0218.control
{
    class StudentCtrl
    {
        static List<Student> addrList =
            new List<Student>();
        static Random r = new Random();
        RandData rand = new RandData(r);

        public StudentCtrl()
        {
            //r = new Random();
            rand = new RandData(new Random());
        }
        public void addItem()
        {
            Console.WriteLine("-----------------");
            Console.WriteLine("주소록 정보 입력");
            Console.WriteLine("-----------------");
            Console.Write("이름: ");
            string name = Console.ReadLine();
            Console.Write("전화: ");
            string tel = Console.ReadLine();
            Console.Write("주소: ");
            string address = Console.ReadLine();
            Console.Write("이메일: ");
            string email = Console.ReadLine();

            addrList.Add(
                new Student(rand.getId(), name, tel, address, email));
            Console.WriteLine("정보가 정상적으로 입력되었습니다.");
        }
        public void viewItem()
        {
            for (int i = 0; i < addrList.Count; i++)
            {
                Console.WriteLine("번호: " + (i + 1));
                Console.WriteLine("ID : " + addrList[i].Id);
                Console.WriteLine("이름: " + addrList[i].Name);
                Console.WriteLine("전화: " + addrList[i].Tel);
                Console.WriteLine("주소: " + addrList[i].Address);
                Console.WriteLine("이메일: " + addrList[i].Email);
                Console.WriteLine("-------------------------");
            }
        }
        

        public void delItem(string name)
        {
            for (int i = 0; i < addrList.Count; i++)
            {
                if (name.Equals(addrList[i].Name))
                {
                    addrList.RemoveAt(i--);
                }
            }
        }
        public void delItemAll()
        {
            addrList.Clear();
        }

        public void randData(int count)
        {

            for (int i = 0; i < count; i++)
            {
                addrList.Add(new Student(rand.getId(), rand.getName(), 
                    rand.getTel(), rand.getAddr(), rand.getEmail()));
            }
        }

        public void updateItem(int menu)
        {
            switch (menu)
            {
                case 1:
                    Console.WriteLine("변경할 이름을 입력해주세요: );
            }
        }
    }
}
