using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;
namespace LoginFormNew
{
    public partial class frmbookinfo : Form
    {
        public frmbookinfo()
        {
            InitializeComponent();
        }
        SqlConnection con = new SqlConnection("server=.;uid=sa;pwd=niit;database=Eramodel");
        string qry;
        SqlCommand cmd;
        private void button15_Click(object sender, EventArgs e)
        {
            Information.Text = "";
            try
            {
                if (validatedata() == 0)
                {
                    errorProvider1.Clear();
                    qry = "select *from newbooks where bookcode='" + textBox1.Text + "'";
                    con.Open();
                    cmd = new SqlCommand(qry, con);
                    SqlDataReader sdr = cmd.ExecuteReader();
                    while (sdr.Read())
                    {
                        textBox2.Text = sdr[1].ToString();
                        textBox3.Text = sdr[3].ToString();
                        textBox4.Text = sdr[4].ToString();
                        textBox14.Text = sdr[5].ToString();
                        textBox15.Text = sdr[6].ToString();
                    }
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                con.Close();
            }
        }

        private void button16_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
            textBox4.Clear();
            textBox14.Clear();
            textBox15.Clear();

        }

        private void button17_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void textBox1_Enter(object sender, EventArgs e)
        {
            Information.Text = "Please select book code";
        }

        private void textBox1_DoubleClick(object sender, EventArgs e)
        {
            frmbookcode bk = new frmbookcode();
            DialogResult res = bk.ShowDialog();
            if (res == DialogResult.OK)
            {
                textBox1.Text = bk.str;
            }
        }
        private int validatedata()
        {
            int i = 0;
            if (textBox1.Text == "")
            {
                textBox1.BackColor = Color.IndianRed;
                errorProvider1.SetError(textBox1, "Please enter book code");
                i = 1;
            }
            else
                textBox1.BackColor = Color.White;
            return i;
        }

        private void textBox1_MouseHover(object sender, EventArgs e)
        {
            toolTip1.SetToolTip(textBox1, "Double click this box");
        }
    }
}