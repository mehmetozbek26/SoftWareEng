#include <cstdlib>
#include <iostream>

//barkd numarasýna göre kitap arama iþlai de yapýlabilir...........
//kütüphane veri taban ý oluþturma.........
using namespace std;

void menu();
void ekle(int );
//kitap bilgileri struct yapýsý...............
typedef struct kitap{
        char kitabismi[25];
        char kitabyazari[25];
        int kitabbarkod;
        }kitapp;
//kullanýc bilgileri struct yapýsý.......        
typedef struct kullanici{
        char kisiismi[25];
        char kisisoyisim[25];
        int kitabbarkod;
        }   id;
                
//deðiþkenlerimizi global olarak tanýmlýyoruz..........        
        kitapp a;
        id b;
        FILE *ptdosya,*ptidosya;
int main(int argc, char *argv[]){
        int x,z,k,j;
        char w[25],r[25],g[25],h[25];
   
         do{
             printf("lutfen menuye uygun bir secim yapiniz\n");
             menu();
             scanf("%d",&x);
             
             switch(x){
                      case 1:
                           ptdosya=fopen("D:\\kod\\kutuphaneveritabani\\bilgi.txt","a");
                           if(ptdosya==NULL)
                           printf("dosya acilamadi\n");
                           printf("eklemek istediginiz kitabi giriniz\n");
                           ekle(x);
                           break;
                      case 2:
                           ptdosya=fopen("D:\\kod\\kutuphaneveritabani\\kimlik.txt","a");
                           if(ptdosya==NULL)
                           printf("dosya acilamadi\n");
                           printf("kitap aln kisi bilgilerini giriniz\n");
                           printf("kisi ismi giriniz\n");
                           ekle(x);
                           break;
                      case 3:
                           printf("lutfen aramak istediginiz kitabin barkod numarasini giriniz\n");
                           scanf("%d",&k);     
                           ptdosya=fopen("D:\\kod\\kutuphaneveritabani\\bilgi.txt","r");
                           if(ptdosya==NULL)
                           printf("dosya acilamadi\n");
                           
                           while(!feof(ptdosya)){
                           fscanf(ptdosya,"%s%s%d",w,r,&j);
                           if(j==k){
                           ptidosya=fopen("D:\\kod\\kutuphaneveritabani\\kimlik.txt","r");
                           if(ptidosya==NULL)
                           printf("dosya acilamadi\n");
                           while(!feof(ptidosya)){
                           fscanf(ptidosya,"%s%s%d",g,h,&z);
                           if(z==k){
                           printf("kitapadi\tkitapyazari\talankisi\talankisisoyisim\tbarkod\n");
                           printf("%s\t\t",w);
                           printf("%s\t",r);
                           printf("%s\t\t",g);
                           printf("%s\t\t",h);
                           printf("%d\n",z);
                           }}
                           fclose(ptidosya);}
                           }                          
                           fclose(ptdosya);
                          
                           break;                      
                           
                                
                           }
                           
             }while(x!=4);
             
             
   
   
    
    system("PAUSE");
    return EXIT_SUCCESS;
}

void menu(){
        printf("\t******************************\n");
        printf("\t******************************\n");
        printf("\t***guncel bilgi gormek icin 3***\n");
        printf("\t***   kisi bilgileri icin 2  ***\n");
        printf("\t***   kitap girisi icin 1  ***\n");
        printf("\t***   cikmak icin 4        ***\n");
        printf("\t******************************\n");
        printf("\t******************************\n");
        }


void ekle(int x){
                           if(x==1){
                           scanf("%s",a.kitabismi);
                           scanf("%s",a.kitabyazari);
                           scanf("%d",&a.kitabbarkod);
                           fprintf(ptdosya,"\n%s\t%s\t%d\n",a.kitabismi,a.kitabyazari,a.kitabbarkod);  
                           fclose(ptdosya);  }
                           if(x==2){
                           scanf("%s",b.kisiismi);
                           scanf("%s",b.kisisoyisim);
                           scanf("%d",&b.kitabbarkod);
                           fprintf(ptdosya,"\n%s\t%s\t%d\n",b.kisiismi,b.kisisoyisim,b.kitabbarkod);  
                           fclose(ptdosya);  }          
                           }                    
