/*
    Context:
    Quick sort is a sorting algorithm with the following main steps:
    1. Divide: If the input sequence S of size n has zero or one element, return S, otherwise select a specific element x from S, the pivot. In common practice, we choose the pivot x to be the last element in S.
       Remove all the elements from S and put them into three sequences:
       - L, storing the elements in S less than x.
       - E, storing the elements in S equal to x.
       - G, storing the elements in S greater than x.
    2. Conquer: Recursively sort sequences L and G.
    3. Combine: Put back the elements into S in order by first inserting the elements of L, then those of E, and finally those of G.

    Question:
    Write a method public static void quick_sort(int list[], int low, int high) that implements the quick sort algorithm on a given integer array list, using the last element in the array as the pivot, where initially low = 0 and high = |arr| − 1.

    Example:
    int[] list = {7,2,26,34,3}
    quick_sort(list, 0, list.length-1) would return {2, 3, 7, 26, 34}.
*/
public class Lab6_Question2 {
    public static void quick_sort(int list[], int low, int high) {

    }
    public static void main(String[] args) {
        
    }  
}
