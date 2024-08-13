package algo.sorting;

public class SelectionSort {

    public int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,6,1};
        for(int num: new SelectionSort().selectionSort(arr)){
            System.out.print(num);
        }
    }
}
