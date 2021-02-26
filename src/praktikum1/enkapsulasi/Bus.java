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
public class Bus {
    public double penumpang;
    public int maxpenumpang;
    public double counter;
    public double penumpangbaru;
    public double ratarata;
    
    public Bus(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method Mutator
    public void addpenumpang (double penumpang)
    {
        this.penumpangbaru = 0;
        double temp = this.penumpang+penumpang;
        this.penumpangbaru = penumpang;
        if(temp> maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{
            this.penumpang=temp;
        }
    }
        public double getpenumpang (int password)
        {
            if (password == 24){
                System.out.println("Password Benar");
            }
            else{
                System.out.println("Password Salah");
            }
            return password;
        }
        public double getAvarage(double berat){
            if(this.penumpang+penumpangbaru>maxpenumpang){
                System.out.println("Berat penumpang = "+counter);
                System.out.println("Rata-rata berat penumpang bus = "+ratarata);
            }
            else{
                counter+= berat*penumpangbaru;
                ratarata = counter/penumpang;
                System.out.println("Berat penumpang = "+counter);
                System.out.println("Rata-rata berat penumpang bus = "+ratarata);
            }
            return berat;
        }
        public void cetakpenumpang()
        {
            System.out.println("Penumpang Bus Sekarang = "+penumpang);
            System.out.println("Maksimum Penumpang yang seharusnya adalah = "+maxpenumpang);
        }
        
    }
