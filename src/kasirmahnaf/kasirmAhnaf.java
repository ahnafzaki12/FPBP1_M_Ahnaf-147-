/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasirmahnaf;

/**
 *
 * @author ahnaf
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class kasirmAhnaf {
static Scanner s = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       String namastaff=""; 
       int totalbeli=0;
       int jumlahbeli=0; 
       int jb=0;
       int pilihmenu=0;
       int pilihlagi=0;
        
        String menu[]= new String[6];
        menu[0]="Nasi Goreng";
        menu[1]="Nasi Goreng Spesial";
        menu[2]="Mie Goreng";
        menu[3]="Mie Goreng Spesial";
        menu[4]="Es Teh";
        menu[5]="Es Jeruk";
        
        int harga[]=new int [6];
        harga[0]=13000;
        harga[1]=15000;
        harga[2]=16000;
        harga[3]=18000;
        harga[4]=3000;
        harga[5]=4000;
        
        int jumlah[]=new int[10];
        
        String nota[]=new String[10];
        
        int harganota[]= new int [10];
        
        int pilihid;
        
            System.out.println("Apa ID User anda : ");
            do{
                System.out.println("---------------MENU KASIR ORTEGA---------------");
            System.out.println("1.Owner\n2.Kasir\n3.Pelanggan\n4.Sudah");
            System.out.print("Pilih : ");
            pilihid=s.nextInt();
            switch (pilihid){
                case 1:
                   owner(menu,harga); break;
                             
                             
                                
                                
                case 2:
                    kasir2(menu, harga);
                    break;
                
                case 3:
                    pelangganSearching();
                    break;
                    
            }
            }while(pilihid!=4);
            System.out.println("Terima Kasih");
    }
   
    
    public static void owner(String menu[], int harga[]){
        int password, pilihhapus;
                        password=111111; 
                        System.out.println("Selamat Datang Di Menu Owner");
                        System.out.print("Password : ");
                        password=s.nextInt();
                        System.out.println("==============================================");
                        while (password!=111111) {
                            System.out.println("Password Salah");
                            System.out.print("Masukkan Password :");
                            password=s.nextInt();
                        }
                        System.out.println("==============================================");
                        System.out.println("-----hapus menu-----");
                        for (int i=0; i<menu.length; i++){
                                    System.out.println((i+1)+". " + menu[i]+ " Harga : "+harga[i]);
                                }
                                System.out.println("==============================================");
                                int hapus, i;
                                do{
                                System.out.print("Hapus Menu Indeks Ke : ");
                                hapus=s.nextInt();
                                for (i=hapus; i<menu.length-1; i++){
                                menu[i]=menu[i+1];
                                harga[i]=harga[i+1];}
                                menu[menu.length-1]="Menu Telah Di Hapus";
                                harga[harga.length-1]=0;
                                for(i=0; i<menu.length; i++){
                                System.out.println((i+1)+". "+menu[i]);
                                }
                                    System.out.println("Hapus Lagi ?\n1.Iya\n2.Tidak");
                                    System.out.print("Pilih : ");
                                    pilihhapus=s.nextInt();
                                }while(pilihhapus==1);
                                System.out.println("Terima Kasih");
    }
    
    
    
    public static void kasir2(String menu[], int harga[] ){
       
        String namastaff;
        int kembali;
        int jumlahbeli;
        int pilihmenu; int pilihlagi;
        System.out.println("Selamat Datang Di Menu Kasir");
        System.out.print("Masukan Nama Staff : ");
        namastaff=s.next();
        int total=0;
        
        
        System.out.println("------------MENU-----------");
        for (int i=0; i<menu.length; i++){
            System.out.println((i+1)+". "+menu[i]);
        }
        System.out.println("7. Sudah");
        System.out.println("---------------------------");
        System.out.print("Jumlah Beli : ");
        jumlahbeli=s.nextInt();
        
        String nota[]=new String[jumlahbeli];
        int jumlah[]= new int[jumlahbeli];
        int harganota[]=new int [jumlahbeli];
        
        for (int i=0; i<jumlahbeli; i++){
            System.out.print("Pilih Menu : ");
            pilihmenu=s.nextInt();
            nota[i]=menu[pilihmenu-1];
            System.out.print("Jumlah : ");
            int jb=s.nextInt();
            jumlah[i]=jb;
            harganota[i]=harga[pilihmenu-1];
            total=total+(harga[pilihmenu-1]*jb);
            
        }
        
        
        System.out.println("-------------------------------------");
        System.out.println("Total Harga : " + total);
        System.out.println("-------------------------------------");
        System.out.print("Uang Pembayaran : ");
        int uang =s.nextInt();
        if (uang>total){
            kembali = uang-total;
        } else {
            kembali=0;
        } 
       
            





        
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat ft2 = new SimpleDateFormat("hh.mm");
        
        System.out.println("");
        System.out.println("\t       --- WARUNG ORTEGA  ---");
        System.out.println("\t       --- RUNGKUT ASRI   --- ");
        System.out.println("\t       --- TELP : 0813625 --- ");
        
        System.out.println("");
        System.out.println(ft.format(dNow) + "\t\t\t " + ft2.format(dNow));
        
        
        
        
        for (int i=0; i<jumlahbeli; i++){
            System.out.println(nota[i]);
            System.out.println(jumlah[i] + "x    @" + harganota[i]+"\t\t\t Rp. " + (jumlah[i] * harganota[i]));
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Total Harga     : "+"\t"+ total);
        System.out.println("-----------------------------------------------");
        System.out.println("Tunai           : "+"\t"+ uang);
        System.out.println("Kembali         : "+"\t"+ kembali);
        System.out.println("===============================================");
        System.out.println("Nama Staff      : "+"\t"+ namastaff);
        System.out.println("");
        System.out.println("");
        System.out.println("\t Terimakasih Telah Berbelanja ");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    
    
    public static void pelangganSearching(){
        
        String menucari[]={"Nasi","Mie","Es"};
        
        
        boolean ketemu; int i, pilih=1; 
        do{
        System.out.println("--------CARI MENU--------"); 
        ketemu=false; 
        System.out.print("Cari Menu = "); 
        String cari = s.next();
        for (i = 0; i < menucari.length; i++) { 
            if(menucari[i].compareToIgnoreCase(cari)==0){
            ketemu = true; 
            break;
        } 
        } 
        if(ketemu==true){
        System.out.println("Menu Tersedia");
        }else{
        System.out.println("Menu Tidak Tersedia");
        }
        

        System.out.println("Cari lagi?"); 
        System.out.println("[1.Ya] [2.Tidak]"); 
        System.out.print("Jawab = ");
        pilih = s.nextInt();
        }while(pilih==1);
        System.out.println("Terima kasih...");
    }
}






