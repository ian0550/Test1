
namespace CarManager0323.UI
{
    partial class CarInsForm
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
            this.carCancel = new Sunny.UI.UISymbolButton();
            this.carOK = new Sunny.UI.UISymbolButton();
            this.carCompany = new Sunny.UI.UITextBox();
            this.carColor = new Sunny.UI.UITextBox();
            this.carPrice = new Sunny.UI.UITextBox();
            this.uiSymbolLabel4 = new Sunny.UI.UISymbolLabel();
            this.uiSymbolLabel3 = new Sunny.UI.UISymbolLabel();
            this.uiSymbolLabel2 = new Sunny.UI.UISymbolLabel();
            this.carModel = new Sunny.UI.UITextBox();
            this.uiSymbolLabel1 = new Sunny.UI.UISymbolLabel();
            this.carYear = new Sunny.UI.UITextBox();
            this.uiSymbolLabel5 = new Sunny.UI.UISymbolLabel();
            this.SuspendLayout();
            // 
            // carCancel
            // 
            this.carCancel.Cursor = System.Windows.Forms.Cursors.Hand;
            this.carCancel.FillColor = System.Drawing.Color.Gray;
            this.carCancel.FillHoverColor = System.Drawing.Color.FromArgb(((int)(((byte)(74)))), ((int)(((byte)(131)))), ((int)(((byte)(229)))));
            this.carCancel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carCancel.Location = new System.Drawing.Point(310, 379);
            this.carCancel.MinimumSize = new System.Drawing.Size(1, 1);
            this.carCancel.Name = "carCancel";
            this.carCancel.RectColor = System.Drawing.Color.Gray;
            this.carCancel.RectHoverColor = System.Drawing.Color.FromArgb(((int)(((byte)(74)))), ((int)(((byte)(131)))), ((int)(((byte)(229)))));
            this.carCancel.Size = new System.Drawing.Size(100, 35);
            this.carCancel.Style = Sunny.UI.UIStyle.Custom;
            this.carCancel.Symbol = 61453;
            this.carCancel.TabIndex = 19;
            this.carCancel.Text = "취 소";
            this.carCancel.Click += new System.EventHandler(this.carCancel_Click);
            // 
            // carOK
            // 
            this.carOK.Cursor = System.Windows.Forms.Cursors.Hand;
            this.carOK.FillHoverColor = System.Drawing.Color.RoyalBlue;
            this.carOK.FillPressColor = System.Drawing.Color.RoyalBlue;
            this.carOK.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carOK.Location = new System.Drawing.Point(173, 379);
            this.carOK.MinimumSize = new System.Drawing.Size(1, 1);
            this.carOK.Name = "carOK";
            this.carOK.Size = new System.Drawing.Size(100, 35);
            this.carOK.Style = Sunny.UI.UIStyle.Custom;
            this.carOK.TabIndex = 18;
            this.carOK.Text = "확 인";
            this.carOK.Click += new System.EventHandler(this.carOK_Click);
            // 
            // carCompany
            // 
            this.carCompany.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.carCompany.FillColor = System.Drawing.Color.White;
            this.carCompany.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carCompany.Location = new System.Drawing.Point(290, 277);
            this.carCompany.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.carCompany.Maximum = 2147483647D;
            this.carCompany.Minimum = -2147483648D;
            this.carCompany.MinimumSize = new System.Drawing.Size(1, 1);
            this.carCompany.Name = "carCompany";
            this.carCompany.Padding = new System.Windows.Forms.Padding(5);
            this.carCompany.Size = new System.Drawing.Size(166, 29);
            this.carCompany.TabIndex = 17;
            // 
            // carColor
            // 
            this.carColor.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.carColor.FillColor = System.Drawing.Color.White;
            this.carColor.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carColor.Location = new System.Drawing.Point(290, 219);
            this.carColor.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.carColor.Maximum = 2147483647D;
            this.carColor.Minimum = -2147483648D;
            this.carColor.MinimumSize = new System.Drawing.Size(1, 1);
            this.carColor.Name = "carColor";
            this.carColor.Padding = new System.Windows.Forms.Padding(5);
            this.carColor.Size = new System.Drawing.Size(166, 29);
            this.carColor.TabIndex = 16;
            // 
            // carPrice
            // 
            this.carPrice.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.carPrice.FillColor = System.Drawing.Color.White;
            this.carPrice.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carPrice.Location = new System.Drawing.Point(290, 163);
            this.carPrice.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.carPrice.Maximum = 2147483647D;
            this.carPrice.Minimum = -2147483648D;
            this.carPrice.MinimumSize = new System.Drawing.Size(1, 1);
            this.carPrice.Name = "carPrice";
            this.carPrice.Padding = new System.Windows.Forms.Padding(5);
            this.carPrice.Size = new System.Drawing.Size(166, 29);
            this.carPrice.TabIndex = 15;
            // 
            // uiSymbolLabel4
            // 
            this.uiSymbolLabel4.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel4.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel4.Location = new System.Drawing.Point(123, 271);
            this.uiSymbolLabel4.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel4.Name = "uiSymbolLabel4";
            this.uiSymbolLabel4.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel4.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel4.Symbol = 61443;
            this.uiSymbolLabel4.SymbolColor = System.Drawing.Color.RoyalBlue;
            this.uiSymbolLabel4.TabIndex = 14;
            this.uiSymbolLabel4.Text = "제조사";
            // 
            // uiSymbolLabel3
            // 
            this.uiSymbolLabel3.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel3.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel3.Location = new System.Drawing.Point(123, 213);
            this.uiSymbolLabel3.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel3.Name = "uiSymbolLabel3";
            this.uiSymbolLabel3.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel3.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel3.Symbol = 57460;
            this.uiSymbolLabel3.SymbolColor = System.Drawing.Color.PaleVioletRed;
            this.uiSymbolLabel3.TabIndex = 13;
            this.uiSymbolLabel3.Text = "색 상";
            // 
            // uiSymbolLabel2
            // 
            this.uiSymbolLabel2.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel2.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel2.Location = new System.Drawing.Point(123, 157);
            this.uiSymbolLabel2.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel2.Name = "uiSymbolLabel2";
            this.uiSymbolLabel2.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel2.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel2.Symbol = 57488;
            this.uiSymbolLabel2.SymbolColor = System.Drawing.Color.MediumSeaGreen;
            this.uiSymbolLabel2.TabIndex = 12;
            this.uiSymbolLabel2.Text = "가 격";
            // 
            // carModel
            // 
            this.carModel.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.carModel.FillColor = System.Drawing.Color.White;
            this.carModel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carModel.Location = new System.Drawing.Point(290, 102);
            this.carModel.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.carModel.Maximum = 2147483647D;
            this.carModel.Minimum = -2147483648D;
            this.carModel.MinimumSize = new System.Drawing.Size(1, 1);
            this.carModel.Name = "carModel";
            this.carModel.Padding = new System.Windows.Forms.Padding(5);
            this.carModel.Size = new System.Drawing.Size(166, 29);
            this.carModel.TabIndex = 11;
            // 
            // uiSymbolLabel1
            // 
            this.uiSymbolLabel1.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel1.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel1.Location = new System.Drawing.Point(123, 102);
            this.uiSymbolLabel1.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel1.Name = "uiSymbolLabel1";
            this.uiSymbolLabel1.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel1.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel1.Symbol = 62144;
            this.uiSymbolLabel1.SymbolColor = System.Drawing.Color.Goldenrod;
            this.uiSymbolLabel1.TabIndex = 10;
            this.uiSymbolLabel1.Text = "모 델";
            // 
            // carYear
            // 
            this.carYear.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.carYear.FillColor = System.Drawing.Color.White;
            this.carYear.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.carYear.Location = new System.Drawing.Point(290, 329);
            this.carYear.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.carYear.Maximum = 2147483647D;
            this.carYear.Minimum = -2147483648D;
            this.carYear.MinimumSize = new System.Drawing.Size(1, 1);
            this.carYear.Name = "carYear";
            this.carYear.Padding = new System.Windows.Forms.Padding(5);
            this.carYear.Size = new System.Drawing.Size(166, 29);
            this.carYear.TabIndex = 21;
            // 
            // uiSymbolLabel5
            // 
            this.uiSymbolLabel5.BackColor = System.Drawing.SystemColors.Window;
            this.uiSymbolLabel5.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel5.Location = new System.Drawing.Point(123, 323);
            this.uiSymbolLabel5.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel5.Name = "uiSymbolLabel5";
            this.uiSymbolLabel5.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel5.Size = new System.Drawing.Size(150, 35);
            this.uiSymbolLabel5.Symbol = 61443;
            this.uiSymbolLabel5.SymbolColor = System.Drawing.Color.RoyalBlue;
            this.uiSymbolLabel5.TabIndex = 20;
            this.uiSymbolLabel5.Text = "연 식";
            // 
            // CarInsForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(570, 450);
            this.Controls.Add(this.carYear);
            this.Controls.Add(this.uiSymbolLabel5);
            this.Controls.Add(this.carCancel);
            this.Controls.Add(this.carOK);
            this.Controls.Add(this.carCompany);
            this.Controls.Add(this.carColor);
            this.Controls.Add(this.carPrice);
            this.Controls.Add(this.uiSymbolLabel4);
            this.Controls.Add(this.uiSymbolLabel3);
            this.Controls.Add(this.uiSymbolLabel2);
            this.Controls.Add(this.carModel);
            this.Controls.Add(this.uiSymbolLabel1);
            this.Name = "CarInsForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "CarInsForm";
            this.ResumeLayout(false);

        }

        #endregion

        private Sunny.UI.UISymbolButton carCancel;
        private Sunny.UI.UISymbolButton carOK;
        private Sunny.UI.UITextBox carCompany;
        private Sunny.UI.UITextBox carColor;
        private Sunny.UI.UITextBox carPrice;
        private Sunny.UI.UISymbolLabel uiSymbolLabel4;
        private Sunny.UI.UISymbolLabel uiSymbolLabel3;
        private Sunny.UI.UISymbolLabel uiSymbolLabel2;
        private Sunny.UI.UITextBox carModel;
        private Sunny.UI.UISymbolLabel uiSymbolLabel1;
        private Sunny.UI.UITextBox carYear;
        private Sunny.UI.UISymbolLabel uiSymbolLabel5;
    }
}