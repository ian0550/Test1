using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lotto
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int[] num = new int[7];
            Random r = new Random();

            for (int i = 0; i < 7; i++)
            {
                num[i] = r.Next(1, 7);
                for (int j = 1; j < i; j++)
                {
                    if (num[i] == num[j])
                    {
                        i--;
                        break;
                    }
                }
            }

            label_num1.Text = num[1].ToString();
            label_num2.Text = num[2].ToString();
            label_num3.Text = num[3].ToString();
            label_num4.Text = num[4].ToString();
            label_num5.Text = num[5].ToString();
            label_num6.Text = num[6].ToString();
        }
    }
}
