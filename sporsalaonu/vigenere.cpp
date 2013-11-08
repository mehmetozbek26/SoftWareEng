// MEHMET �ZBEK---152120091047

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

for(i=0;i<26;i++){ // i her bir sat�r�n numaras�.
for(j=0;j<(27-i);j++){ // j ise sat�rdaki her harf, sat�r sonu NULL ile bitmeli
tablo[i][j]=alfabe[i+j]; // bu y�zden j d�ng�s� 27 kere d�n�yor ve alfabenin NULL 
// karakterini de sat�r�n sonuna ekliyor. 
if((i+j)==26){ // Karakterin sonuna alfabenin ba��ndaki harfleri eklemek i�in
for(k=0;k<i;k++) // �rne�in CDEF diye giderken Z ye ula��nca kalan k�s�mlar� ABCD diye
tablo[i][j+k]=alfabe[k]; // doldurmal�y�z. Bu d�ng� kalan k�s�mlar� dolduruyor.
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


