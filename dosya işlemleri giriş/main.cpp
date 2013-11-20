#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    FILE *ptr;
    //dosya açma iþlemi.....
    ptr=fopen("D:\\kod\\dosya iþlemleri giriþ\\deneme.txt","w");
    
    //karakterleri yazdýr...
    putc('G',ptr);
    putc('m',ptr);
    putc('t',ptr);
    
    //dosyayý kapat....
    fclose(ptr);
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
