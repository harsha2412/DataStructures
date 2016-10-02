/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshagwalani
 */
public class Selection {
      public input input;
    private int size;

    public Selection(int size) {
        this.size = size;
        this.input = new input(size);
    }

    public void sort() {
       int min = 0;
       int index =-1;
        this.input.display();
               for(int i =0;i<this.input.array.length-1;i++){
                   min = this.input.array[i];
                  
                   for(int j =i+1;j<this.input.array.length;j++){
                      // System.out.println("Min = "+min+)
                       if(min>this.input.array[j]){
                           min = this.input.array[j];
                           index = j;
                       }
                   }
                 
                   if(index !=-1){
                   int t = this.input.array[index];
                   this.input.array[index] = this.input.array[i];
                   this.input.array[i] =t;
                   }
               }
         this.input.display();
    }
    }

