using adressTest0218;
using adressTest0218.control;
using MaterialSkin.Controls;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace addrWin0302.UI
{
    partial class AddForm : MaterialForm
    {
        StudentHandler sc;
       
        public AddForm(StudentHandler sc)
        {
            InitializeComponent();
            this.sc = sc;
        }

        private void addOK_Click(object sender, EventArgs e)
        {
            if(addName.Text == "")
            {
                MessageBox.Show("이름을 입력하세요.");
            }
            //string name = addName.Text;

            sc.getList().Add(new Student(sc.getId(), addName.Text, addTel.Text, addAddres.Text, addEmail.Text));
        }

        private void addCancel_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
