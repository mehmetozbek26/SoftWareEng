#include <cstdlib>
#include <iostream>
#include <string.h>
using namespace std;


void  menu();


int main(int argc, char *argv[])
{
    struct kayit{
           char isim[15];
           char soyad[20];
           int telno;
           };
           
    int secim;
    FILE *ptdosya;
    struct kayit ad;
    struct kayit ado;
    char isim[15];
    do{ 
        menu();
        scanf("%d",&secim);
             switch(secim){
                    case 1:
                        if((ptdosya=fopen("D:\\kod\\telefon rehberi\\telno.txt","a"))==NULL){
                             printf("dosya acilamadi\n");}
                        printf("\n\n");
                        printf("ekleyeceginiz ismi giriniz max 15 karakter\n");
                        scanf("%s",ad.isim);
                        printf("\neklenen kisinin soyismini giriniz max 20 karakter\n");
                        scanf("%s",ad.soyad);
                        printf("\neklenen kisinin numarasini girin\n");
                        scanf("%d",&ad.telno);
                        fprintf(ptdosya,"\n%s\t%s\t%d\n",ad.isim,ad.soyad,ad.telno);
                        fclose(ptdosya);
                         break;
                    case 2:
                        if((ptdosya=fopen("D:\\kod\\telefon rehberi\\telno.txt","r"))==NULL){
                             printf("acmaya calistiginiz dosya mevcut degil\n");}
                             printf("lutfen aramak istediginiz ismi(max 15 karakter) giriniz\n");
                             scanf("%s",isim);
                        while(!feof(ptdosya)){
                             fscanf(ptdosya,"%s%s%d",ad.isim,ad.soyad,&ad.telno);              
                        if(!strcmp(isim,ad.isim)){
                             printf("%s\t\t\t",ad.isim);
                             printf("%s\t\t\t",ad.soyad);
                             printf("%d\n",ad.telno);}}
                             fclose(ptdosya);                    
                                                
                         
                         break;
                    case 3:
                         if((ptdosya=fopen("D:\\kod\\telefon rehberi\\telno.txt","r"))==NULL){
                             printf("acmaya calistiginiz dosya mevcut degil\n");}
                             printf("ad\t\t\tsoyad\t\t\ttelno\n");
                             while(!feof(ptdosya)){
                             fscanf(ptdosya,"%s%s%d",ad.isim,ad.soyad,&ad.telno);
                             printf("%s\t\t\t",ad.isim);
                             printf("%s\t\t\t",ad.soyad);
                             printf("%d\n",ad.telno);
                             }
                             fclose(ptdosya);                                
                         break;
                    case 4:
                         printf("programi kullandiginiz icin tesekkurler\n\n");
                         break;
                    default:
                            printf("lufen 1-4 arasinda bir secim yapiniz\n");     
                         }
         }while(secim!=4);
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
void menu(){
     printf("\t\t*******************************\n");
     printf("\t\t**  lutfen isleminizi secin  **\n");
     printf("\t\t**  tel eklemek icin 1 basin **\n");
     printf("\t\t**  tel aramak icin 2 basin  **\n");
     printf("\t\t**  listelemek icin 3 basin  **\n");
     printf("\t\t**   cikmak icin 4 basin     **\n");
     printf("\t\t*******************************\n");
      
      } 
