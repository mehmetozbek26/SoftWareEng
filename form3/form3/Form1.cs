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
    public partial class Form3 : Form
    {
        public Form2 frm2;

        public Form3()
        {
            InitializeComponent();
        }

        private void Form3_Load(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Close();

        }

        private void button6_Click(object sender, EventArgs e)
        {
            frm2.frm5.Show();
            this.Hide();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            frm2.bag.Open();
            frm2.kmt.Connection = frm2.bag;
            frm2.kmt.CommandText = "INSERT INTO ogr(numarasi,adi,soyadi,sinifi,cinsiyeti,bölümü,dali,ev_adresi,posta_kodu,semt,sehir) VALUES ('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + textBox4.Text + "','" + textBox5.Text + "','" + textBox6.Text + "','" + textBox7.Text + "','" + textBox8.Text + "','" + textBox9.Text + "','" + textBox10.Text + "','" + textBox11.Text + "')";
            frm2.kmt.ExecuteNonQuery();
            frm2.bag.Close();
            frm2.kmt.Dispose();
            frm2.dtst.Clear();
            frm2.ogrenci();
            frm2.velibil();
            frm2.odev();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            frm2.bag.Open();
            frm2.kmt.Connection = frm2.bag;
            frm2.kmt.CommandText = "DELETE FROM ogr WHERE numarasi = '" + textBox1.Text + "'";
            frm2.kmt.ExecuteNonQuery();
            frm2.bag.Close();
            frm2.kmt.Dispose();
            frm2.dtst.Clear();
            frm2.odev();
            frm2.ogrenci();
            frm2.velibil();

        }

        private void button7_Click(object sender, EventArgs e)
        {
            frm2.bag.Open();
            frm2.kmt.Connection = frm2.bag;
            frm2.kmt.CommandText = "UPDATE ogr SET numarasi='" + textBox1.Text + "' , adi='" + textBox2.Text + "',soyadi='" + textBox3.Text + "', sinifi='" + textBox4.Text + "',cinsiyeti='" + textBox5.Text + "',bölümü='" + textBox6.Text + "',dali ='" + textBox7.Text + "',ev_adresi='" + textBox8.Text + "',posta_kodu='" + textBox9.Text + "',semt='" + textBox10.Text + "', sehir='" + textBox11.Text + "',telefon='" + textBox12.Text + "',cep_telefon='" + textBox13.Text + "'";
            frm2.kmt.ExecuteNonQuery();
            frm2.kmt.Dispose();
            frm2.bag.Close();
            frm2.dtst.Clear();
            frm2.odev();
            frm2.ogrenci();
            frm2.velibil();

        }

        private void button8_Click(object sender, EventArgs e)
        {


        }

        private void button5_Click(object sender, EventArgs e)
        {
            frm2.frm4.Show();
            this.Hide();

        }

        private void button4_Click(object sender, EventArgs e)
        {
            frm2.Show();
            this.Hide();

        }
    }
}
