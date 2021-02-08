using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace carApp_0208
{
    class Program
    {
        static void Main(string[] args)
        {
            Car c = new Car();
            c.showCarInfo();

            Car c2 = new Car("현대", "흰색", "G80", "6천만원");
            c2.showCarInfo();
        }
    }
}
