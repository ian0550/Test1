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
       public AddForm()
        {
            InitializeComponent();
        }
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
            else if(addTel.Text == "")
            {
                MessageBox.Show("번호를 입력하세요.");
            }
            else if (addAddres.Text == "")
            {
                MessageBox.Show("번호를 입력하세요.");
            }
            else if (addEmail.Text == "")
            {
                MessageBox.Show("번호를 입력하세요.");
            }
            //string name = addName.Text;

            StudentHandler.getInst().getList().Add(
                new Student(
                    StudentHandler.getInst().getId(), addName.Text, addTel.Text, 
                    addAddres.Text, addEmail.Text));
            MessageBox.Show("정상적으로 데이터가 입력되었습니다.");
            Close();
        }

        private void addCancel_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
