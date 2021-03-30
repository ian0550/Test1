
namespace CarManager0323.UI
{
    partial class CustInsForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.custCancel = new Sunny.UI.UISymbolButton();
            this.custOK = new Sunny.UI.UISymbolButton();
            this.custEmail = new Sunny.UI.UITextBox();
            this.custAddr = new Sunny.UI.UITextBox();
            this.custTel = new Sunny.UI.UITextBox();
            this.uiSymbolLabel4 = new Sunny.UI.UISymbolLabel();
            this.uiSymbolLabel3 = new Sunny.UI.UISymbolLabel();
            this.uiSymbolLabel2 = new Sunny.UI.UISymbolLabel();
            this.custName = new Sunny.UI.UITextBox();
            this.uiSymbolLabel1 = new Sunny.UI.UISymbolLabel();
            this.SuspendLayout();
            // 
            // custCancel
            // 
            this.custCancel.Cursor = System.Windows.Forms.Cursors.Hand;
            this.custCancel.FillColor = System.Drawing.Color.Gray;
            this.custCancel.FillHoverColor = System.Drawing.Color.FromArgb(((int)(((byte)(74)))), ((int)(((byte)(131)))), ((int)(((byte)(229)))));
            this.custCancel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.custCancel.Location = new System.Drawing.Point(303, 383);
            this.custCancel.MinimumSize = new System.Drawing.Size(1, 1);
            this.custCancel.Name = "custCancel";
            this.custCancel.RectColor = System.Drawing.Color.Gray;
            this.custCancel.RectHoverColor = System.Drawing.Color.FromArgb(((int)(((byte)(74)))), ((int)(((byte)(131)))), ((int)(((byte)(229)))));
            this.custCancel.Size = new System.Drawing.Size(100, 35);
            this.custCancel.Style = Sunny.UI.UIStyle.Custom;
            this.custCancel.Symbol = 61453;
            this.custCancel.TabIndex = 31;
            this.custCancel.Text = "취 소";
            // 
            // custOK
            // 
            this.custOK.Cursor = System.Windows.Forms.Cursors.Hand;
            this.custOK.FillHoverColor = System.Drawing.Color.RoyalBlue;
            this.custOK.FillPressColor = System.Drawing.Color.RoyalBlue;
            this.custOK.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.custOK.Location = new System.Drawing.Point(166, 383);
            this.custOK.MinimumSize = new System.Drawing.Size(1, 1);
            this.custOK.Name = "custOK";
            this.custOK.Size = new System.Drawing.Size(100, 35);
            this.custOK.Style = Sunny.UI.UIStyle.Custom;
            this.custOK.TabIndex = 30;
            this.custOK.Text = "확 인";
            this.custOK.Click += new System.EventHandler(this.custOK_Click);
            // 
            // custEmail
            // 
            this.custEmail.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.custEmail.FillColor = System.Drawing.Color.White;
            this.custEmail.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.custEmail.Location = new System.Drawing.Point(283, 311);
            this.custEmail.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.custEmail.Maximum = 2147483647D;
            this.custEmail.Minimum = -2147483648D;
            this.custEmail.MinimumSize = new System.Drawing.Size(1, 1);
            this.custEmail.Name = "custEmail";
            this.custEmail.Padding = new System.Windows.Forms.Padding(5);
            this.custEmail.Size = new System.Drawing.Size(166, 29);
            this.custEmail.TabIndex = 29;
            // 
            // custAddr
            // 
            this.custAddr.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.custAddr.FillColor = System.Drawing.Color.White;
            this.custAddr.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.custAddr.Location = new System.Drawing.Point(283, 239);
            this.custAddr.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.custAddr.Maximum = 2147483647D;
            this.custAddr.Minimum = -2147483648D;
            this.custAddr.MinimumSize = new System.Drawing.Size(1, 1);
            this.custAddr.Name = "custAddr";
            this.custAddr.Padding = new System.Windows.Forms.Padding(5);
            this.custAddr.Size = new System.Drawing.Size(166, 29);
            this.custAddr.TabIndex = 28;
            // 
            // custTel
            // 
            this.custTel.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.custTel.FillColor = System.Drawing.Color.White;
            this.custTel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.custTel.Location = new System.Drawing.Point(283, 167);
            this.custTel.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.custTel.Maximum = 2147483647D;
            this.custTel.Minimum = -2147483648D;
            this.custTel.MinimumSize = new System.Drawing.Size(1, 1);
            this.custTel.Name = "custTel";
            this.custTel.Padding = new System.Windows.Forms.Padding(5);
            this.custTel.Size = new System.Drawing.Size(166, 29);
            this.custTel.TabIndex = 27;
            // 
            // uiSymbolLabel4
            // 
            this.uiSymbolLabel4.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel4.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel4.Location = new System.Drawing.Point(116, 305);
            this.uiSymbolLabel4.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel4.Name = "uiSymbolLabel4";
            this.uiSymbolLabel4.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel4.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel4.Symbol = 61443;
            this.uiSymbolLabel4.SymbolColor = System.Drawing.Color.RoyalBlue;
            this.uiSymbolLabel4.TabIndex = 26;
            this.uiSymbolLabel4.Text = "이메일";
            // 
            // uiSymbolLabel3
            // 
            this.uiSymbolLabel3.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel3.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel3.Location = new System.Drawing.Point(116, 235);
            this.uiSymbolLabel3.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel3.Name = "uiSymbolLabel3";
            this.uiSymbolLabel3.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel3.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel3.Symbol = 57460;
            this.uiSymbolLabel3.SymbolColor = System.Drawing.Color.PaleVioletRed;
            this.uiSymbolLabel3.TabIndex = 25;
            this.uiSymbolLabel3.Text = "주 소";
            // 
            // uiSymbolLabel2
            // 
            this.uiSymbolLabel2.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel2.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel2.Location = new System.Drawing.Point(116, 165);
            this.uiSymbolLabel2.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel2.Name = "uiSymbolLabel2";
            this.uiSymbolLabel2.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel2.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel2.Symbol = 57488;
            this.uiSymbolLabel2.SymbolColor = System.Drawing.Color.MediumSeaGreen;
            this.uiSymbolLabel2.TabIndex = 24;
            this.uiSymbolLabel2.Text = "전 화";
            // 
            // custName
            // 
            this.custName.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.custName.FillColor = System.Drawing.Color.White;
            this.custName.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.custName.Location = new System.Drawing.Point(283, 95);
            this.custName.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.custName.Maximum = 2147483647D;
            this.custName.Minimum = -2147483648D;
            this.custName.MinimumSize = new System.Drawing.Size(1, 1);
            this.custName.Name = "custName";
            this.custName.Padding = new System.Windows.Forms.Padding(5);
            this.custName.Size = new System.Drawing.Size(166, 29);
            this.custName.TabIndex = 23;
            // 
            // uiSymbolLabel1
            // 
            this.uiSymbolLabel1.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel1.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel1.Location = new System.Drawing.Point(116, 95);
            this.uiSymbolLabel1.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel1.Name = "uiSymbolLabel1";
            this.uiSymbolLabel1.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel1.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel1.Symbol = 62144;
            this.uiSymbolLabel1.SymbolColor = System.Drawing.Color.Goldenrod;
            this.uiSymbolLabel1.TabIndex = 22;
            this.uiSymbolLabel1.Text = "이 름";
            // 
            // CustInsForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(560, 450);
            this.Controls.Add(this.custCancel);
            this.Controls.Add(this.custOK);
            this.Controls.Add(this.custEmail);
            this.Controls.Add(this.custAddr);
            this.Controls.Add(this.custTel);
            this.Controls.Add(this.uiSymbolLabel4);
            this.Controls.Add(this.uiSymbolLabel3);
            this.Controls.Add(this.uiSymbolLabel2);
            this.Controls.Add(this.custName);
            this.Controls.Add(this.uiSymbolLabel1);
            this.Name = "CustInsForm";
            this.Text = "고객 정보 추가";
            this.ResumeLayout(false);

        }

        #endregion
        private Sunny.UI.UISymbolButton custCancel;
        private Sunny.UI.UISymbolButton custOK;
        private Sunny.UI.UITextBox custEmail;
        private Sunny.UI.UITextBox custAddr;
        private Sunny.UI.UITextBox custTel;
        private Sunny.UI.UISymbolLabel uiSymbolLabel4;
        private Sunny.UI.UISymbolLabel uiSymbolLabel3;
        private Sunny.UI.UISymbolLabel uiSymbolLabel2;
        private Sunny.UI.UITextBox custName;
        private Sunny.UI.UISymbolLabel uiSymbolLabel1;
    }
}