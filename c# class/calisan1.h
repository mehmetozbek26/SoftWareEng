#ifndef CALISAN_H
#define CALISAN_H


class Calisan{
      
      public :
             Calisan(const char *,const char *); //yap�c�m�z
             ~Calisan(); //y�k�c� y�k�c�lar parametre almazlar...
             const char *adioku() const; //ad okuma fonksiyonu
             const char *soyadoku() const; //soyisim okuma fonksiyonu.
           
             static int sayioku(); //statikfonksiyonn
      
      private:
              char *ad;
              char *soyad;
              
              static int sayi; //statc veri �yesi
              
              };
              
              #endif
              
              
              
              
              
              
               
              
              
      
      
      
      
