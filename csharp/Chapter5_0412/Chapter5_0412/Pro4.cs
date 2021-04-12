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
    public partial class Pro4 : Form
    {
        List<string> list = new List<string>();
        public Pro4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label4.Text = $"{label4.Text}12 ";
            list.Add("12");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label4.Text = $"{label4.Text}44 ";
            list.Add("44");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            label4.Text = $"{label4.Text}27 ";
            list.Add("27");
        }

        private void button4_Click(object sender, EventArgs e)
        {
            label4.Text = $"{label4.Text}16 ";
            list.Add("16");
        }

        private void button5_Click(object sender, EventArgs e)
        {
            for (int i = list.Count - 1; i >= 0; i--)
            {
                if (list[i] == "12")
                    list.RemoveAt(i);
                break;
            }
            if(list.Count == 0)
                label4.Text = "";
            else
                for (int i = 0; i < list.Count; i++)
                {
                    label4.Text = $"{list[i] }";
                }
        }
    }
}
