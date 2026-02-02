package LinearSearch;



public class linearSearch2{
    public static void main(String args[])
    {
       int arr[]={6,8,18,9,-11,03,-34,6};
       int target=6;
       int ans=linearSearch(arr,target);
       System.out.println(ans);
    }
    
    static int linearSearch(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            if(num==target)
            {
                return i;
            }
        }
        
        return -1;
    }
}