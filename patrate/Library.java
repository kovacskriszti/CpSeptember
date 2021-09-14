package patrate;

public class Library {
    public static void main(String[] args) {
        // Sunt instantiate obiectele claselor din care este compusa aplicatia
        // se genereaza un numar aleator stocat intr-o variabila int
        int value = RandomNumbers.getRandom();
        // Pentru verificare se poate vedea in consola numarul generat
        System.out.println("The generated number is " + value);
        int dividedBy2 = value % 2;
        int dividedBy3 = value % 3;
        String color = "red";
        int result = value;
        if (dividedBy2 == 0 && dividedBy3 == 0) {
            color = "Yellow ";
            result = value / 3 + 1;
        } else if (dividedBy2 == 0) {
            color = "green";
            result = value / 2;
        } else if (dividedBy3 == 0) {
            color = "blue";
            result = value / 3;
        }
        new MySquare(result, color);
    } // end of main
} // end of class