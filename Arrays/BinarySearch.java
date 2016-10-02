
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshagwalani
 */
public class BinarySearch {
      public input input;
    private int size;

    public BinarySearch(int size, input input,int element){
        this.input = input;
        System.out.println("Printing sorted array ===>");
        this.input.display();
        this.size = size;
       System.out.println("Found "+element+" at "+this.findElement(0,size-1,element));
        
        //System.out.println("Found "+element+" at "+this.findElement(0,size-1,999));
    }
    
    public int findElement(int start, int end, int el){
        if(end>start){
        int mid = (start+end)/2;
        
      //  System.out.println("start end and mid values "+start+" "+end+" "+mid);
        if(this.input.array[mid]==el){
            return mid;
        }
        else if(el<this.input.array[mid]){
            return findElement(start, mid,el);
        }
        else {
            return findElement(mid+1,end,el);
        }
       
        }
        else {
        return -1;
        }
    
    }
    public boolean findSum(int sum){
        System.out.println("Sum = "+sum);
        boolean result = false;
        int cSum = sum;
        for(int i =0;i<this.size;i++){
            cSum = sum-this.input.array[i];
            int j = findElement(1,size-1,cSum);
            if(j!=-1){
              //  int s = 
                System.out.println("indices = "+i+", "+j+" \n"+this.input.array[i]+" + "+this.input.array[j]+" = "+(this.input.array[i]+this.input.array[j]));
                result = true;
                break;
            }
        }
        if(!result){
            System.out.println("Sum Not found :(");
        }
               return result;         
    }
    
    
    
    
}
