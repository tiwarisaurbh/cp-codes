package saurabh456;
import java.util.*;
public class Arrraysinfinte {
    public static void main(String[] args) {
          int a[]={3,4,5,6,7,8,9,10};
              int target=8;
          System.out.println(ans(a,target));
    }
       static  int ans(int a[],int target){
        int start=0;
        int end=1;
        while(target>a[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
          }
        return binarysearch(a,target,start,end);
       }
        static int binarysearch(int a[], int target,int start,int end) {

            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<a[mid]){
                    end=mid-1;
                }else if(target>a[mid]){
                    start = mid+1;
                }else{
                    return  mid;
                }
            }
            return -1;
        }

    }


