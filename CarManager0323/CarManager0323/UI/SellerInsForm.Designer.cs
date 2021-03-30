
namespace CarManager0323.UI
{
    partial class SellerInsForm
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
            this.sellerCancel = new Sunny.UI.UISymbolButton();
            this.sellerOK = new Sunny.UI.UISymbolButton();
            this.sellerEmail = new Sunny.UI.UITextBox();
            this.sellerJikwi = new Sunny.UI.UITextBox();
            this.sellerTel = new Sunny.UI.UITextBox();
            this.uiSymbolLabel4 = new Sunny.UI.UISymbolLabel();
            this.uiSymbolLabel3 = new Sunny.UI.UISymbolLabel();
            this.uiSymbolLabel2 = new Sunny.UI.UISymbolLabel();
            this.sellerName = new Sunny.UI.UITextBox();
            this.uiSymbolLabel1 = new Sunny.UI.UISymbolLabel();
            this.sellerOffice = new Sunny.UI.UITextBox();
            this.uiSymbolLabel5 = new Sunny.UI.UISymbolLabel();
            this.SuspendLayout();
            // 
            // sellerCancel
            // 
            this.sellerCancel.Cursor = System.Windows.Forms.Cursors.Hand;
            this.sellerCancel.FillColor = System.Drawing.Color.Gray;
            this.sellerCancel.FillHoverColor = System.Drawing.Color.FromArgb(((int)(((byte)(74)))), ((int)(((byte)(131)))), ((int)(((byte)(229)))));
            this.sellerCancel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerCancel.Location = new System.Drawing.Point(299, 390);
            this.sellerCancel.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerCancel.Name = "sellerCancel";
            this.sellerCancel.RectColor = System.Drawing.Color.Gray;
            this.sellerCancel.RectHoverColor = System.Drawing.Color.FromArgb(((int)(((byte)(74)))), ((int)(((byte)(131)))), ((int)(((byte)(229)))));
            this.sellerCancel.Size = new System.Drawing.Size(100, 35);
            this.sellerCancel.Style = Sunny.UI.UIStyle.Custom;
            this.sellerCancel.Symbol = 61453;
            this.sellerCancel.TabIndex = 41;
            this.sellerCancel.Text = "취 소";
            // 
            // sellerOK
            // 
            this.sellerOK.Cursor = System.Windows.Forms.Cursors.Hand;
            this.sellerOK.FillHoverColor = System.Drawing.Color.RoyalBlue;
            this.sellerOK.FillPressColor = System.Drawing.Color.RoyalBlue;
            this.sellerOK.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerOK.Location = new System.Drawing.Point(162, 390);
            this.sellerOK.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerOK.Name = "sellerOK";
            this.sellerOK.Size = new System.Drawing.Size(100, 35);
            this.sellerOK.Style = Sunny.UI.UIStyle.Custom;
            this.sellerOK.TabIndex = 40;
            this.sellerOK.Text = "확 인";
            this.sellerOK.Click += new System.EventHandler(this.sellerOK_Click);
            // 
            // sellerEmail
            // 
            this.sellerEmail.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.sellerEmail.FillColor = System.Drawing.Color.White;
            this.sellerEmail.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerEmail.Location = new System.Drawing.Point(279, 270);
            this.sellerEmail.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.sellerEmail.Maximum = 2147483647D;
            this.sellerEmail.Minimum = -2147483648D;
            this.sellerEmail.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerEmail.Name = "sellerEmail";
            this.sellerEmail.Padding = new System.Windows.Forms.Padding(5);
            this.sellerEmail.Size = new System.Drawing.Size(166, 29);
            this.sellerEmail.TabIndex = 39;
            // 
            // sellerJikwi
            // 
            this.sellerJikwi.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.sellerJikwi.FillColor = System.Drawing.Color.White;
            this.sellerJikwi.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerJikwi.Location = new System.Drawing.Point(279, 214);
            this.sellerJikwi.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.sellerJikwi.Maximum = 2147483647D;
            this.sellerJikwi.Minimum = -2147483648D;
            this.sellerJikwi.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerJikwi.Name = "sellerJikwi";
            this.sellerJikwi.Padding = new System.Windows.Forms.Padding(5);
            this.sellerJikwi.Size = new System.Drawing.Size(166, 29);
            this.sellerJikwi.TabIndex = 38;
            // 
            // sellerTel
            // 
            this.sellerTel.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.sellerTel.FillColor = System.Drawing.Color.White;
            this.sellerTel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerTel.Location = new System.Drawing.Point(279, 158);
            this.sellerTel.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.sellerTel.Maximum = 2147483647D;
            this.sellerTel.Minimum = -2147483648D;
            this.sellerTel.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerTel.Name = "sellerTel";
            this.sellerTel.Padding = new System.Windows.Forms.Padding(5);
            this.sellerTel.Size = new System.Drawing.Size(166, 29);
            this.sellerTel.TabIndex = 37;
            // 
            // uiSymbolLabel4
            // 
            this.uiSymbolLabel4.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel4.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel4.Location = new System.Drawing.Point(112, 264);
            this.uiSymbolLabel4.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel4.Name = "uiSymbolLabel4";
            this.uiSymbolLabel4.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel4.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel4.Symbol = 61443;
            this.uiSymbolLabel4.SymbolColor = System.Drawing.Color.RoyalBlue;
            this.uiSymbolLabel4.TabIndex = 36;
            this.uiSymbolLabel4.Text = "이메일";
            // 
            // uiSymbolLabel3
            // 
            this.uiSymbolLabel3.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel3.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel3.Location = new System.Drawing.Point(112, 210);
            this.uiSymbolLabel3.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel3.Name = "uiSymbolLabel3";
            this.uiSymbolLabel3.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel3.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel3.Symbol = 57460;
            this.uiSymbolLabel3.SymbolColor = System.Drawing.Color.PaleVioletRed;
            this.uiSymbolLabel3.TabIndex = 35;
            this.uiSymbolLabel3.Text = "직 위";
            // 
            // uiSymbolLabel2
            // 
            this.uiSymbolLabel2.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel2.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel2.Location = new System.Drawing.Point(112, 156);
            this.uiSymbolLabel2.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel2.Name = "uiSymbolLabel2";
            this.uiSymbolLabel2.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel2.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel2.Symbol = 57488;
            this.uiSymbolLabel2.SymbolColor = System.Drawing.Color.MediumSeaGreen;
            this.uiSymbolLabel2.TabIndex = 34;
            this.uiSymbolLabel2.Text = "전 화";
            // 
            // sellerName
            // 
            this.sellerName.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.sellerName.FillColor = System.Drawing.Color.White;
            this.sellerName.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerName.Location = new System.Drawing.Point(279, 102);
            this.sellerName.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.sellerName.Maximum = 2147483647D;
            this.sellerName.Minimum = -2147483648D;
            this.sellerName.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerName.Name = "sellerName";
            this.sellerName.Padding = new System.Windows.Forms.Padding(5);
            this.sellerName.Size = new System.Drawing.Size(166, 29);
            this.sellerName.TabIndex = 33;
            // 
            // uiSymbolLabel1
            // 
            this.uiSymbolLabel1.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel1.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel1.Location = new System.Drawing.Point(112, 102);
            this.uiSymbolLabel1.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel1.Name = "uiSymbolLabel1";
            this.uiSymbolLabel1.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel1.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel1.Symbol = 62144;
            this.uiSymbolLabel1.SymbolColor = System.Drawing.Color.Goldenrod;
            this.uiSymbolLabel1.TabIndex = 32;
            this.uiSymbolLabel1.Text = "이 름";
            // 
            // sellerOffice
            // 
            this.sellerOffice.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.sellerOffice.FillColor = System.Drawing.Color.White;
            this.sellerOffice.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.sellerOffice.Location = new System.Drawing.Point(279, 326);
            this.sellerOffice.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.sellerOffice.Maximum = 2147483647D;
            this.sellerOffice.Minimum = -2147483648D;
            this.sellerOffice.MinimumSize = new System.Drawing.Size(1, 1);
            this.sellerOffice.Name = "sellerOffice";
            this.sellerOffice.Padding = new System.Windows.Forms.Padding(5);
            this.sellerOffice.Size = new System.Drawing.Size(166, 29);
            this.sellerOffice.TabIndex = 43;
            // 
            // uiSymbolLabel5
            // 
            this.uiSymbolLabel5.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel5.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel5.Location = new System.Drawing.Point(112, 318);
            this.uiSymbolLabel5.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel5.Name = "uiSymbolLabel5";
            this.uiSymbolLabel5.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel5.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel5.Symbol = 61443;
            this.uiSymbolLabel5.SymbolColor = System.Drawing.Color.RoyalBlue;
            this.uiSymbolLabel5.TabIndex = 42;
            this.uiSymbolLabel5.Text = "영업소";
            // 
            // SellerInsForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(570, 450);
            this.Controls.Add(this.sellerOffice);
            this.Controls.Add(this.uiSymbolLabel5);
            this.Controls.Add(this.sellerCancel);
            this.Controls.Add(this.sellerOK);
            this.Controls.Add(this.sellerEmail);
            this.Controls.Add(this.sellerJikwi);
            this.Controls.Add(this.sellerTel);
            this.Controls.Add(this.uiSymbolLabel4);
            this.Controls.Add(this.uiSymbolLabel3);
            this.Controls.Add(this.uiSymbolLabel2);
            this.Controls.Add(this.sellerName);
            this.Controls.Add(this.uiSymbolLabel1);
            this.Name = "SellerInsForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "판매자 추가 정보";
            this.ResumeLayout(false);

        }

        #endregion

        private Sunny.UI.UISymbolButton sellerCancel;
        private Sunny.UI.UISymbolButton sellerOK;
        private Sunny.UI.UITextBox sellerEmail;
        private Sunny.UI.UITextBox sellerJikwi;
        private Sunny.UI.UITextBox sellerTel;
        private Sunny.UI.UISymbolLabel uiSymbolLabel4;
        private Sunny.UI.UISymbolLabel uiSymbolLabel3;
        private Sunny.UI.UISymbolLabel uiSymbolLabel2;
        private Sunny.UI.UITextBox sellerName;
        private Sunny.UI.UISymbolLabel uiSymbolLabel1;
        private Sunny.UI.UITextBox sellerOffice;
        private Sunny.UI.UISymbolLabel uiSymbolLabel5;
    }
}