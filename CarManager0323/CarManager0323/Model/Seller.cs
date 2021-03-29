using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CarManager0323.Model
{
    class Seller
    {
        string name;
        string tel;
        string email;
        string jikwi;
        string office_name;

        public Seller(string name, string tel, string email, string jikwi, string office_name)
        {
            this.name = name;
            this.tel = tel;
            this.email = email;
            this.jikwi = jikwi;
            this.office_name = office_name;
        }

        public string Name { get => name; set => name = value; }
        public string Tel { get => tel; set => tel = value; }
        public string Email { get => email; set => email = value; }
        public string Jikwi { get => jikwi; set => jikwi = value; }
        public string Office_name { get => office_name; set => office_name = value; }
    }
}
