#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    FILE *ptr;
    //dosya a�ma i�lemi.....
    ptr=fopen("D:\\kod\\dosya i�lemleri giri�\\deneme.txt","w");
    
    //karakterleri yazd�r...
    putc('G',ptr);
    putc('m',ptr);
    putc('t',ptr);
    
    //dosyay� kapat....
    fclose(ptr);
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
