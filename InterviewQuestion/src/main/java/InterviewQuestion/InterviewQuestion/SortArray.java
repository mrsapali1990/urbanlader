package InterviewQuestion.InterviewQuestion;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
        int a [] = {3,4,6,1,9,8,12,10};
        System.out.println("Array before sort: "+ Arrays.toString(a));
        int n = a.length;
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Array aftersort: "+ Arrays.toString(a));
}
}