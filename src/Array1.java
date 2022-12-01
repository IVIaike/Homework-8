public class Array1 {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
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
            System.out.print(thirdArray[m][n] + "\t");
                System.out.println();
        }

        // int[] weights = {90,91,93,92,85,87,88,89,0,0,0,0};
        //weights[0] = 90;
        //int januaryWeight = weights[0];
        //System.out.println(januaryWeight);
        //System.out.println(weights[0]);
        //System.out.println(weights[11]);
        //int january = 0;
        //System.out.println(weights[january]);
        //for (int i = 0; i < weights.length; i++) {
        //    System.out.println(weights[i]);
        //}
    }
}