/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshagwalani
 */
public class Insertion {

    public input input;
    private int size;

    public Insertion(int size) {
        this.size = size;
        this.input = new input(size);
    }

    public void sort() {
        int key = 0;
        this.input.display();
       // this.input.display();
        for (int i = 1; i < this.input.array.length; i++) {
            key = this.input.array[i];
            //System.out.println("key = "+key);
            int j = i - 1;
            while (j >= 0 && this.input.array[j] > key) {
                // System.out.print("j values" +j+" " +sort.input.array[j]);
                this.input.array[j + 1] = this.input.array[j];

                j = j - 1;
                this.input.array[j + 1] = key;
            }
//sort.input.display();
        }

        this.input.display();
    }


}
