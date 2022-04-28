package codes.dsa.pq;

public class Heap {

    private int[] arr;
    private int count;
    private int capacity;
    private int heapType;  // 1 - MaxHeap , -1 MinHeap

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHeapType() {
        return heapType;
    }

    public void setHeapType(int heapType) {
        this.heapType = heapType;
    }

    public Heap(int capacity, int heapType) {
        this.capacity = capacity;
        this.heapType = heapType;
        this.arr = new int[capacity];
    }

    public int parent(int i) {
        if (i <= 0 || i >= this.count) {
            return -1;
        }
        return (i - 1) / 2;
    }

    public int leftChild(int i) {
        int left = 2 * i + 1;
        if (left >= this.count) {
            return -1;
        }
        return left;
    }

    public int rightChild(int i) {
        int right = 2 * i + 2;
        if (right >= this.count) {
            return -1;
        }
        return right;
    }

    public int getMax() {
        if (this.count == 0) {
            return -1;
        }
        return this.arr[0];
    }
















    /**
     * Deleting an element in the Heap
     * O(logn)
     */
    public int deleteMax(){
        if(this.count==0){
            throw new RuntimeException("Heap is empty");
        }

        int data = this.arr[0];
        this.arr[0]=this.arr[this.count-1];
        this.count--;
        percolateDown(0);
        return data;
    }


    /**
     * Heapify at location i
     * TC : O(logn)
     */
    public void percolateDown(int i) {
        int l, r, max, temp;
        l = leftChild(i);
        r = rightChild(i);
        if (l != -1 && this.arr[l] > this.arr[i]) {
            max = l;
        } else {
            max = i;
        }
        if (r != -1 && this.arr[r] > this.arr[max]) {
            max = r;
        }
        if (max != i) {
            temp = this.arr[i];
            this.arr[i] = this.arr[max];
            this.arr[max] = temp;
            percolateDown(max);
        }

    }




















    /**
     * Inserting an Element in the Heap
     * TC = O(logn)
     */
    public void insert(int data){
        if(this.count==this.capacity){
            resizeHeap();
        }

        this.count++;
        int i = this.count-1;  // index where the element has to be added

        while(i>0 && data > this.arr[(i-1)/2]){
            this.arr[i]= this.arr[(i-1)/2];
            i = (i-1)/2;
        }
        this.arr[i]=data;
    }

    private void resizeHeap() {
        this.capacity= this.capacity*2;
        int[] temp = new int[this.capacity];

        for(int i=0;i<arr.length;i++){
            temp[i] =arr[i];
        }
        this.arr = temp ;
        temp = null;

    }
}
