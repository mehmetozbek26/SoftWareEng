using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace seyda_özdemir
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox2.Text == "1907")
            {
                Form2 frm = new Form2();
                frm.Show();
            }
            else
                MessageBox.Show("yanlış şifre girdiniz..");
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
