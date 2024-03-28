# Selection-Sort
The Selection Sort algorithm code is given. In this code, we minimize the number of swaps by performing a swap only when we find the index of the minimum value that is different from the current index (index!=i). This reduces the number of unnecessary swaps, making the algorithm more efficient.
The time complexity of the optimized Selection Sort algorithm remains the same as the standard Selection Sort algorithm, which is O(n^2), where n is the number of elements in the array. 
The best and worst case scenario for this Selection Sort is same: O(n^2).

Eg: arr[]={77,33,44,11,88,22,66,55}
So,
- 77 (33 44 11 88 22 66 55)
- 11 33 (44 77 88 22 66 55)
- 11 22 44 (77 88 33 66 55)
- 11 22 33 77 (88 44 66 55)
- 11 22 33 44 88 (77 66 55)
- 11 22 33 44 55 77 (66 88)
- 11 22 33 44 55 66 77 88.

  
