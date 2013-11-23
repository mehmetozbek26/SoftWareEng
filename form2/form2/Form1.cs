using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.OleDb;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace 
{
    public partial class Form2 : Form
    {
        public Form1 frm1;
        public Form3 frm3;
        public Form4 frm4;
        public Form5 frm5;

        public OleDbConnection bag = new OleDbConnection("Provider=Microsoft.Jet.OleDb.4.0;Data Source=seyda.mdb");
        public OleDbCommand kmt = new OleDbCommand();
        public OleDbDataAdapter adtr = new OleDbDataAdapter();
        public DataSet dtst = new DataSet();

        public void ogrenci()
        {
            bag.Open();
            OleDbDataAdapter adtr = new OleDbDataAdapter(" Select * from ogr ", bag);
            adtr.Fill(dtst, "ogr");
            dataView1.Table = dtst.Tables[0];
            dataGridView1.DataSource = dataView1;
            bag.Close();
        }

        public void velibil()
        {
            bag.Open();
            OleDbDataAdapter adtr = new OleDbDataAdapter(" Select * from veli ", bag);
            adtr.Fill(dtst, "veli");
            dataView2.Table = dtst.Tables[1];
            dataGridView2.DataSource = dataView2;
            bag.Close();
        }

        public void odev()
        {
            bag.Open();
            OleDbDataAdapter adtr = new OleDbDataAdapter(" Select * from ödev ", bag);
            adtr.Fill(dtst, "ödev");
            dataView3.Table = dtst.Tables[2];
            dataGridView3.DataSource = dataView3;
            bag.Close();

        }

        
        

        public Form2()
        {
            InitializeComponent();
            frm3 = new Form3(); 
            frm4 = new Form4();
            frm5 = new Form5();
            frm1 = new Form1();
            frm3.frm2 = this;
          
            frm4.frm2 = this;
            frm5.frm2 = this;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            frm3.Show();
            this.Hide();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            ogrenci();
            velibil();
            odev();

        }

        private void button4_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            frm4.Show();
            this.Hide();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            frm5.Show();
            this.Hide();

        }
    }
}
