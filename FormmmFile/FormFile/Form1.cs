using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Collections;

namespace AskerDagitimProgrami
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // Textboxdaki veriyi kontrol ediyorum, boşmu, null mu??

            if (textBox1.Text == "" || textBox1.Text == null || textBox1.Text == "  " || textBox1.Text == " ")
            {
                MessageBox.Show("Lütfen Bilgi Giriniz");
            }

            else
            {
                /* Veri girdikten sonra veri büyük harflere çevrilip, listboxa ekleniyor. 
                Tekrar textbox1 e odaklanılıyor, imleç buraya alınıyor, textbox temizleniyor.
                 */

                listBox1.Items.Add(textBox1.Text.ToUpper());
                textBox1.Focus();

            }
            textBox1.Clear();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            // Textboxdaki veriyi kontrol ediyorum, boşmu, null mu??

            if (textBox2.Text == "" || textBox2.Text == null || textBox2.Text == "  " || textBox2.Text == " ")
            {
                MessageBox.Show("Lütfen Bilgi Giriniz");
            }

            else
            {
                /* Veri girdikten sonra veri büyük harflere çevrilip, listboxa ekleniyor. 
                Tekrar textbox2 e odaklanılıyor, imleç buraya alınıyor, textbox temizleniyor.
                 */

                listBox2.Items.Add(textBox2.Text.ToUpper());
                textBox2.Focus();

            }
            textBox2.Clear();

        }

        private void button3_Click(object sender, EventArgs e)
        {
            listBox3.Items.Clear();
            //Dinamik dizi yapısı kullanıyorum eleman girdikçe boyutu büyüyecek çünkü
            ArrayList askeradaylari = new ArrayList();
            ArrayList iller = new ArrayList();
            Random rasgele = new Random();  // random sınıfım.. 
            /* listbox1 diziye ekleniyor, ADDrange ile birden fazla elemanı ekleme imkanım var, aynı şekilde listbox2 de ekleniyor */
            askeradaylari.AddRange(listBox1.Items);
            iller.AddRange(listBox2.Items);

            // eğer asker adayları ve il sayım eşit ise;

            if (askeradaylari.Count == iller.Count)
            {
                int askersayisi = askeradaylari.Count;

                // asker sayısınca for döngüsü yapıyorum, rasgele rakam bu sayıya bağlı dinamik olarak, gelen rakamı bir değere alıyorum,
                // daha sonra listbox3 e dağıtım olarak ekliyorum, daha sonra geleni siliyorum, (REMOVEAT) ilgili gelen değeri sildiğim için, 
                // bir sonraki değerin indeksi - 1 oluyor. Böylece gelen aday ve gelen il bir daha gelmiyor.
                for (int i = 0; i < askersayisi; i++)
                {

                    int gelenaday = rasgele.Next(0, askeradaylari.Count);
                    int gelenil = rasgele.Next(0, iller.Count);
                    listBox3.Items.Add(askeradaylari[gelenaday].ToString() + "     " + iller[gelenil].ToString());
                    askeradaylari.RemoveAt(gelenaday);
                    iller.RemoveAt(gelenil);
                }
            }




            // eğer asker sayısı ilden fazla ise; Dikkat edilecek nokta : her ile en az bir asker mutlaka gelmesi gerektiği için, iller dizimi yedek bir diziye daha atıyorum.

            if (askeradaylari.Count > iller.Count)
            {
                // asker sayısınca for döngüsü yapıyorum, rasgele rakam bu sayıya bağlı dinamik olarak, gelen rakamı bir değere alıyorum,
                // daha sonra listbox3 e dağıtım olarak ekliyorum, daha sonra geleni siliyorum, ilgili gelen değeri sildiğim için, 
                // bir sonraki değerin indeksi - 1 oluyor. Böylece gelen aday bir daha gelmiyor

                int askersayisi = askeradaylari.Count;
                // eğer asker sayısı ilden fazla ise; Dikkat edilecek nokta : her ile en az bir asker mutlaka gelmesi gerektiği için, iller dizimi yedek bir diziye daha atıyorum.
                ArrayList YedekListeiller = new ArrayList();
                YedekListeiller.AddRange(iller);


                for (int i = 0; i < askersayisi; i++)
                {
                    int gelenaday = rasgele.Next(0, askeradaylari.Count);
                    int gelenil;
                    if (iller.Count != 0)
                    {
                        gelenil = rasgele.Next(0, iller.Count);
                        listBox3.Items.Add(askeradaylari[gelenaday].ToString() + "     " + iller[gelenil].ToString());
                        iller.RemoveAt(gelenil);
                    }

                    else
                    {
                        gelenil = rasgele.Next(0, YedekListeiller.Count);
                        listBox3.Items.Add(askeradaylari[gelenaday].ToString() + "     " + YedekListeiller[gelenil].ToString());
                    }

                    askeradaylari.RemoveAt(gelenaday);
                }

            }

            // asker sayısınca for döngüsü yapıyorum, rasgele rakam bu sayıya bağlı dinamik olarak, gelen rakamı bir değere alıyorum,
            // daha sonra listbox3 e dağıtım olarak ekliyorum, daha sonra geleni siliyorum, ilgili gelen değeri sildiğim için, 
            // bir sonraki değerin indeksi - 1 oluyor. Böylece gelen aday ve gelen il bir daha gelmiyor.
            //Eğer iller fazla ise, Dikkat edilecek nokta : her ile en az bir asker mutlaka gelecek, dolayısı ile gelen ili siliyorum
            if (askeradaylari.Count < iller.Count)
            {
                int askersayisi = askeradaylari.Count;
                for (int i = 0; i < askersayisi; i++)
                {
                    int gelenaday = rasgele.Next(0, askeradaylari.Count);
                    int gelenil = rasgele.Next(0, iller.Count);
                    listBox3.Items.Add(askeradaylari[gelenaday].ToString() + "     " + iller[gelenil].ToString());
                    askeradaylari.RemoveAt(gelenaday);
                    iller.RemoveAt(gelenil);
                }

            }

        }

        private void button4_Click(object sender, EventArgs e)
        {
            listBox3.Items.Clear();
            listBox1.Items.Clear();
            listBox2.Items.Clear();
        }
    }
}