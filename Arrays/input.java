
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
public class input {

    public int array[];

    public input(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            array[i] = r.nextInt(size * size*size);

        }
    }
    public input(){
        //DO Nothing !
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }
}
