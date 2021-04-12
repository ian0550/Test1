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
    public partial class pro1 : Form
    {
        int num;
        public pro1()
        {
            InitializeComponent();
            chageNum();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            checkNum();
        }

        public void checkNum()
        {
            int tbox = int.Parse(textBox1.Text);

            if (tbox < num)
            {
                label2.Text = "입력한 숫자보다 큽니다.";
            }
            else if (tbox > num)
            {
                label2.Text = "입력한 숫자보다 작습니다.";
            }
            else
            {
                label2.Text = "리셋";
                MessageBox.Show("같은 숫자");
                chageNum();
            }
        }

        public void chageNum()
        {
            Random r = new Random();
            num = r.Next(1, 11);
        }
    }
}
