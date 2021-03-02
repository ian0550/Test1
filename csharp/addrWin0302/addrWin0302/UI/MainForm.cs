﻿using addrWin0302.UI;
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

namespace addrWin0302
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
            new AddForm(sc).ShowDialog();
        }

        private void addrView_Click(object sender, EventArgs e)
        {
            sc.viewItem();
        }

        private void addrAddRand_Click(object sender, EventArgs e)
        {
            sc.randDataID();
        }

        private void addrDel_Click(object sender, EventArgs e)
        {
            sc.delItem();
        }

        private void addrDelAll_Click(object sender, EventArgs e)
        {
            sc.delItemAll();
        }

        private void addrUpdate_Click(object sender, EventArgs e)
        {
            sc.updateItem();
        }
    }
}
