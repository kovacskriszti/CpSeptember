package patrate;

// O clasa pentru desenarea patratelor
public class MySquare{
    // Culoarea pentru a fi desenata
    private String  color;
    private int number;
    private int horizontalPosition=0;
    private int verticalPosition=0;

    public MySquare(int pNumber, String pColor) {
        number=pNumber;
        color=pColor;
        for(int i=0; i<number; i++) {
            draw();
            horizontalPosition++;
        }
    }

    private void draw() {
        Square sqr=new Square();
        // Este schimbata culoarea. Desi aici variabila pentru culoare e goala, clasele mostenitoare vor seta in constructor culoarea in functie de valoare
        sqr.changeColor(color);
        // Sunt apelate doua functii definite mai jos, in cadrul carora metodele moveRight si moveDown ale clasei Square sunt apelate pentru a deplasa patratul si a crea asezarea in fereastra.
        setHorizontalPosition(sqr, horizontalPosition);
        setVerticalPosition(sqr, verticalPosition);
        // Patratul este afisat.
        sqr.makeVisible();
    }

    // Cele doua functii de mai jos sunt aproape identice, una deplasand patratul in dreapta iar cealalta in jos.
    protected void setVerticalPosition(Square sqrReference, int pos)
    {
        // pos e exprimat in numere intregi relativ la coltul din stanga sus. De exemplu, numarul 2 vertical inseamna al treilea rand de sus in jos.
        // For-ul impinge patratul in dreapta sau in jos de cate ori este nevoie pentru a ajunge la pos.
        for(int i=0; i<pos; i++)
        {
            // Functie este apelata de doua ori pentru a nu suprapune patratele.
            sqrReference.moveDown();
            sqrReference.moveDown();
        }
    }

    // Acelas lucru ca mai sus
    protected void setHorizontalPosition(Square sqrReference, int pos)
    {
        for(int i=0; i<pos; i++)
        {
            sqrReference.moveRight();
            sqrReference.moveRight();
        }
    }
} // end class