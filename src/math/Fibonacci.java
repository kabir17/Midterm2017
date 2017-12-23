package math;

public class Fibonacci {
    public static void main(String[] args) {
       // declare instance value
        int n, a=0, b=0, c=1;
        System.out.println("Fibonacci : " );
        for(int i=1; i<=40; i++){                // i<=40 declared in question

            a=b;                        // Fibonacci rules adding previous number with present number
            b=c;                           // exm- 0+1=1,1+1=2, 2+1=3,3+2=5, 5+3=8. etc.
            c=a+b;
            System.out.println(a+" ");
        }

    }
}

/*
          Write 40 Fibonacci numbers with java.
         */
