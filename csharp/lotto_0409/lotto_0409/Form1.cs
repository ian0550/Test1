using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lotto_0409
{
    public partial class Form1 : Form
    {
        int count=1;
        int[] lottoPan = new int[45];
        int[] highNum = new int[22] { 1, 2, 3, 4, 10, 11, 12, 13, 14, 17, 18, 20, 26, 27, 31, 33, 34, 37, 38, 39, 40, 43 };
        Label[] nList = new Label[48];
        public Form1()
        {
            InitializeComponent();
            foreach (var item in Controls)
            {
                if(item as Label != null)
                {
                    if((item as Label).Name.Contains("N"))
                    {
                        nList[int.Parse((item as Label).Name.Replace("N", ""))-1] = (item as Label);
                    }
                }
            }
            for (int i = 0; i < nList.Length; i++)
            {
                Console.WriteLine($"nList[{i}] : {nList[i].Name}");
            }
            lottoReset();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int[] lotto = new int[6];

            Random r = new Random();

            if (count < 8)
            {
                for (int i = 0; i < 6; i++)
                {
                    while (true)
                    {
                        int num = r.Next(1, 46);
                        if (lottoPan[num - 1] != 0)
                        {
                            lotto[i] = num;
                            lottoPan[num - 1] = 0;
                            break;
                        }
                    }
                }
            }
            
            switch (count)
            {
                case 1:
                    Array.Sort(lotto);
                    N1.Text = lotto[0].ToString();
                    N2.Text = lotto[1].ToString();
                    N3.Text = lotto[2].ToString();
                    N4.Text = lotto[3].ToString();
                    N5.Text = lotto[4].ToString();
                    N6.Text = lotto[5].ToString();
                    count++;
                    break;
               case 2:
                    Array.Sort(lotto);
                    N7.Text = lotto[0].ToString();
                    N8.Text = lotto[1].ToString();
                    N9.Text = lotto[2].ToString();
                    N10.Text = lotto[3].ToString();
                    N11.Text = lotto[4].ToString();
                    N12.Text = lotto[5].ToString();
                    count++;
                    break;
                case 3:
                    Array.Sort(lotto);
                    N13.Text = lotto[0].ToString();
                    N14.Text = lotto[1].ToString();
                    N15.Text = lotto[2].ToString();
                    N16.Text = lotto[3].ToString();
                    N17.Text = lotto[4].ToString();
                    N18.Text = lotto[5].ToString();
                    count++;
                    break;
                case 4:
                    Array.Sort(lotto);
                    N19.Text = lotto[0].ToString();
                    N20.Text = lotto[1].ToString();
                    N21.Text = lotto[2].ToString();
                    N22.Text = lotto[3].ToString();
                    N23.Text = lotto[4].ToString();
                    N24.Text = lotto[5].ToString();
                    count++;
                    break;
                case 5:
                    Array.Sort(lotto);
                    N25.Text = lotto[0].ToString();
                    N26.Text = lotto[1].ToString();
                    N27.Text = lotto[2].ToString();
                    N28.Text = lotto[3].ToString();
                    N29.Text = lotto[4].ToString();
                    N30.Text = lotto[5].ToString();
                    count++;
                    break;
                case 6:
                    N31.Text = lotto[0].ToString();
                    N32.Text = lotto[1].ToString();
                    N33.Text = lotto[2].ToString();
                    N34.Text = lotto[3].ToString();
                    N35.Text = lotto[4].ToString();
                    N36.Text = lotto[5].ToString();
                    count++;
                    break;
                case 7:
                    N37.Text = lotto[0].ToString();
                    N38.Text = lotto[1].ToString();
                    N39.Text = lotto[2].ToString();
                    N40.Text = lotto[3].ToString();
                    N41.Text = lotto[4].ToString();
                    N42.Text = lotto[5].ToString();
                    count++;
                    break;
                case 8:
                    excepNum();
                    break;
                default:
                    break;
            }



        }
        public void excepNum()
        {
            Random r = new Random();
            int[] lotto = new int[6];
            for (int i = 0; i < 3; i++)
            {
                while (true)
                {
                    int num = r.Next(1, 46);
                    if (lottoPan[num - 1] != 0)
                    {
                        lotto[i] = num;
                        lottoPan[num - 1] = 0;
                        break;
                    }
                }
            }
            for (int i = 3; i < 6; i++)
            {
                while (true)
                {
                    int num = r.Next(0, 22);
                    int chk = 0;
                    for (int j = 0; j < 3; j++)
                    {
                        if (highNum[num] == lotto[i])
                            chk++;
                    }
                    if (highNum[num] != 0 && chk == 0)
                    {
                        lotto[i] = highNum[num];
                        lottoPan[num] = 0;
                        break;
                    }


                }
            }
            Array.Sort(lotto);
            N43.Text = lotto[0].ToString();
            N44.Text = lotto[1].ToString();
            N45.Text = lotto[2].ToString();
            N46.Text = lotto[3].ToString();
            N47.Text = lotto[4].ToString();
            N48.Text = lotto[5].ToString();
        }

        public void lottoReset()
        {
            for (int i = 0; i < lottoPan.Length; i++)
            {
                lottoPan[i] = i + 1;
            }
            count = 1;

            for (int i = 0; i < nList.Length; i++)
            {
                nList[i].Text = "-";
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            lottoReset();
        }
    }
}
