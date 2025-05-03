import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap(){
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1); // store the first element
        heap.set(index1, heap.get(index2)); // swap the elements
        heap.set(index2, temp); // swap the elements
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size() - 1;  // index of the last element

        while(current > 0 && heap.get(current) < heap.get(parent(current))){
            swap(current, parent(current)); // swap with the parent
            current = parent(current); // move to the parent index
        }
    }

    public Integer remove(){
        if(heap.size() == 0){
            return null; // heap is empty
        }

        if(heap.size() == 1){
            return heap.remove(0); // remove the only element
        }

        int maxValue = heap.get(0); // store the max value
        heap.set(0, heap.remove(heap.size() - 1)); // replace root with last element
        sinkDown(0); // sink down the new root

        return maxValue; // return the max value
    }

    public void sinkDown(int index){
        int maxIndex = index;
        while(true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

           if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex) ){
                maxIndex = leftIndex;
            }

           if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)){
                maxIndex = rightIndex;
            }

            if(maxIndex != index){
                swap(index, maxIndex); // swap the elements
                index = maxIndex; // move to the new index
            }else{
                return;
            }
        }
    }

}
