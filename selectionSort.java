

public class Main {

    public static void main(String[] args) {
        //Selection Sort
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // increase the sorted partition by one growing left to right
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            int largest = 0;
            // looking for the largest element
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }

            }
            swap(intArray, largest, lastUnsortedIndex);




        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }



    }//swap method
    public static void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
