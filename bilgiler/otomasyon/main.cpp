#include <cstdlib>
#include <iostream>

using namespace std;
//hastane otomasyon sistemi 

typedef struct hastakimlik {
        char *ad;
        char *soyad;
        int no;
        int tcno;
        int id;
        }Kimlik;
        
typedef struct polkimlik {
        char *poladi;
        int numara;
        int id;
        char *doktorad;
        }Poliklinik;        
int main(int argc, char *argv[])
{
    Kimlik adam[3];
    Poliklinik nayer[3];
    int a;
    
    adam[0].ad="ahmet";
    adam[0].soyad="mutlu";
    adam[0].no=12;
    adam[0].tcno=12345;
    adam[0].id=1;
    
    adam[1].ad="veli";
    adam[1].soyad="dertsiz";
    adam[1].no=13;
    adam[1].tcno=17325;
    adam[1].id=2;
    
    adam[2].ad="halit";
    adam[2].soyad="kutlu";
    adam[2].no=21;
    adam[2].tcno=19875;
    adam[2].id=3;
    
    //poliklinik bilgileri giriliyor.....
    
    nayer[0].poladi="kulak";
    nayer[0].id=1;
    nayer[0].numara=89;
    nayer[0].doktorad="faik";
    
    nayer[1].poladi="dahiliye";
    nayer[1].id=2;
    nayer[1].numara=99;
    nayer[1].doktorad="utku";
    
    nayer[2].poladi="goz";
    nayer[2].id=3;
    nayer[2].numara=83;
    nayer[2].doktorad="ceng";
    
    printf("1-3 arasinda bir id numarasi  giriniz\n");
    //kayýtlý olan id bilgilerinin bulunmasý.....
       do  {                scanf("%d",&a);
                            printf("\n\n");
                            if(a!=1&&a!=2&&a!=3)
                            printf("girilen id de kayit bulunamadi \n");}
                            while(a!=1&&a!=2&&a!=3);
        //otomasyon sisteminin listelendirme þekli....
    printf("hasta adi   hasta soyadi   id numarasi   poliklinik adi   doktor adi\n\n");
    
    //id numarasýna göre hasta ve doktorilgileriekrana yazdirilsin....
    if(a==1){
             printf("%s\t   ",adam[0].ad);
             printf("%s\t\t    ",adam[0].soyad);
             printf("%d\t ",adam[0].id);
             printf("%s\t\t    ",nayer[0].poladi);
             printf("%s   \n\n",nayer[0].doktorad);}
             
     if(a==2){
             printf("%s\t   ",adam[1].ad);
             printf("%s\t\t    ",adam[1].soyad);
             printf("%d\t ",adam[1].id);
             printf("%s\t\t    ",nayer[1].poladi);
             printf("%s   \n\n",nayer[1].doktorad);}
    
     if(a==3){
             printf("%s\t   ",adam[2].ad);
             printf("%s\t\t    ",adam[2].soyad);
             printf("%d\t ",adam[2].id);
             printf("%s\t\t    ",nayer[2].poladi);
             printf("%s   \n\n",nayer[2].doktorad);}
             
    
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
