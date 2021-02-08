using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CarTest_0208
{
    class Car
    {
        static string name;
        string jejo, color, price, model;

        public Car()
        {
            jejo = "기아";
            color = "블랙";
            model = "k7";
            price = "사천만원";
            name = "동대구 영업소";
        }

        public Car(string jejo, string color, string price, string model)
        {
            this.jejo = jejo;
            this.color = color;
            this.price = price;
            this.model = model;
        }

        public void printCarInfo()
        {
            Console.WriteLine("대리점명 : " + name);
            Console.WriteLine("제조사 : " + jejo);
            Console.WriteLine("색상 : " + color);
            Console.WriteLine("모델 : " + model);
            Console.WriteLine("가격 : " + price);
            Console.WriteLine("----------------------");
        }

        public string Model
        {
            get { return model; }
            set { model = value; }
        }
        public string Price
        {
            get { return price; }
            set { price = value; }
        }

    }
}

