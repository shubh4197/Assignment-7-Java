import java.util.Arrays;

public class Assignment3{
    String[] arr1={"Apple","Banana","Kiwi","Monkey","Tiger","Lion","Mango","Shoes"};
    String[] arr2={"Monkey","Banana","Mango"};

    public void Subtract(){
        
        Assignment3 d=new Assignment3();
        int z=d.arr1.length-d.arr2.length;
        int loc=0;
        
       
        
        int counter=0;
        for(int i=0;i<d.arr1.length;i++)
        {
         for(int y=0;y<d.arr2.length;y++)
         { 
             if(d.arr1[i].compareTo(d.arr2[y])==0)
             { counter++;
              loc=i;
              for(int o = loc+1; o < d.arr1.length; o++)
            {
                d.arr1[o-1] = d.arr1[o];
            }
             }
         }
        }

        String[] arr=new String[d.arr1.length-counter];

        for(int u=0;u<d.arr1.length-counter;u++){
            arr[u]=d.arr1[u];
        }
        
            System.out.println(Arrays.toString(arr));
        
    }

    public static void main(String[] args){
        Assignment3 f=new Assignment3();
        f.Subtract();
    }

    
}