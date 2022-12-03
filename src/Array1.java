public class Array1 {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
        }
        System.out.print("\n second array");
        System.out.print("\n");

        double[] secondArray = {1.57, 7.654, 9.986};
        for (int y = 0; y < secondArray.length; y++) {
            System.out.println(secondArray[y]);
        }
        System.out.print("\n third array");
        System.out.print("\n");

        int[][] thirdArray = new int[5][5];
        int m,n,k = 0;
        for (m = 0; m < 5; m++)
            for (n=0; n<5; n++) {
                thirdArray[m][n] = k;
                k++;
        }
        for (m = 0; m < 5; m++) {
            for (n=0; n<5; n++)
            System.out.print(thirdArray[m][n]);
                System.out.println();
        }


        //Задание 2
        System.out.println("Задание 2");

        int[] firstArray2 = new int[3];
        firstArray2[0] = 1;
        firstArray2[1] = 2;
        firstArray2[2] = 3;
        for (int i = 0; i < firstArray2.length; i++) {
            System.out.print(firstArray2[i] + ",\t");
        }

        System.out.print("\n");

        double[] secondArray2 = {1.57, 7.654, 9.986};
        for (int y = 0; y < secondArray2.length; y++) {
            System.out.print(secondArray2[y] + ",\t");
        }

        System.out.print("\n");

        int[][] thirdArray2 = new int[5][5];
        int mm,nn,kk = 0;
        for (mm = 0; mm < 5; mm++)
            for (nn=0; nn<5; nn++) {
                thirdArray2[mm][nn] = kk;
                kk++;
            }
        for (mm = 0; mm < 5; mm++) {
            for (nn=0; nn<5; nn++)
                System.out.print(thirdArray2[mm][nn] + ",\t");
            System.out.println();
        }

        //Задание 3
        System.out.println("Задание 3");

        int[] firstArray3 = new int[3];
        firstArray3[0] = 1;
        firstArray3[1] = 2;
        firstArray3[2] = 3;
        for (int i = firstArray3.length - 1; i >= 0; i--) {
            System.out.print(firstArray3[i]+ ",\t");
        }

        System.out.print("\n");

        double[] secondArray3 = {1.57, 7.654, 9.986};
        for (int y = secondArray3.length - 1; y >= 0; y--) {
            System.out.print(secondArray3[y]+ ",\t");
        }
        System.out.print("\n");

        int[][] thirdArray3 = new int[5][5];
        int mmm,nnn = 0;
        int kkk = 24;
        for (mmm = 0; mmm < 5; mmm++)
            for (nnn=0; nnn<5; nnn++) {
                thirdArray3[mmm][nnn] = kkk;
                kkk--;
            }
        for (mmm = 0; mmm < 5; mmm++) {
            for (nnn=0; nnn<5; nnn++)
                System.out.print(thirdArray3[mmm][nnn]+ ",\t");
            System.out.println();
        }

        //Задание 4
        System.out.println("Задание 4");

        int[] forthArray = new int[3];
        forthArray[0] = 1;
        forthArray[1] = 2;
        forthArray[2] = 3;
        for (int i = 0; i < forthArray.length; i++) {
            if(forthArray[i] % 2 != 0){
                forthArray[i] = forthArray[i]+1;
            }
            System.out.print(forthArray[i] + ",\t");
        }

    }
}