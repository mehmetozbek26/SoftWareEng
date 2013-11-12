#include <cstdlib>
#include <iostream>

using namespace std;

class islem {
      private:
              int a,b;
              
      public:        
             islem(int , int);
             int carp() const;
             int topla() const;
                     
};

islem::islem(int k,int j){
                 a=k;
                 b=j;}
int islem::carp() const{
     cout<< "girilen sayilarin carpimlarinin sonucu: "<<a*b<<endl;
     return a*b;}
int islem::topla() const{
         cout<< "girilen sayilarin toplamlarinin sonucu: "<<a+b<<endl;
                return a+b;         }
               

int main(int argc, char *argv[])
{ 
    const islem t(4,5);
    t.topla();
    t.carp();
  
  
    system("PAUSE");
    return EXIT_SUCCESS;
}
