package com.android.problempractice.codingninja;

public class TwoSum {
    /*Sam want to read exactly ‘TARGET’ number of pages. He has an array ‘BOOK’ containing the number of pages for ‘N’ books. Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.*/
    public static void main(String[] args) {
        int target = 5;
        int[] book = {4, 1, 2, 3, 1};
        System.out.println(read(book.length, book, target));

    }
    public static String read(int n, int[] book, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (book[i] + book[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
