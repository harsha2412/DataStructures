/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshagwalani
 * Calculate Number of inversions and max sum !
 * 
 */
import java.util.Random;
public class ArrayOperations {
    int size;
    input input ;
     static int inversions=0;
    public ArrayOperations(int size) {
        this.size = size;
        this.input = new input(size);
        System.out.println(" Calculating inversions in ");
        this.input.display();
        
        inversions=0;
        
    }
    public int maxSum(){
        Random r = new Random();
        int num = r.nextInt(size);
        System.out.println("Negating "+num+" elements");
        for(int i=0;i<num;i++){
            int l = r.nextInt(size);
            this.input.array[l] = -1*this.input.array[l];
        }
        this.input.display();
        int sum=this.input.array[0];
        int csum = this.input.array[0];
        int start = -1;
        int end = -1;
               
        for(int i=1;i<size;i++){
            //start =i;
            System.out.println(csum+" b4 current sum");
            //csum = 
            int t = csum+this.input.array[i];
            csum =this.input.array[i];
            if(t>this.input.array[i]){
                csum = t;
            }
            if(csum>sum){
                sum = csum;
            }
            System.out.println(csum+" current sum");
        }
        
        return sum;
        
    }
    public int calculateInversions(int s, int e){
        //int inversions= 0;
        int m = (s+e)/2;
        if(e>s){
         calculateInversions(s,m);
        calculateInversions(m+1,e);
          merge(s,m,e);
        }
        
        
        
        return inversions;
        
        
    }
    public void naiveInversions(){
       int  in = 0;
        for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
           // System.out.println(this.input.array[j]+" "+this.input.array[i]);
            if(this.input.array[i]>this.input.array[j]){
                //System.out.println(this.input.array[j]+" "+this.input.array[i]);
                in++;
            }
        }
        
    }
        System.out.println("total = "+in);
        //inversions = 0;
    }
    public void merge(int s, int m, int e){
         System.out.println(s+" "+m+" "+e);
       // int r =0;
        int n1 = m-s+1;
        int n2 = e-m;
        int left[] = new  int [n1];
        int right[] = new int[n2];
        int l =0,k=0;
        for(int i =0;i<n1;i++){
            left[i] = this.input.array[s+i];
            
        }
         for(int i =0;i<n2;i++){
            right[i] = this.input.array[m+1+i];
            
        }
         //System.out.println("n1 and n2 "+n1+" "+n2);
         for(int i=s;i<=e;i++){
             //System.out.println("l and k "+ l+" "+k);
             if(l<n1 && k<n2){
                 if(left[l]<=right[k]){
                     this.input.array[i]= left[l];
                     l++;
                 }
                 else if (left[l] > right[k]){
                     this.input.array[i]= right[k];
                     //System.out.println("bloody flip "+n1+" "+l);
                     inversions =inversions+n1-l;
                   //   System.out.println("inve = "+inversions);
                     k++;
                 }
                 
             }
             else if (l < n1) {
                this.input.array[i] = left[l];
                l++;
            } else if (k < n2) {
                this.input.array[i] = right[k];
                k++;
            }
         }
        
        //return r;
    }
    
    
}
