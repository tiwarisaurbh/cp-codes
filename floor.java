package saurabh456;

public class floor {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = binarysearch(a, target);
        System.out.println(ans);

    }

    static int binarysearch(int a[], int target) {
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<a[mid]){
                end=mid-1;
            }else if (target>a[mid]){
                start = mid+1;
            }else{
                return mid;
            }

        }
        return a[end];
    }

}



