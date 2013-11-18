#include <cstdlib>
#include <iostream>
#define boyut 3
int enbuyuk();
int a[boyut];
using namespace std;

int main(int argc, char *argv[])
{
        int x,y,z;
        
        
        
    //dizi elemanlarý giriliyor
    printf("%d elemangiriniz",boyut);
 for(x=0;x<boyut;x++){
                            scanf("%d",&a[x]);}
                            printf("\n\n\n");
    //dizi ekrana yazdýrýlýyor...          
            for(x=0;x<boyut;x++){
                            printf("%d  ",a[x]);
                            printf("%d  ",a[(boyut-1-x)]);
   //dizinin en büyük elemaný yazdýrýlýyor     
                     if (x==0)
                             enbuyuk();                         
                             printf("\n");}
                         
                             printf("\n\n\n");
            
    system("PAUSE");
    return EXIT_SUCCESS;
}


int enbuyuk(){
     int x,y;
     int  z=a[0];
            for(x=0;x<boyut;x++){                   
                          if(a[x]>z)
                                z=a[x];}                         
                                printf("%d",z);          
     return 0;  }                    
