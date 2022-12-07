package Saurabhdemo;
import java.util.*;
public class selctionsort {
    public static void main(String[] args) {
        int a[]={2,7,4,59,23};
        insertionsort(a);
      //  selectionsort(a);
        System.out.println(Arrays.toString(a));


    }
    public static  void insertionsort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void selectionsort(int a[]){
        for(int i=0;i<a.length;i++){
            int last=a.length-i-1;
            int  maxindx=getmax(a,0,last);
            swap(a,maxindx,last);
        }
    }
      public static  void  swap(int a[],int start,int end){
          int temp=a[start];
          a[start]=a[end];
          a[end]=temp;
    }
    public static int getmax(int a[],int start,int end){
            int max=start;
            for(int i=start;i<=end;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        return max;
    }
}

