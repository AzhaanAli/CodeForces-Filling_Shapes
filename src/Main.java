import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        System.out.println(fOfN(n));


    }

    public static int fOfN(int n){

        // If an input is odd, there is no possible way to fit the shapes into it.
        // This is because odd inputs mean odd numbers of squares, and only an even amount of shapes can fill an even amount of squares.

        // When the input is even, each additional two columns allows an additional 2 possible arrangements.
        // This means that for every 2 columns, there are 2 times the total arrangements.
        // In terms of input n, this translates to 2^(n/2) or sqrt(2^n).
        return (n & 1) == 1? 0 : (int) Math.pow(2, n >> 1);

    }

}