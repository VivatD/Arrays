import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int unidimensional[] = new int[]{1,2,3,4,5,6,7};
        int bidimensional[][] = {{2,43,5,7,8,9},{21,43,54,23,42}};
        int copy[] = new int[]{};


        calculateAverage(unidimensional);
        calculateAverage(bidimensional);
        copyArray(copy,unidimensional);

    }


    public static void calculateAverage(int[] array){

        int evenNumbs = 0;
        int oddNumbs = 0;
        int sum = 0;
        int total = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
                evenNumbs++;
            } else {
                sum += array[i];
                oddNumbs++;
            };
        }
        total = sum / ( evenNumbs + oddNumbs );
        System.out.println("Even numbers: " + evenNumbs);
        System.out.println("Odd numbers: " + oddNumbs);
        System.out.println("Average sum of odd and even numbers is : " + total);
    }
    public static void calculateAverage(int[][] array){

        int evenNumbs = 0;
        int oddNumbs = 0;
        int sum = 0;
        int total;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++ ){
                if(array[i][j] %2 == 0){
                    sum += array[i][j];
                    evenNumbs++;
                } else{
                    sum += array[i][j];
                    oddNumbs++;
                }
            }
        }
        total = sum / (oddNumbs + evenNumbs);
        System.out.println("Even numbers: " + evenNumbs);
        System.out.println("Odd numbers: " + oddNumbs);
        System.out.println("Average sum of odd and even numbers is : " + total);
    }

    public static void copyArray(int[] copy,int[] original){
        copy = Arrays.copyOf(original, original.length);
        System.out.print("Copy: ");
        for (int i =0; i < copy.length; i++) {
            System.out.print(copy[i]+ "");
        }
        System.out.print("\nOriginal: ");
        for (int i = 0; i < original.length; i++){
            System.out.print(original[i]);
        }
    }
}
