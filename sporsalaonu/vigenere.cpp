// MEHMET ÖZBEK---152120091047

#include <cstdlib>
#include <iostream>
#include <stdio.h>

using namespace std;


void sifrele (void);
void sifrecoz(void);
char alfabe[]="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
char tablo[27][27]={0}; // Vigenere tablomuz.

int main(int argc, char *argv[]){


int i,j,k;
char tercih;

for(i=0;i<26;i++){ // i her bir satýrýn numarasý.
for(j=0;j<(27-i);j++){ // j ise satýrdaki her harf, satýr sonu NULL ile bitmeli
tablo[i][j]=alfabe[i+j]; // bu yüzden j döngüsü 27 kere dönüyor ve alfabenin NULL 
// karakterini de satýrýn sonuna ekliyor. 
if((i+j)==26){ // Karakterin sonuna alfabenin baþýndaki harfleri eklemek için
for(k=0;k<i;k++) // örneðin CDEF diye giderken Z ye ulaþýnca kalan kýsýmlarý ABCD diye
tablo[i][j+k]=alfabe[k]; // doldurmalýyýz. Bu döngü kalan kýsýmlarý dolduruyor.
}
}
}
do {
    system("cls");
printf("Sifrelemek icin 1\nSifre cozmek icin 2\nCikis icin 0\nSeciminizi girin : ");
scanf("%c",&tercih);

if(tercih=='1') sifrele();
else if(tercih=='2') sifrecoz();
else if(tercih=='0') return 0;
else printf("Hatali Tercih !\n");
} while(1);



}

void sifrele(void){

int i;
char yazi[256]={0};
char anahtar[256]={0};
char sonuc[256]={0};

printf("Sifrelenecek Yaziyi Girin :");
scanf("%s",yazi);
printf("Anahtar Kelimeyi girin :");
scanf("%s",anahtar);

for(i=0;i<strlen(yazi);i++){
if(!(isalpha(yazi[i]) || isalpha(anahtar[i]))){
printf("Girdigin yazi harf disinda karakterler iceriyor !\n");

}
else {
yazi[i]=toupper(yazi[i]);
anahtar[i]=toupper(anahtar[i]);
}}

for(i=0;i<strlen(yazi);i++){
int j,k;
j=yazi[i]-65;
k=anahtar[i%strlen(anahtar)]-65;
sonuc[i]= tablo[j][k];
}

printf("Sonuc : %s\n",sonuc);
system("PAUSE");
}


void sifrecoz(void){

int i;
char yazi[256]={0};
char anahtar[256]={0};
char sonuc[256]={0};

printf("Cozulecek Yaziyi Girin :");
scanf("%s",yazi);
printf("Anahtar Kelimeyi girin :");
scanf("%s",anahtar);

for(i=0;i<strlen(yazi);i++){
if(!(isalpha(yazi[i]) || isalpha(anahtar[i]))){
printf("Girdigin yazi harf disinda karakterler iceriyor !\n");

}
else {
yazi[i]=toupper(yazi[i]);
anahtar[i]=toupper(anahtar[i]);
}}

for(i=0;i<strlen(yazi);i++){
int j,k,l;
j=yazi[i]-65;
k=anahtar[i%strlen(anahtar)]-65; 

for(l=0;l<(27-i);l++){
if(tablo[k][l]==yazi[i])
sonuc[i]=tablo[0][l];

}


    
    
}
printf("sonuc %s\n",sonuc);
system("PAUSE");

}


