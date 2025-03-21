import java.util.ArrayList;
public class LC34
{
    public static void main(String[] args)
    {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target){
        int a[]=new int[2];
        int s1=0,s2=0,e1=nums.length-1,e2=nums.length-1,mid,start=-1,end=-1;
        //Binary Search for first occurence
        while(s1<=e1)
        {
            mid=s1+(e1-s1)/2;
            if(nums[mid]==target)
            {
                start=mid;
                e1=mid-1;
            }
            else if(nums[mid]<target)
            {
                s1=mid+1;
            }
            else if(nums[mid]>target)
            {
                e1=mid-1;
            }
        }

        //Binary Search for last occurence
        while(s2<=e2)
        {
            mid=s2+(e2-s2)/2;
            if(nums[mid]==target)
            {
                end=mid;
                s2=mid+1;
            }
            else if(nums[mid]<target)
            {
                s2=mid+1;
            }
            else if(nums[mid]>target)
            {
                e2=mid-1;
            }
        }
        a[0]=start;
        a[1]=end;
        return a;
    }
}