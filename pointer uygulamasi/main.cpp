#include <cstdlib>
#include <iostream>
#include <time.h>
int deneme(int []);

using namespace std;

int main(int argc, char *argv[])
{
    int adzi[5];
    int x,y;
    
     
      //dizimize ilk değerler randomfonksiyonu ile atanıyor
       srand(time(NULL));
    for(x=0;x<5;x++){
                         adzi[x]=rand()%20+1 ;      }
                         
     //izimiz ekrana yazdırılıyor
   for(y=0;y<5;y++){
                         printf("%d\n",adzi[y]);}
                         
                         
    //fonksiyonumuz çağrılıyor
    
    deneme(adzi);
    
    system("PAUSE");
    return EXIT_SUCCESS;
}



int deneme(int *dzi){
    
    int x,y,z;
    int ort,top=0;
   
    //dizinin elemanlarını toplamı  alınıyor
    for(x=0;x<5;x++){
           top+=dzi[x];          
                     }
                     
          ort=top/5;   
    //dizimizin elemanlarını ortalama ile kıyaslıyoruz      
          printf("dizi elemanlarinin ortalamasi %d\n",ort);
          printf("ortalama ile dizi elemanlari kiyaslaniyor\n");
    for(y=0;y<5;y++){               
                if(ort>dzi[y])
                printf("1\n");
                if(ort<dzi[y])
                printf("0\n");
                if(ort==dzi[y])
                printf("-1\n");}
     //dizimizinelemanları nı geriçağırıyoruz
     
          printf("\ndizi elemanlari tekrar yazdiriliyor\n");
   for(z=0;z<5;z++){               
                if(ort>dzi[z])
                printf("%d\n",dzi[z]);
                if(ort<dzi[z])
                printf("%d\n",dzi[z]);
                if(ort==dzi[z])
                printf("%d\n",dzi[z]);}             
    
    return 0;
    }
