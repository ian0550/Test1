﻿
namespace Lotto
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.button1 = new System.Windows.Forms.Button();
            this.label_num6 = new System.Windows.Forms.Label();
            this.label_num5 = new System.Windows.Forms.Label();
            this.label_num4 = new System.Windows.Forms.Label();
            this.label_num3 = new System.Windows.Forms.Label();
            this.label_num2 = new System.Windows.Forms.Label();
            this.label_num1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(51, 46);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 0;
            this.button1.Text = "button1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label_num6
            // 
            this.label_num6.AutoSize = true;
            this.label_num6.BackColor = System.Drawing.Color.White;
            this.label_num6.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_num6.Font = new System.Drawing.Font("굴림", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_num6.Location = new System.Drawing.Point(492, 45);
            this.label_num6.Name = "label_num6";
            this.label_num6.Size = new System.Drawing.Size(26, 26);
            this.label_num6.TabIndex = 12;
            this.label_num6.Text = "-";
            // 
            // label_num5
            // 
            this.label_num5.AutoSize = true;
            this.label_num5.BackColor = System.Drawing.Color.White;
            this.label_num5.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_num5.Font = new System.Drawing.Font("굴림", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_num5.Location = new System.Drawing.Point(429, 45);
            this.label_num5.Name = "label_num5";
            this.label_num5.Size = new System.Drawing.Size(26, 26);
            this.label_num5.TabIndex = 11;
            this.label_num5.Text = "-";
            // 
            // label_num4
            // 
            this.label_num4.AutoSize = true;
            this.label_num4.BackColor = System.Drawing.Color.White;
            this.label_num4.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_num4.Font = new System.Drawing.Font("굴림", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_num4.Location = new System.Drawing.Point(366, 45);
            this.label_num4.Name = "label_num4";
            this.label_num4.Size = new System.Drawing.Size(26, 26);
            this.label_num4.TabIndex = 10;
            this.label_num4.Text = "-";
            // 
            // label_num3
            // 
            this.label_num3.AutoSize = true;
            this.label_num3.BackColor = System.Drawing.Color.White;
            this.label_num3.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_num3.Font = new System.Drawing.Font("굴림", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_num3.Location = new System.Drawing.Point(303, 45);
            this.label_num3.Name = "label_num3";
            this.label_num3.Size = new System.Drawing.Size(26, 26);
            this.label_num3.TabIndex = 9;
            this.label_num3.Text = "-";
            // 
            // label_num2
            // 
            this.label_num2.AutoSize = true;
            this.label_num2.BackColor = System.Drawing.Color.White;
            this.label_num2.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_num2.Font = new System.Drawing.Font("굴림", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_num2.Location = new System.Drawing.Point(240, 45);
            this.label_num2.Name = "label_num2";
            this.label_num2.Size = new System.Drawing.Size(26, 26);
            this.label_num2.TabIndex = 8;
            this.label_num2.Text = "-";
            // 
            // label_num1
            // 
            this.label_num1.AutoSize = true;
            this.label_num1.BackColor = System.Drawing.Color.White;
            this.label_num1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_num1.Font = new System.Drawing.Font("굴림", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_num1.Location = new System.Drawing.Point(177, 45);
            this.label_num1.Name = "label_num1";
            this.label_num1.Size = new System.Drawing.Size(26, 26);
            this.label_num1.TabIndex = 7;
            this.label_num1.Text = "-";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(611, 117);
            this.Controls.Add(this.label_num6);
            this.Controls.Add(this.label_num5);
            this.Controls.Add(this.label_num4);
            this.Controls.Add(this.label_num3);
            this.Controls.Add(this.label_num2);
            this.Controls.Add(this.label_num1);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label_num6;
        private System.Windows.Forms.Label label_num5;
        private System.Windows.Forms.Label label_num4;
        private System.Windows.Forms.Label label_num3;
        private System.Windows.Forms.Label label_num2;
        private System.Windows.Forms.Label label_num1;
    }
}

