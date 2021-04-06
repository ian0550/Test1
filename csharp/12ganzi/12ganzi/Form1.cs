using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _12ganzi
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int year = int.Parse(yeartext.Text);
            ganzi(year);
            
        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            
        }

        public void ganzi(int year)
        {
            switch (year % 12)
            {
                case 0:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\0.png");
                    MessageBox.Show("원숭이띠");
                    label2.Text = "원숭이띠";
                    Console.WriteLine("원숭이띠");
                    break;
                case 1:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\1.png");
                    MessageBox.Show("닭띠");
                    label2.Text = "닭띠";
                    Console.WriteLine("닭띠");
                    break;
                case 2:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\2.png");
                    MessageBox.Show("개띠");
                    label2.Text = "개띠";
                    Console.WriteLine("개띠");
                    break;
                case 3:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\3.png");
                    MessageBox.Show("돼지띠");
                    label2.Text = "돼지띠";
                    Console.WriteLine("돼지띠");
                    break;
                case 4:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\4.png");
                    MessageBox.Show("쥐띠");
                    label2.Text = "쥐띠";
                    Console.WriteLine("쥐띠");
                    break;
                case 5:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\5.png");
                    MessageBox.Show("소띠");
                    label2.Text = "소띠";
                    Console.WriteLine("소띠");
                    break;
                case 6:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\6.png");
                    MessageBox.Show("호랑이띠");
                    label2.Text = "호랑이띠";
                    Console.WriteLine("호랑이띠");
                    break;
                case 7:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\7.png");
                    MessageBox.Show("토끼띠");
                    label2.Text = "토끼띠";
                    Console.WriteLine("토끼띠");
                    break;
                case 8:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\8.png");
                    MessageBox.Show("용띠");
                    label2.Text = "용띠";
                    Console.WriteLine("용띠");
                    break;
                case 9:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\9.png");
                    MessageBox.Show("뱀띠");
                    label2.Text = "뱀띠";
                    Console.WriteLine("뱀띠");
                    break;
                case 10:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\10.png");
                    MessageBox.Show("말띠");
                    label2.Text = "말띠";
                    Console.WriteLine("말띠");
                    break;
                case 11:
                    pictureBox1.Load(@"D:\\Test1\\csharp\\12ganzi\\11.png");
                    MessageBox.Show("양띠");
                    label2.Text = "양띠";
                    Console.WriteLine("양띠");
                    break;
                default:
                    break;
            }
        }

        private void yeartext_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                this.button1_Click(sender, e);
            }
        }
    }
}
