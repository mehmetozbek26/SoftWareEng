#include<iostream>
#include <cstdlib>
#include <cstring>
#include <cassert>
#include "calisan1.h"
using namespace std;


//static veri �yelerinin ilk de�erlerinin  atanmas�

int Calisan::sayi=0;


//static �ye fonksiyon bildirimi

int Calisan::sayioku(){return sayi;}


//yap�c�m�z ad ve soyad i�in dinamik bellekay�r�r ve strcpy kullanarak nesnenin i�ine kopyalar..

Calisan::Calisan(const char *first ,const char *last){
 ad=new char[strlen(first)+1];
 assert(ad!=0);  //haf�zn�n ayr�l�p ayr�lmad��� kontrol edilir...
 strcpy(ad,first);
 
 soyad=new char[strlen(last)+1];
 assert(soyad!=0);  //haf�zn�n ayr�l�p ayr�lmad��� kontrol edilir...
 strcpy(soyad,last);
 
 ++sayi; //�al��an static sayisini arttir...
 
 cout <<"calisan yapicisi "<<ad<<" "<<soyad<<" icin cagrilmistir"<<endl;
}


//y�k�c� dinamik olarak ayr�lmi� belle�i bo�alt�r....

Calisan::~Calisan(){
                    cout<<"~calisan yikicisi bu kisi icin cagrilmistir."<<ad<<" "<<soyad<<endl;
                    delete[] ad;
                    delete [] soyad;
                    --sayi;  //cal�san stat�c say�s�n� azalt...
                    }


//ca�san ad�n�dondur...

const char *Calisan::adioku()  const{
      //geri d�n�� tipinden �ncekiconst istemcinin private veriyi de�i�tirmesinni engeller..
      //istemc id�d�r�len stringi belirsiz g�stericiden kac�nmak icin hafiza siinmeden �nce kopyalan�r....
      
      return ad;
      }
      
      //�acl��an soyad�n� d�nd�r�r

const char *Calisan::soyadoku()const{
      //geri d�n�� tipinden �ncekiconst istemcinin private veriyi de�i�tirmesinni engeller..
      //istemc id�d�r�len stringi belirsiz g�stericiden kac�nmak icin hafiza siinmeden �nce kopyalan�r....
      
      return soyad;
      }      
      
                        
                    
                    
                    
