using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Chapter5_0412
{
    public partial class Pro2 : Form
    {
        int my=0;
        int com=0;
        public Pro2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int c = RPS();
            if (c == 0)
            {
                label2.Text = "비김";
            }
            else if (c == 1)
            {
                label2.Text = "짐";
                com++;
            }
            else
            {
                label2.Text = "이김";
                my++;
            }
            score();
        }

        public int RPS()
        {
            Random r = new Random();
            int a = r.Next(0, 3);
            if (a==0)
            {
                label3.Text = "가위";
            }
            else if (a==1)
            {
                label3.Text = "바위";
            }
            else
            {
                label3.Text = "보";
            }
            return a;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int c = RPS();
            if (c == 0)
            {
                label2.Text = "이김";
                my++;
            }
            else if (c == 1)
            {
                label2.Text = "비김";
            }
            else
            {
                label2.Text = "짐";
                com++;
            }
            score();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            int c = RPS();
            if (c == 0)
            {
                label2.Text = "짐";
                com++;
            }
            else if (c == 1)
            {
                label2.Text = "이김";
                my++;
            }
            else
            {
                label2.Text = "비김";
            }
            score();
        }

        public void score()
        {
            label4.Text = my.ToString();
            label6.Text = com.ToString();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            my = 0;
            com = 0;
            score();
        }
    }
}
