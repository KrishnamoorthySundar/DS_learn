package algo.sorting;

public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,6,1};
        for(int num: new BubbleSort().bubbleSort(arr)){
            System.out.print(num);
        }
    }
}
