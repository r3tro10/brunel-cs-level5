/*
    Context:
    A min heap is a binary tree that stores entries as nodes and satisfies two properties:
    For every position 𝑝 other than the root, the key stored at 𝑝 is greater than or equal to the key stored at 𝑝’s parent.
    A heap is a complete binary tree. All nodes within the tree have exactly two childen, apart from the parent of the leaves which may have less.

    Question:
    Complete the class MinHeap by writing the the following methods:
    upHeap(i) which makes sure property 1 above is always observed when inserting a node.
    downHeap(i) which makes sure property 1 above is always observed when removing a node.
    insert(k,v) which inserts a node into the min heap with key k and value v.
    removeMin() which removes the minimum value from the min heap.
    All other methods have been provided for you. Assume the capacity of the heap will never be exceeded.

    Example:
    Given a MinHeap h
    h.insert(5, 'D') would insert node (5,𝐷) into h. After insertion, upHeap(i) would need to be carried out, where i is the index position of node (5,𝐷) in h (right-most leaf, last element in array heap).
    h.removeMin() would remove node (5,𝐷) from h. During the removal, the root would need to be swapped with the right-most leaf. downHeap(i) would need to be carried out, where i is the index position of the node with the smallest value k in h (now stored at the root, first element in array heap).
*/
public class Lab4_Question2 {
    public class MinHeap {
        public E[] heap;
        private int size;
        private static final int DEFAULT_CAPACITY = 16;

        public static class E {
            int k;
            char v;

            E(int k, char value) {
                this.k = k;
                this.v = v;
            }
        }

        public MinHeap() {
            heap = new E[DEFAULT_CAPACITY];
            size = 0;
        }

        public void insert(int k, char v) {

        }

        public E removeMin() {

        }

        private void upHeap(int i) {

        }

        private void downHeap(int i) {

        }

        private void swap(int i, int j) {
            E tmp = heap[i];
            heap[i] = heap[j];
            heap[j] = tmp;
        }

    }
    public static void main(String[] args) {
        
    }
}
