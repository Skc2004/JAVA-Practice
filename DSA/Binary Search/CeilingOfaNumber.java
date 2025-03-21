public class CeilingOfaNumber{
    public static void main(String args[])
    {
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(Ceiling(arr, 3));
    }

    static int Ceiling(int [] arr, int target){
        int start=0, end=arr.length-1,mid;
        // for ascending order sorted array
        while(start<=end){
            mid=start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return arr[end+1];
    }
}