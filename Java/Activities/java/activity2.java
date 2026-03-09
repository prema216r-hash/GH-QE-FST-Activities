public class activity2 {
   public static void main(String args[])
   {
    int arr[]={10, 77, 10, 54, -11, 10};
    int result=0;
    for(int i=0;i<6;i++)
    {
        if(arr[i]==10)
        {
            result+=arr[i];
        }
    }
    if(result==30)
    System.out.println(true);
    else
        System.out.println(false);
   } 
}
