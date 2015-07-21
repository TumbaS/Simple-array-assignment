package assignment;

/**
 *
 * @author Milos
 */
public class Assignment {

    /**
     * Simple application to iterate through array and to separate negative and
     * positive numbers. Prints positive and negative array, number of
     * duplicates.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int Positive = 0;
        int Negative = 0;
        int zero = 0;

        //Number of positive and negative elements of array         
        for (int val : array) {
            if (val > 0) {
                Positive += 1;
            } else if (val < 0) {
                Negative += 1;
            } else {
                zero++;
            }
        }

        //Creating arrays for positive and negative elements        
        int[] arrayPositive = new int[Positive];
        int[] arrayNegative = new int[Negative];
        int j = 0, k = 0, q = 0;

        //Putting positive element in positive array, negative in negative 
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPositive[j] = array[i];
                j++;
            } else if (array[i] < 0) {
                arrayNegative[k] = array[i];
                k++;
            }
            for (int m = i + 1; m < array.length; m++) // Checking for duplicates
            {
                if (array[i] == array[m]) {
                    q++;
                }
            }
        }

        //Printing new arrays and number of duplicates
        System.out.printf("Positive array of numbers: ");
        System.out.println(java.util.Arrays.toString(arrayPositive));
        System.out.printf("Negative array of numbers: ");
        System.out.println(java.util.Arrays.toString(arrayNegative));
        System.out.printf("Number of duplicates is %d.\n", q);
        System.out.printf("Number of zeros is %d.\n", zero);
    }
}
