public class FloorOfaNumber {
    public static void main(String args[])
    {
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(floorofaanumber(arr,15));
    }
    static int floorofaanumber(int arr[],int target)
    {
        int start=0,end=arr.length,mid;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return target;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
        }
        return arr[end];
    }
}
