public class ArrayLargest 
{  
    public static void main(String[] args) 
    {  
      int [] arr = new int [] {95, 10, 45, 8, 39, 82};  
        
        int max = arr[0];  
          
        for (int i = 0; i < arr.length; i++) 
        {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in the array is " +max);  
    }  
}  
