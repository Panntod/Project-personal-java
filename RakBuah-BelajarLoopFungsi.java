package prog_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BelajarLoopFungsi {
    
    
    static ArrayList listbuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        
        System.out.println("========Menu========");
        System.out.println("[1] Show Menu Buah");
        System.out.println("[2] Tambah Buah");
        System.out.println("[3] Ganti Buah");
        System.out.println("[4] Hapus Buah");
        System.out.println("[5]Hapus Seluruh Buah");
        System.out.println("[6] Exit");
        System.out.print("Pilih Menu> ");

        int selectMenu = Integer.valueOf(input.readLine());
        
        switch (selectMenu){
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deletBuah();
                break;
                
            case 5:
                listbuah.clear();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }
    
    static void showAllBuah(){
        if(listbuah.isEmpty()){
            System.out.println("Isi Rak Buah Masih Kosong\n");
        }else{
            //tampilkan seluruh buah
            for (int i = 0; i < listbuah.size(); i++) {
                System.out.println(String.format("[%d]%s", i+1, listbuah.get(i)));
            }
        }
    }
    
    static void insertBuah() throws IOException{
        boolean ulang = true;
        while(ulang){
        System.out.print("Masukkan Nama Buah: ");
        String namaBuah = input.readLine();
        listbuah.add(namaBuah);
        System.out.print("Apakah kamu ingin memanambah lagi? (YA/TIDAK) : ");
        String k = input.readLine();
           if(k.equalsIgnoreCase("ya")){
               ulang = true;
           }else if(k.equalsIgnoreCase("Tidak")){
               ulang = false;
           }
       }
       
    }
    
    static void editBuah() throws IOException{
        showAllBuah();
        
        //pilih buah yang diganti
        System.out.print("Pilih nomor buah yang akan diganti: ");
        int indexBuah = Integer.valueOf(input.readLine()) - 1;
        
        //masukkan nama buah yang baru
        System.out.print("Masukkan Nama Baru: ");
        String namaBaru = input.readLine();
        
        //ganti nama buah
        listbuah.set(indexBuah, namaBaru);
    }
    
    static void deletBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomor buah yang akan dihapus: ");
        int nomorDelet = Integer.valueOf(input.readLine())-1;
        listbuah.remove(nomorDelet);
    }
    
    public static void main(String[] args) throws IOException{
        do {            
            showMenu();
        } while (isRunning);
    }
    
    
}
