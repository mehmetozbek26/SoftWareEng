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
    public partial class Deletestudentform : Form
    {
        public Deletestudentform()
        {
            InitializeComponent();
        }
        private void button3_Click(object sender, EventArgs e)
        {
            txtdelstureg.Clear();
        }
        private void btndelexit_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        SqlConnection con = new SqlConnection("server=.;uid=sa;pwd=niit;database=shivammodel");
        SqlDataAdapter adap;
        string qry;
        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                qry = "select *from insertstudent where regno='" + txtdelstureg.Text + "'";
                //MessageBox.Show(qry);
                adap = new SqlDataAdapter(qry, con);
                DataSet ds = new DataSet();
                adap.Fill(ds);
                dataGridView1.DataSource = ds.Tables[0];
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        SqlCommand cmd;
        int row;
        private void button2_Click(object sender, EventArgs e)
        {
            qry = "delete insertstudent where regno='" + txtdelstureg.Text + "'";
            cmd = new SqlCommand(qry, con);
            con.Open();
            row = cmd.ExecuteNonQuery();
            if (row > 0)
            {
                MessageBox.Show("Deletion Successful");
            }
            else
            {
                MessageBox.Show("Process Not Completed");

            }
            con.Close();
        }
    }
}