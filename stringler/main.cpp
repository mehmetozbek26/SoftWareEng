#include <cstdlib>
#include <iostream>

using namespace std;
//bilgisayar kelimesinin harflerini altalta yazdirma iþlemi


int main(int argc, char *argv[])
{
    char *dizi={"bilgisayar"};
    int i=0;
    
    while(*(dizi+i)!='\0'){
                  printf("%c\n",*(dizi+i));
                  i++;}    
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
