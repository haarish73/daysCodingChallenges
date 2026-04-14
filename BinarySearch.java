// 📌 Description

// This project implements the Binary Search algorithm in Java to efficiently find the index of a target element in a sorted array.

// Binary Search works by repeatedly dividing the search space in half, making it much faster than linear search for large datasets. If the target element is found, the function returns its index; otherwise, it returns -1.

// 🚀 Approach

// Initialize pointers

// Set start = 0 (beginning of array)

// Set end = n - 1 (last index)

// Iterate using a loop

// Continue while start <= end

// Find the middle element

// Calculate mid using:

// mid = start + (end - start) / 2

// This avoids integer overflow

// Compare middle element with key

// If arr[mid] == key → return mid

// If arr[mid] < key → search right half (start = mid + 1)

// Else → search left half (end = mid - 1)

// Element not found

// If loop ends, return -1

// ⏱️ Time Complexity

// O(log n) — Efficient for large sorted arrays

// 📦 Space Complexity

// O(1) — No extra space used

public class BinarySearch {
    static int binarySearch(int arr[], int key){
        // int n = arr.length;

        int start = 0;
        int end = arr.length-1;

        // int mid = start + (end - start)/2;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,68};
        int key = 5;
        int binarySearch = binarySearch(arr, key);
        System.out.println(binarySearch);
    }
}
