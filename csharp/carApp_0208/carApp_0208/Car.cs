using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace carApp_0208
{
    class Car
    {
        // 클래스 상수 변수
        public const string DAERI = "동대구 영업소";

        // 인스턴스 변수
        private string company;
        private string color;
        private string price;
        private string model;

        // 기본 생성자
        public Car()
        {
            company = "기아";
            color = "블랙";
            price = "사천만원";
            model = "K7";
        }

        // 오버로딩
        // 생성자
        public Car(string company, string color, string model, string price)
        {
            this.company = company;
            this.color = color;
            this.model = model;
            this.price = price;
        }

        // propfull + 탭
        public string Company
        {
            get { return company; }
            set { company = value; }
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
        public string Color
        {
            get { return color; }
            set { color = value; }
        }

        public void showCarInfo()
        {
            Console.WriteLine("제조사 :" + company);
            Console.WriteLine("색상 :" + color);
            Console.WriteLine("모델 :" + model);
            Console.WriteLine("가격 :" + price);
            Console.WriteLine("영업소 :" + DAERI);
            Console.WriteLine("------------------------");

        }

    }
}
