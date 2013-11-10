#include<iostream>
#include <cstdlib>
#include <cstring>
#include <cassert>
#include "calisan1.h"
using namespace std;


//static veri üyelerinin ilk deðerlerinin  atanmasý

int Calisan::sayi=0;


//static üye fonksiyon bildirimi

int Calisan::sayioku(){return sayi;}


//yapýcýmýz ad ve soyad için dinamik bellekayýrýr ve strcpy kullanarak nesnenin içine kopyalar..

Calisan::Calisan(const char *first ,const char *last){
 ad=new char[strlen(first)+1];
 assert(ad!=0);  //hafýznýn ayrýlýp ayrýlmadýðý kontrol edilir...
 strcpy(ad,first);
 
 soyad=new char[strlen(last)+1];
 assert(soyad!=0);  //hafýznýn ayrýlýp ayrýlmadýðý kontrol edilir...
 strcpy(soyad,last);
 
 ++sayi; //çalýþan static sayisini arttir...
 
 cout <<"calisan yapicisi "<<ad<<" "<<soyad<<" icin cagrilmistir"<<endl;
}


//yýkýcý dinamik olarak ayrýlmiþ belleði boþaltýr....

Calisan::~Calisan(){
                    cout<<"~calisan yikicisi bu kisi icin cagrilmistir."<<ad<<" "<<soyad<<endl;
                    delete[] ad;
                    delete [] soyad;
                    --sayi;  //calýsan statýc sayýsýný azalt...
                    }


//caýsan adýnýdondur...

const char *Calisan::adioku()  const{
      //geri dönüþ tipinden öncekiconst istemcinin private veriyi deðiþtirmesinni engeller..
      //istemc idödürülen stringi belirsiz göstericiden kacýnmak icin hafiza siinmeden önce kopyalanýr....
      
      return ad;
      }
      
      //çaclýþan soyadýný döndürür

const char *Calisan::soyadoku()const{
      //geri dönüþ tipinden öncekiconst istemcinin private veriyi deðiþtirmesinni engeller..
      //istemc idödürülen stringi belirsiz göstericiden kacýnmak icin hafiza siinmeden önce kopyalanýr....
      
      return soyad;
      }      
      
                        
                    
                    
                    
