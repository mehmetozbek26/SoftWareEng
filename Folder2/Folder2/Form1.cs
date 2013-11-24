using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Folder2
innamespace faktoriyel_hesaplam
{
public partial class Form1 : Form
{
public Form1()
{
InitializeComponent();
}
public static class islem
{
public static void azalt(ref int s1)
{
s1--;
}
public static void arttir(ref int s1)
{
s1++;
}
public static int faktoriyel(int sayi)
{
int sonuc = 1;
for (int i = 1; i <= sayi; i++)
{
sonuc *= i;

}
return sonuc;
}
}
int sonuc;
private void button1_Click(object sender, EventArgs e)
{
int sayi = Convert.ToInt32(textBox1.Text);
sonuc = islem.faktoriyel(sayi);
label1.Text = "sonuc:" + sonuc.ToString();

}

private void button3_Click(object sender, EventArgs e)
{
int sayi = Convert.ToInt32(textBox1.Text);
islem.azalt(ref sayi);
textBox1.Text = sayi.ToString();
sonuc = islem.faktoriyel(sayi);
label1.Text = sonuc.ToString();
}

private void button2_Click(object sender, EventArgs e)
{
int sayi = Convert.ToInt32(textBox1.Text);
islem.arttir(ref sayi);
label1.Text = sonuc.ToString();
textBox1.Text = sayi.ToString();
}
}
}
28 Kasım 2013 21:34
 Adsız dedi ki...
namespace WindowsFormsApplication1
{
public partial class Form1 : Form
{
public Form1()
{
InitializeComponent();
}

public static int []atoz(int []w)
{
for(int i=1; iw[i-1])
{
int tasiyiciSayi=w[j];
w[i]=w[i-1];
w[i-1]=tasiyiciSayi;
}
}


return w;
}
public static int[] ztoo(int[] d)
{
for (int i = 1; i < d.Length; i++)
{
for (int j = i; j >= 1; j--)
{
if (d[j] < d[j - 1])
{
int tasiyiciSayi = d[j];
d[j] = d[j - 1];
d[j - 1] = tasiyiciSayi;
}
}

}
return d;
}
int[] dizi = new int[10];
byte i;
int d;

private void button1_Click(object sender, EventArgs e)
{
int sayac = 0;
try
{
for (i = 0; i < 10; i++)
{
sayac++;
dizi[i] = int.Parse(Microsoft.VisualBasic.Interaction.InputBox(sayac + "sayıyı girin", "sayi girişi", "", 100, 100));
if (dizi[i] == 0) break;
}
}
catch (FormatException)
{
MessageBox.Show("hatalı giriş");
i--;
}
}

private void button2_Click(object sender, EventArgs e)
{
listBox1.Items.Clear();
foreach (int nesne in dizi)
if (nesne != 0)
listBox1.Items.Add(nesne.ToString());
}

private void button3_Click(object sender, EventArgs e)
{

listBox1.Items.Clear();
dizi = sıralama.ztoo(dizi);
for (int i = 0; i < dizi.Length; i++)
{
if (dizi[i] != 0)
listBox1.Items.Add(dizi[i]);
}

}

private void button4_Click(object sender, EventArgs e)
{
listBox1.Items.Clear();
dizi=sıralama.atoz(dizi);
for(int i=0; i<dizi.Length;i++)
{
if(dizi[i]!=0)
ListBox1.Items.Add(dizi[i]);
}

}
}
}