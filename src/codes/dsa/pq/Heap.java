package codes.dsa.pq;

public class Heap {

    private int[] arr ;
    private int count;
    private int capacity;
    private int heapType;

    public Heap(int capacity, int heapType) {
        this.capacity = capacity;
        this.heapType = heapType;
        this.arr = new int[capacity];
    }

    public int parent(int i){
        if(i<=0 || i>=this.count){
            return -1;
        }
        return (i-1)/2;
    }

    public int leftChild(int i){
        int left = 2*i +1 ;
        if(left >=this.count){
            return -1;
        }
        return left;
    }

    public int rightChild(int i){
        int right = 2*i +2 ;
        if(right >=this.count){
            return -1;
        }
        return right;
    }

    public int getMax(){
        if(this.count==0){
            return -1;
        }
        return this.arr[0];
    }

    /**
     * Heapify at location i
     */
    public void percolateDown(int i){
        int l, r, max, temp;
        l = leftChild(i);
        r = rightChild(i);
        if(l!=-1 && this.arr[l]>this.arr[i]){
            max = l;
        }else{
            max = i;
        }
        if(r!=-1 && this.arr[r]>this.arr[i]){
            max=r;
        }
        if(max !=i){
            temp = this.arr[i];
            this.arr[i]=this.arr[max];
            this.arr[max]= temp;
        }
        percolateDown(max);
    }
}
