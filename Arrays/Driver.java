
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
public class Driver {

    public static void main(String args[]) {
        System.out.println("Insertion !!!\n");
        Insertion insert = new Insertion(10);
        insert.sort();
        System.out.println("Selection !!!\n");
        Selection select = new Selection(5);
        select.sort();
        System.out.println("Merge !!!\n");
        MergeSort ms = new MergeSort(10);
        Random r = new Random();
        int index = r.nextInt(ms.size);
        BinarySearch bin = new BinarySearch(ms.size, ms.input,ms.input.array[index]);
        int in = r.nextInt(ms.size);
        int sum = ms.input.array[index]+ms.input.array[in];
        bin.findSum(sum);
        ArrayOperations operations = new ArrayOperations(5);
        operations.naiveInversions();
        System.out.println("Inversions = "+operations.calculateInversions(0,operations.size-1));
        System.out.println("Max Sum = "+operations.maxSum());
        operations.input.display();
       // ms.input.display();
       System.out.println("\n\n\n*********************** Trying to permutate ****************************************\n\n");
       permutation perm = new permutation(5);
       perm.permutate(0,5);
       
       

    }
}
