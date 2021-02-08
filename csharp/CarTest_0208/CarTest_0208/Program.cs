using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace CarTest_0208
{
    class Program
    {
        static void Main(string[] args)
        {
            Car car = new Car();
            car.printCarInfo();

            Car car2 = new Car("현대", "흰색", "이천만원", "아반떼");
            car2.printCarInfo();
        }
    }
}
