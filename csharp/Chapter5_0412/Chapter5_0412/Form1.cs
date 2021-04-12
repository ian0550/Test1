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
    public partial class Form1 : Form
    {
        int num;
        public Form1()
        {
            InitializeComponent();
            //chageNum();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            pro1 pro1 = new pro1();
            pro1.Show();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            pro1 pro1 = new pro1();
            pro1.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Pro2 pro2 = new Pro2();
            pro2.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Pro3 pro3 = new Pro3();
            pro3.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Pro4 pro4 = new Pro4();
            pro4.Show();
        }
    }
}
