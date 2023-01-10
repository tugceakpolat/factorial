import java.util.Scanner;
public class fact {
    public static void main(String[] args) {

       /* int begin;
        int total =1;

        Scanner input = new Scanner(System.in);

        System.out.print("Factorial Number : ");
        begin= input.nextInt();


        for(int start=1; start <= begin; start++ ){
            total *=start;

        }
        System.out.println(begin + ". Factorial : " + total);
       */
        //Combination calculation= C(n,r)

        int n;
        int r;
        int totalN=1;
        int totalR=1;
        int totalNR=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number N : ");
        n= input.nextInt();

        System.out.print("Enter the number R : ");
        r= input.nextInt();

        // N fact. calculate
        for(int start=1; start <= n; start++){
            totalN *=start;
        }
        System.out.print("N Faktorial : " + totalN);

        System.out.println(" ");

        // R fact. calculate
        for(int start=1; start <= r; start++){
            totalR *=start;
        }
        System.out.println("R Factorial : " + totalR);


        // N-R fact.
        for(int start=1; start <= n-r ; start++){
            totalNR *=start;
        }

        int combination = totalN / (totalR *totalNR);

        System.out.println("C (n,r) : " + combination);


        }

    }

