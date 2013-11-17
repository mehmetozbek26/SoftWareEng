#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    FILE *ptdosya;
    char ch;
    ptdosya=fopen("D:\\kod\\dosyadankarakter okumak\\ornek.txt","r");
    
    
    //bir karakter  okumak
    ch=getc(ptdosya);
    
    
    //okunan karakteriekrana yaz
    printf("dosyadan okunan karakter :%c",ch);
    
    //dosyayýkapat
    
    fclose(ptdosya);
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
