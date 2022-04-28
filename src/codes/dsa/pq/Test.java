package codes.dsa.pq;

public class Test {


    public static void main(String[] args) {

        Heap heap = new Heap(7, 1); // 1 indicates the max heap


        heap.insert(5);
        heap.insert(23);
        heap.insert(19);
        heap.insert(21);
        heap.insert(15);
        heap.insert(33);
        heap.insert(29);
        heap.insert(31);
        heap.insert(51);
        heap.insert(43);
        heap.insert(89);
        heap.insert(201);


        System.out.println(heap.deleteMax());  // 201
        System.out.println(heap.deleteMax());  //89
        System.out.println(heap.deleteMax());
        System.out.println(heap.deleteMax());
        System.out.println(heap.deleteMax());


    }
}
