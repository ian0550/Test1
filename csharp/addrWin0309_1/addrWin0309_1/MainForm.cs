using adressTest0218.control;
using adressTest0218.view;
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

namespace addrWin0309_1
{
    public partial class MainForm : MaterialForm
    {
        MyMenu menu = new MyMenu();
        StudentHandler sc = new StudentHandler();

        public MainForm()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void addrExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void addrHelp_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Update 2021년 3월 2일 by 하이안");
        }

        private void addrAdd_Click(object sender, EventArgs e)
        {
            //sc.addItem();
            //new AddForm().ShowDialog();
        }

        private void addrView_Click(object sender, EventArgs e)
        {
            sc.viewItem();
            //new ViewForm(sc).ShowDialog();
        }

        private void addrAddRand_Click(object sender, EventArgs e)
        {
            string cnt = myInputBox("랜덤 데이터 생성",
                "랜덤하게 데이터를 생성할 갯수를 입력하세요.", "0");
            if (cnt == "") return;
            sc.randData(Convert.ToInt32(cnt));
        }

        private void addrDel_Click(object sender, EventArgs e)
        {
            string cnt = myInputBox("데이터 삭제",
                "삭제할 데이터를 입력하세요.", "0");
            if (cnt == "") return;
            sc.delItem(cnt);
        }

        private void addrDelAll_Click(object sender, EventArgs e)
        {
            sc.delItemAll();
        }

        private void addrUpdate_Click(object sender, EventArgs e)
        {
            sc.viewItem();
            //new ViewForm(sc).ShowDialog();
            //sc.updateItem();
        }

        private string myInputBox(string title, string body, string prompt)
        {
            string input = Microsoft.VisualBasic.Interaction.InputBox(title, body, prompt, -1, -1);
            return input;
        }

        private void uiSymbolLabel1_Click(object sender, EventArgs e)
        {
            //new AddForm().ShowDialog();

        }

        //private void InitializeComponent()
        //{
        //    this.SuspendLayout();
        //    // 
        //    // MainForm
        //    // 
        //    this.ClientSize = new System.Drawing.Size(300, 300);
        //    this.Name = "MainForm";
        //    this.Load += new System.EventHandler(this.MainForm_Load);
        //    this.ResumeLayout(false);

        //}

        private void MainForm_Load(object sender, EventArgs e)
        {

        }

        private void InitializeComponent()
        {
            this.SuspendLayout();
            // 
            // MainForm
            // 
            this.ClientSize = new System.Drawing.Size(300, 300);
            this.Name = "MainForm";
            this.Load += new System.EventHandler(this.MainForm_Load_1);
            this.ResumeLayout(false);

        }

        private void MainForm_Load_1(object sender, EventArgs e)
        {

        }
    }
}
