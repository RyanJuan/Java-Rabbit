/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan53.rabbit;

/**
 *
 * @author RyanJuan
 * NAMA                 : Rayan
 * KELAS                : PBOULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program untuk menampilkan mahasiswa dan dosen
 */

public class PBOULG10115557Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Rabbit r = new Rabbit("Peter",false,"grass",4,"grey");
        r.isVegetarian();
        r.getEats();
        r.getNoOfLegs();
        
        System.out.println("Hello, his name is " + r.getName());
        System.out.println(r.getName() + " is Vegetarian? " + r.isVegetarian());
        System.out.println(r.getName() + " eats " + r.getEats());
        System.out.println(r.getName() + " color is " + r.getColor());
    
    }
    
}
