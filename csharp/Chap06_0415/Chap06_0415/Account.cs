using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Chap06_0415
{
    class Account
    {
        public int myMoney;
        public string name;

        public Account(int money, string name)
        {
            this.myMoney = money;
            this.name = name;
        }

        public void deposit(int money)
        {
            myMoney += money;
        }
        public void withdraw(int money)
        {
            myMoney -= money;
        }
    }
}
