package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a ={1,6,7,15,984,61,5,48,7};
        a=findIndex(a,3,6);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public  static int [] findIndex(int[]arr,int index,int newE ){
        int [] newArr= new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[i];
        }
        for (int i = index+1; i < arr.length+1; i++) {
            newArr[i]=arr[i-1];
        }
        newArr[index]=newE;
        return newArr;
    }
}
