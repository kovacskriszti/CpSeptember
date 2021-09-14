#include <iostream>
/* Compilat pe Ubuntu 20.04 cu comanda:
* g++ returnarePublicatii.cpp
*/


using namespace std;

int main() {
    // setarea unui seed pemtru generarea numerelor random]
    srand(time(0));
    // generarea unui numar random
    int randnr=rand()%10+1;
    // obtinerea restului impartiirii la 2 si 3 a numarului random generat
    int dividedBy2=randnr%2;
    int dividedBy3=randnr%3;
    int result; // Variabila care va tine numarul de publicatii care trebuie returnate 
    // sunt verificate pe rand conditiile posibile, asignadu-se lui result valoarea corespunzatoare fiecarui caz. Pentru verificare sunt folosite variabilele calculate mai sus. Valoarea 0 indica impartirea exacta la numarul corespunzator (2 sau 3))
    if(dividedBy2!=0&&dividedBy3!=0)
    result=randnr;
    else if(dividedBy2==0&&dividedBy3==0)
    result=randnr/2+1;
    else if(dividedBy2==0)
    result=randnr/2;
    else if(dividedBy3==0)
    result=randnr/3;
    // afisarea rezultatului
    cout << "Utilizatorul este rugat sa restutuie " << result << " publicatii!"<< endl;
    cout << "Numarl a fost" << randnr;
}