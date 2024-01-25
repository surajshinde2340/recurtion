import java.util.*;

class Recurrsion {

    public static void decnum(int last) {
        if (last == 0) {
            return;
        }
        System.out.println(last);
        decnum(last - 1);

    }

    // printing sum of 1st n natural number

    public static void sum(int lastNum, int sum) {
        if (lastNum == 0) {
            System.out.println(sum);
            return;

        }

        sum = sum + lastNum;
        sum(lastNum - 1, sum);

    }

    // printing factorial
    static int fact_ans = 1;

    public static void fact(int num) {
        if (num == 1) {
            System.out.println(fact_ans);
            return;
        }
        fact_ans = fact_ans * num;
        fact(num - 1);
    }

    public static int fact1(int num) {
        if (num == 1) {
            return num;
        }
        return num * fact1(num - 1);

    }

    // cheaking array is sorted or not
    public static boolean sortCheck(int[] arr, int idx) {

        if (arr.length - 1 == idx) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        System.out.println(idx);
        return sortCheck(arr, idx + 1);

    }

    // checking first occurence of element

    public static int firstoccur(int arr[], int idx, int key) {

        if (arr[idx] == key) {
            System.out.println("key is present at index " + (idx + 1));
            return idx;

        }
        if (arr.length - 1 == idx) {
            System.out.println("key is note present ");
            return -1;
        }
        return firstoccur(arr, idx + 1, key);
    }

    // remove duplicate char from string 

    public static void unq(String ptr, int idx, boolean visit[], StringBuilder ans) {
        if (ptr.length() == idx) {
            System.out.println("unique key is " + ans);
            return;
        } else if (visit[ptr.charAt(idx) - 97] == false) {
            visit[ptr.charAt(idx) - 97] = true;
            ans.append(ptr.charAt(idx));
            unq(ptr, idx + 1, visit, ans);
        }else{
            unq(ptr, idx + 1, visit, ans);
        }

    }

    public static void main(String args[]) {

        decnum(10);
        sum(10, 0);
        fact(5);
        int arr[] = { 1, 2, 3, 10, 5, 6, 8 };
        if(sortCheck(arr,0)){
        System.out.println(" arr is sorted ");
        }else{
        System.out.println("arr is not sorted ");
        }
        firstoccur(arr, 0, 8);
       
            boolean vis[] = new boolean[26]; 
            StringBuilder sp = new StringBuilder(" ");
            unq("ssssurrrrrajjjjj", 0, vis, sp);
    }

}