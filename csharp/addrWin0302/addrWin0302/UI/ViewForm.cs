﻿using MaterialSkin.Controls;
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
    public partial class ViewForm : MaterialForm
    {
        public ViewForm()
        {
            InitializeComponent();
            initListView();
        }

        private void initListView()
        {
            string[] data = { "1", "홍길동", "010-3333-4444", "조선 한양 홍감댁", "hong@naver.com" };
            listView.Items.Add(new ListViewItem(data));

            for(int i=0; i<50; i++)
            {
                listView.Items.Add(new ListViewItem(
                    new string[]
                    {
                        (i+2).ToString(), "홍길동", "010-3333-4444", "조선 한양 홍감댁", "hong@naver.com"
                    }
                    ));
            }

            setRowColor(listView, Color.White, Color.LightGray);
            int index = listView.Items.Count - 1;
            listView.Items[index].Selected = true;
            listView.Items[index].Focused = true;
            listView.EnsureVisible(index);

        }

        private void setRowColor(ListView list, Color color1, Color color2)
        {
            foreach(ListViewItem item in list.Items)
            {
                if((item.Index % 2 ) == 0)
                {
                    item.BackColor = color1;
                }
                else
                {
                    item.BackColor = color2;
                }
            }
        }

        private void ViewForm_Load(object sender, EventArgs e)
        {
            initListView();
            initGridView();
        }
        private void initGridView()
        {
            string[] data = { "1", "홍길동", "010-3333-4444", "조선 한양 홍감댁", "hong@naver.com" };
            gridView.Rows.Add(data);
            for (int i = 0; i < 50; i++)
            {
                gridView.Rows.Add(new string[]
                    {
                        (i+2).ToString(), "홍길동", "010-3333-4444", "조선 한양 홍감댁", "hong@naver.com"
                    }
                    );
            }
            int count = gridView.Rows.Count - 1;
            gridView.FirstDisplayedScrollingRowIndex = count;
            gridView.CurrentCell = gridView.Rows[count - 1].Cells[0];

        }

        private void viewExit_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
