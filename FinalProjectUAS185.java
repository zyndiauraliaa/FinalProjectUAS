/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectuas.pkg185;

/**
 *
 * @author lenovo
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Boolean;
public class FinalProjectUAS185 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(java.lang.NullPointerException[] args) {
        
    }
    public static void main(String[] args) {
    
        //REAL TIME FORMAT
        DateTimeFormatter dateTimeFormatter=
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
        LocalDateTime getNow=LocalDateTime.now();
        
        //DEKLARASI VARIABEL
        Scanner input = new Scanner(System.in);
        Scanner huruf =  new Scanner(System.in);
        Scanner dsk = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int pilih1=0, pilih2=0, pilih, totalakhir=0,angka = 0;
        int hargaIchigoDaifuku=8000;
        int hargaFruitSandwich=15000;
        int hargaMangoStickyRice=18000;
        int hargaMochiBites=15000;
        int hargaSaladBuah=15000;
        int hargaRollCake=15000;
        int hargaSamyangSpringRoll=17000;
        int hargaExtraKeju=2000;
        int no;
        int grand_total=0;
        int total_transaksi=0;
        int kembalian,uang_pembeli;
        double totalIchigoDaifuku2=0;
        
        int totalIchigoDaifuku=0;
        int totalFruitSandwich=0;
        int totalMangoStickyRice=0;
        int totalMochiBites=0;
        int totalSaladBuah=0;
        int totalRollCake=0;
        int totalSamyangSpringRoll=0;
        int pemasukkan=0;
        String nama,yn, pilih4;
       
        
        //TOTAL PEMASUKAN
        int IchigoDaifuku=0;
        int FruitSandwich=0;
        int MangoStickyRice=0;
        int MochiBites=0;
        int SaladBuah=0;
        int RollCake=0;
        int SamyangSpringRoll=0;
     
        //HEADER
        System.out.println("\n---------------SWEET'S EXCLUSIFE BY ZYNDI-------------");
        System.out.println("             Jl. Ki Ageng Selo, Kartoharjo ");
        System.out.println("                Kec. Kartoharjo, Madiun ");
        System.out.println("==============================================");
        System.out.println("Tanggal & Waktu  "+dateTimeFormatter.format(getNow));
        System.out.println("==============================================");
        
        //DATA PEMBELI
        System.out.print("Atas Nama: ");
        nama = input.nextLine();
        System.out.print("No Meja: ");
        no = input.nextInt();
        do{
            System.out.println("\nPilihan Menu");
            System.out.println("1. Kasir");
            System.out.println("2. Admin");
            System.out.println("3. Owner");
            System.out.println("4. Exit");
            System.out.print("Pilih= ");
            pilih1=sc.nextInt();
            switch(pilih1){
                
                case 1:
                    
                    System.out.println("Menu Kasir");
                    do{
                        
                        System.out.println("          ---DAFTAR MENU----           ");
                        
                        System.out.println(" _______________________________________");
                        System.out.println("|    1. Ichigo Daifuku : 8k             |");
                        System.out.println("|    2. Fruit Sandwich : 15k            |");
                        System.out.println("|    3. Mango Sticky Rice : 18k         |");
                        System.out.println("|    4. Mochi Bites : 15k               |");
                        System.out.println("|    5. Salad Buah : 15k                |");
                        System.out.println("|    6. Roll cake : 15k                 |");
                        System.out.println("|    7. Samyang Spring Roll : 17        |");
                        System.out.println("|    8. Selesai                         |");
                        System.out.println("|_______________________________________|");
                        System.out.println("");
                        System.out.print("Pilih= ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1 :
                                System.out.println("Ichigo Daifuku");
                                System.out.println("Varian Rasa");
                                System.out.println("1. Vanilla");
                                System.out.println("2. Strawberry");
                                System.out.println("3. Coklat");
                                System.out.println("4. Redbean");
                                System.out.println("5. Mangga");
                                System.out.println("6. Taro");
                                System.out.println("7. Matcha");
                                System.out.print("Pilih= ");
                                pilih=input.nextInt();
                                System.out.print("Porsi= ");
                                int porsiIchigoDaifuku=sc.nextInt();
                                totalIchigoDaifuku=porsiIchigoDaifuku*hargaIchigoDaifuku;
                                System.out.println("Total: "+totalIchigoDaifuku);
                                break;
                            case 2 :
                                System.out.println("Fruit Sandwich");
                                System.out.println("Varian Rasa");
                                System.out.println("1. Strawberry");
                                System.out.println("2. Anggur");
                                System.out.println("3. Mix");
                                System.out.print("Pilih= ");
                                pilih=input.nextInt();
                                System.out.print("Porsi= ");
                                int porsiFruitSandwich=sc.nextInt();
                                totalFruitSandwich=porsiFruitSandwich*hargaFruitSandwich;
                                System.out.println("Total: "+totalFruitSandwich);
                                break;
                            case 3 :
                                System.out.println("Mango Sticky Rice");
                                System.out.print("Porsi= ");
                                int porsiMangoStickyRice=sc.nextInt();
                                totalMangoStickyRice=porsiMangoStickyRice*hargaMangoStickyRice;
                                System.out.println("Total: "+totalMangoStickyRice);
                                System.out.println("Extra keju: 2000 (y/n)");
                                yn=input.nextLine();
                                pilih4=input.nextLine();
                                System.out.println("");
                                switch (pilih4){
                                    case "y":
                                        totalakhir=totalMangoStickyRice+2000;
                                        System.out.println("total akhir= "+totalakhir);
                                        break;
                                    case "n":
                                        System.out.println("Tidak Ada Tambahan");       
                                }
                                break;
                            case 4 :
                                System.out.println("Mochi Bites");
                                System.out.println("Varian Rasa");
                                System.out.println("1. Chocoreo");
                                System.out.println("2. Strawberry");
                                System.out.println("3. Matcha");
                                System.out.print("Pilih= ");
                                pilih=input.nextInt();
                                System.out.print("Porsi= ");
                                int porsiMochiBites=sc.nextInt();
                                totalMochiBites=porsiMochiBites*hargaMochiBites;
                                System.out.println("Total: "+totalMochiBites);
                                break;
                            case 5 :
                                System.out.println("Salad Buah");
                                System.out.print("Porsi= ");
                                int porsiSaladBuah=sc.nextInt();
                                totalSaladBuah=porsiSaladBuah*hargaSaladBuah;
                                System.out.println("Total: "+totalSaladBuah);
                                break;
                            case 6 :
                                System.out.println("RollCake");
                                System.out.println("Varian Rasa");
                                System.out.println("1. Ovomaltine");
                                System.out.println("2. Tiramisu");
                                System.out.println("3. Black Forest");
                                System.out.println("4. Choco Chunchy");
                                System.out.println("5. Cheese Cake");
                                System.out.println("6. Chocolate Milk");
                                System.out.print("Pilih= ");
                                pilih=input.nextInt();
                                System.out.println("Porsi= ");
                                int porsiRollCake=sc.nextInt();
                                totalRollCake=porsiRollCake*hargaRollCake;
                                System.out.println("Total: "+totalRollCake);
                                break;
                            case 7 :
                                System.out.println("Samyang Spring Roll");
                                System.out.println("Porsi= ");
                                int porsiSamyangSpringRoll=sc.nextInt();
                                totalSamyangSpringRoll=porsiSamyangSpringRoll*hargaSamyangSpringRoll;
                                System.out.println("Total: "+totalSamyangSpringRoll);
                                break;
                            case 8 :
                                System.out.println("Selesai");
                                grand_total=totalIchigoDaifuku+totalFruitSandwich+totalMangoStickyRice+totalMochiBites+totalSaladBuah+totalRollCake+totalSamyangSpringRoll;
                                System.out.println("Total Transaksi = "+grand_total);
                                IchigoDaifuku=totalIchigoDaifuku;
                                FruitSandwich=totalFruitSandwich;
                                MochiBites=totalMochiBites;
                                MangoStickyRice=totalMangoStickyRice;
                                SaladBuah=totalSaladBuah;
                                RollCake=totalRollCake;
                                SamyangSpringRoll=totalSamyangSpringRoll;
                                pemasukkan=IchigoDaifuku+FruitSandwich+MangoStickyRice+MochiBites+SaladBuah+RollCake+SamyangSpringRoll;
                               
                       
                               //GRAND TOTAL
                                System.out.println("Total harga= "+grand_total);
                                System.out.println("Uang Yang di Bayarkan");
                                uang_pembeli=input.nextInt();
                                kembalian=uang_pembeli-grand_total;
                                if(uang_pembeli<grand_total){
                                    System.out.println("Maaf Uang Yang Anda Bayarkan Tidak Mencukupi");
                                }
                                else if(uang_pembeli==grand_total){
                                    System.out.println("Uang Anda Pas");
                                }
                                else{
                                    System.out.println("Kembalian= Rp"+kembalian);
                                }
                        }
                    }while(pilih2!=8);
                    break;
                case 2 :
                    System.out.println("Menu Admin");
                    System.out.println("<<Ubah Harga>>");
                    System.out.println(" 1. Ichigo Daifuku");
                    System.out.println(" 2. Fruit Sandwich");
                    System.out.println(" 3. Mango Sticky Rice");
                    System.out.println(" 4. Mochi Bites");
                    System.out.println(" 5. Salad Buah");
                    System.out.println(" 6. Roll Cake");
                    System.out.println(" 7. Samyang Spring Roll");
                    System.out.print("Pilih= ");
                    int pilih3=sc.nextInt();
                    switch(pilih3){
                        case 1 :
                            System.out.println("[Harga Ichigo Daifuku]");
                            System.out.println("Lama: "+hargaIchigoDaifuku);
                            System.out.print("Baru: ");
                            hargaIchigoDaifuku=sc.nextInt();
                            break;
                        case 2 :
                            System.out.println("[Harga Fruit Sandwich]");
                            System.out.println("Lama: "+hargaFruitSandwich);
                            System.out.print("Baru: ");
                            hargaFruitSandwich=sc.nextInt();
                            break;
                        case 3 :
                            System.out.println("[Harga Mango Sticky Rice]");
                            System.out.println("Lama: "+hargaMangoStickyRice);
                            System.out.print("Baru: ");
                            hargaMangoStickyRice=sc.nextInt();
                            break;
                        case 4 :
                            System.out.println("[Harga Mochi Bites]");
                            System.out.println("Lama: "+hargaMochiBites);
                            System.out.print("Baru: ");
                            hargaMochiBites=sc.nextInt();
                            break;
                        case 5 :
                            System.out.println("[Harga Salad Buah]");
                            System.out.println("Lama: "+hargaSaladBuah);
                            System.out.print("Baru: ");
                            hargaSaladBuah=sc.nextInt();
                            break;
                        case 6 :
                            System.out.println("[Harga RollCake");
                            System.out.println("Lama: "+hargaRollCake);
                            System.out.print("Baru: ");
                            hargaRollCake=sc.nextInt();
                            break;
                        case 7 :
                            System.out.println("[Harga Samyang Spring Roll]");
                            System.out.println("Lama: "+hargaSamyangSpringRoll);
                            System.out.print("Baru: ");
                            hargaSamyangSpringRoll=sc.nextInt();
                    }
                    break;
                case 3 :
                    System.out.println("Pemasukan Ichigo Daifuku= "+IchigoDaifuku);
                    System.out.println("Pemasukan Fruit Sandwich= "+FruitSandwich);
                    System.out.println("Pemasukkan Mango Sticky Rice= "+MangoStickyRice);
                    System.out.println("Pemasukkan Mochi Bites= "+MochiBites);
                    System.out.println("Pemasukkan Salad Buah= "+SaladBuah);
                    System.out.println("Pemasukkan Roll Cake= "+RollCake);
                    System.out.println("Pemasukkan Samyang Spring Roll= "+SamyangSpringRoll);
                    System.out.println("Total Pemasukkan= "+pemasukkan);
                    break;
                case 4 :
                    System.out.println("-------------Terima Kasih-------------");
                    System.exit(0);
                    break;
            }
        }while (pilih1!=8);
        
    }
    
}


    
    