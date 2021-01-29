using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Clacurator2
{
    public partial class Form1 : Form
    {
        String totalNum = " ";
        int num1 = 0;
        int num2 = 0;
        char ch = ' ';
        int result = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            totalNum += "1";
            textBox1.Text = totalNum;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            totalNum += "2";
            textBox1.Text = totalNum;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            totalNum += "3";
            textBox1.Text = totalNum;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            totalNum += "4";
            textBox1.Text = totalNum;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            totalNum += "5";
            textBox1.Text = totalNum;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            totalNum += "6";
            textBox1.Text = totalNum;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            totalNum += "7";
            textBox1.Text = totalNum;
        }

        private void button8_Click(object sender, EventArgs e)
        {
            totalNum += "8";
            textBox1.Text = totalNum;
        }

        private void button9_Click(object sender, EventArgs e)
        {
            totalNum += "9";
            textBox1.Text = totalNum;
        }

        private void button10_Click(object sender, EventArgs e)
        {
            totalNum += "0";
            textBox1.Text = totalNum;
        }
    }
}
