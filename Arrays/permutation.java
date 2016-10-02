/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshagwalani
 */
public class permutation {

    public input input;
    private int size;
    private int counter = 0;

    public permutation(int size) {
        this.size = size;
        this.input = new input(size);
    }

    private void swap(int i, int j) {
        int temp = this.input.array[i];
        this.input.array[i] = this.input.array[j];
        this.input.array[j] = temp;
    }

    public void permutate(int left, int right) {
        if (left == right) {
            counter++;
            System.out.print(counter + ") " );
            input.display();
        }
        for (int i = left; i < right; i++) {
            swap(left, i);
            permutate(left + 1, right);
            swap(left, i);
        }
    }

    private int sumExists() {
        int result = -1;

        return result;

    }

}
