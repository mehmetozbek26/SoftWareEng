#include <cstdlib>
#include <iostream>

using namespace std;


class hesap{
      
      private:
              int a,b;
              
      public:
             hesap(int,int);
             int hesapla () const;
                 
      
      };
hesap::hesap(int x,int y){
                 a=x;
                 b=y;
                 }          

int hesap::hesapla ()const{
    if(a==b)
         cout<<"karenin alani : "<<a*b<<endl;
    if(a!=b) 
         cout<<"dikdortgenin cevresi : "<<2*(a+b)<<endl;      
          
         
          return 0;}

int main(int argc, char *argv[])
{
    int k,y;
    cout<<" iki sayi giriniz : "<<endl;
    
    cin>>k>>y;
    hesap t(k,y);
    t.hesapla();
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
