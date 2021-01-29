using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calcurator
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
            textBox1.Text=totalNum;
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

        private void button0_Click(object sender, EventArgs e)
        {
            totalNum += "0";
            textBox1.Text = totalNum;
        }

        

        private void buttonPlus_Click(object sender, EventArgs e)
        {
            label1.Text = totalNum;
            num1 = Convert.ToInt32(totalNum);
            totalNum = " ";
            ch = '+';
            textBox1.Text = "";
            
        }

        private void buttonMinus_Click(object sender, EventArgs e)
        {
            label1.Text = totalNum;
            num1 = Convert.ToInt32(totalNum);
            totalNum = " ";
            ch = '-';
            textBox1.Text = "";
        }

        private void buttonMultiple_Click(object sender, EventArgs e)
        {
            label1.Text = totalNum;
            num1 = Convert.ToInt32(totalNum);
            totalNum = " ";
            ch = 'X';
            textBox1.Text = "";
        }

        private void buttonDivide_Click(object sender, EventArgs e)
        {
            label1.Text = totalNum;
            num1 = Convert.ToInt32(totalNum);
            totalNum = " ";
            ch = '/';
            textBox1.Text = "";
        }

        private void buttonEqual_Click(object sender, EventArgs e)
        {            
            num2 = Convert.ToInt32(totalNum);

            if (ch=='+')
            {
                
                result = num1 + num2;
                String res = Convert.ToString(result);
                label1.Text += " + " + totalNum + " = " + res;
                
                

            }
            else if (ch == '-')
            {
                result = num1 - num2;
                String res = Convert.ToString(result);
                label1.Text += " - " + totalNum+" = " + res; 
                
            }
            else if (ch == 'X')
            {
                
                result = num1 * num2;
                String res = Convert.ToString(result);
                label1.Text += " X " + totalNum+ " = " + res;
                

            }
            else if (ch == '/')
            {
                result = num1 / num2;
                String res = Convert.ToString(result);

                label1.Text += " / " + totalNum + " = " + res;
            }

        }

        private void buttonReset_Click(object sender, EventArgs e)
        {
            num1 = 0;
            num2 = 0;
            totalNum = "";
            textBox1.Text = "";
            label1.Text = "";
        }
    }
}
