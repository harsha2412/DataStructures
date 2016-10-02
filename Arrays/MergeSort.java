/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshagwalani
 */
public class MergeSort {

    public input input;
    public int size;

    public MergeSort(int size) {
        this.size = size;
        this.input = new input(size);
        this.input.display();
        this.sort(this.input.array, 0, size - 1);
        this.input.display();
    }

    public MergeSort(input in) {
        this.input = in;
        
        this.sort(this.input.array, 0, size - 1);
        this.input.display();
    }

    public void sort(int[] array, int s, int e) {
        if (s < e) {
            int m = (s + e) / 2;
            this.sort(array, s, m);
            this.sort(array, m + 1, e);
            this.merge(array, s, m, e);

        }

    }

    public void merge(int[] array, int s, int m, int e) {
        // System.out.println(s+" "+m+" "+e);
        int l1 = m - s + 1;
        int l2 = e - m;
        //System.out.println("l1 and l2 "+l1+" "+l2);
        int[] left = new int[l1];
        int[] right = new int[l2];
        for (int i = 0; i < l1; i++) {
            left[i] = array[s + i];
        }
        for (int i = 0; i < l2; i++) {
            right[i] = array[m + 1 + i];
        }
        int l = 0, k = 0;

        for (int i = s; i <= e; i++) {
            if (l < l1 && k < l2) {
                if (left[l] < right[k]) {
                    array[i] = left[l];
                    l++;

                } else if (left[l] > right[k]) {
                    array[i] = right[k];
                    k++;

                }
            } else if (l < l1) {
                array[i] = left[l];
                l++;
            } else if (k < l2) {
                array[i] = right[k];
                k++;
            }

        }

    }

}
