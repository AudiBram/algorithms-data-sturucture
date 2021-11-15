public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = {55, 12, -12, 32, 1, -44, 7};

        for(int lastUnsortedIndex = intArray.length - 1; 0 < lastUnsortedIndex; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    i = largest;
                }
            }
            swap(intArray, lastUnsortedIndex, largest);
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
