package codes.dsa.pq;

import java.util.Arrays;

public class HeapSort {


    /**
     * TC : O(nlogn)
     *
     */
    public static void heapSort(int[] arr){

        Heap heap = new Heap(arr.length, 1); //created a max heap

        /**
         * Heapify the array - i.e put all the elements of the array into the heap
         */
        buildHeap(heap, arr);

        for(int i =arr.length-1;i>=0;i--){
            arr[i]= heap.deleteMax();
        }
        heap.setCount(arr.length);
    }

    private static void buildHeap(Heap heap, int[] arr) {
       if(heap==null){
           return;
       }
       for(int i=0;i<arr.length;i++){
           heap.getArr()[i]=arr[i];
       }
       heap.setCount(arr.length);

       int lastElementIndex = arr.length-1;
       for(int i = lastElementIndex/2 ;i>=0;i--){
           heap.percolateDown(i);
       }
    }

    public static void main(String[] args) {
        int[] arr = {5,14,3,-2,1,3};

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
