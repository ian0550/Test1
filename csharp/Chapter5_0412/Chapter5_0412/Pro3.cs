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
    public partial class Pro3 : Form
    {
        List<string> sub = new List<string>() { "도도가", "애플이가", "망고가", "베리가", "리치가", "에드워드가", "루이가" };
        List<string> obj = new List<string>() { "책을", "컴퓨터를", "나무를", "침대를", "바닥에" };
        List<string> ver = new List<string>() { "버린다", "먹는다", "입는다", "때린다", "밟는다" };
        public Pro3()
        {
            InitializeComponent();
            

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Random r = new Random();
            label1.Text = sub[r.Next(0,7)];
            label2.Text = obj[r.Next(0, 5)];
            label3.Text = ver[r.Next(0, 5)];
        }

        private void button2_Click(object sender, EventArgs e)
        {
        }
    }
}
