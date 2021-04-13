using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Chap06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("함수결과"+f(int.Parse(textBox1.Text)));

        }

        private int f(int x)
        {
            return x * x + 2 * x + 1;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //함수를 쓰지 않고 해보기
            label1.Text = "" + int.Parse(textBox2.Text) * int.Parse(textBox2.Text);

            //함수를 사용해서 해보기
            MessageBox.Show(power(textBox2.Text));

            example(100, 5, 60);
        }

        private string power(string inputNumber)
        {
            return "" + int.Parse(inputNumber) * int.Parse(inputNumber);
        }

        private void example(int a, int b, int c)
        {
            int d = a + b + c;
            d = d - a + c * b;
            MessageBox.Show("d값은 " + d + "입니다.");
        }

        private void blackSwan()
        {
            MessageBox.Show("He is very good");
        }

        private double inch(int inch)
        {
            if(inch > 0)
            {
                return inch * 2.54;
            }else
            return 0;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            label3.Text = inch(int.Parse(textBox5.Text)).ToString()+"cm";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            int r = int.Parse(textBox7.Text);
            double doolle_answer = doolle(r);
            if (doolle_answer == -1)
                return;
            double area_answer = area(r);
            if (area_answer == -1)
                return;
        }
        private double doolle(int r)
        {
            if (r < 0)
            {
                MessageBox.Show(r+"은 음수입니다.");
                return -1;
            }
            else
            {
                return 2 * 3.14 * r;
            }
        }

        private double area(int r)
        {
            if (r < 0)
            {
                MessageBox.Show(r+"은 음수입니다.");
                return -1;
            }
            else
                return 
        }
    }
}
