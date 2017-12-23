package math;

public class MakePyramid {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int k = 0;

        for (i = 0; i<10; i++) {                //use three for loop for pyramid
            for (j = 0; j <10 -i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k<i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

//   Implement a large Pyramid of stars in the screen with java.
//
//                    *
//                   * *
//                  * * *
//                 * * * *
//                * * * * *
//               * * * * * *

//Start Here

