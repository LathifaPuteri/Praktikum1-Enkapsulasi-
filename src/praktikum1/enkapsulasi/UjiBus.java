/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1.enkapsulasi;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus Bus = new Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.getAvarage(50);
        Bus.cetakpenumpang();
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(1); //tambah 1 penumpang
        Bus.getAvarage(60);
        Bus.cetakpenumpang();
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.getAvarage(52);
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        System.out.println("");
        Bus.getAvarage(40);
        Bus.cetakpenumpang();
    }
    
}
