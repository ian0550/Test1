using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace answer_function_que
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }
        private void button3_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox3.Text, out int end);
            MessageBox.Show("0부터 " +end + "까지의 합은 " +MyMath.SumAll(end));
        }

        private void button4_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox3.Text, out int start);
            int.TryParse(textBox4.Text, out int end);
            MessageBox.Show(start+"부터 " + end + "까지의 합은 " +MyMath.SumAll(start,end));
        }

        private void button5_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            int.TryParse(textBox4.Text, out int end);
            MessageBox.Show("0부터 " + m.end + "까지의 합은 " + end.SumAll());
        }

        private void button6_Click(object sender, EventArgs e)
        {
            MyMath a = new MyMath();
            a.end = 100;
            a.abc = 100;
        }
    }
}
