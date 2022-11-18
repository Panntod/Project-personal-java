import java.util.*;

public class Main {
    
    final static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {

        Map<String, Integer> listMakanan = new HashMap<String, Integer>();
        int bayar=0;
        
        // Kode untuk menambah menu
        listMakanan.put("nasi goreng", 10000);
        listMakanan.put("mie goreng", 6000);
        listMakanan.put("mie ayam", 12000);
        
        //menampilkan menu
        menu(listMakanan);
        
        //pertanyaan buat input looping
        System.out.print("\nApa yang kamu ingin pesan (Ya/Tidak) ");
        String n = sc.next();
        
        //cek apakah iya
        if (n.equalsIgnoreCase("ya")) {
            System.out.print("Berapa Pesananmu? ");
            int a = sc.nextInt();
            sc.nextLine();
            
            //melooping sesuai inputan
            for (int i = 1; i <= a; i++) {
                int pesanan = loopTotal(listMakanan, i);
                if (pesanan != -1){
                    bayar += pesanan;
                }else {
                    System.out.println("Pesanan anda tidak ada di menu");
                }                
            }
            
            //cek kondisi bayar
            if (bayar == 0) {
                System.out.println("Tidak Ada Pesanan");
            }else if (bayar != 0) {
                System.out.println("Total pesananmu : " + bayar);
            }
            
            
        //cek apakah tidak
        }else if(n.equalsIgnoreCase("tidak")){
            System.out.println("Terimakasih atas Kunjunganya");
        }
        
        
    }
    
    //menampilkan menu dan harga
    public static void menu(Map<String, Integer> listMakanan) {
        System.out.println("MENU MAKANAN\n");
        for (String key : listMakanan.keySet()) {
            System.out.println(key + " : Rp." + listMakanan.get(key));
        }
    }
    
    //menampilkan sesuai looping
    private static int loopTotal(Map<String, Integer> listMakanan, int urutan) {
        System.out.print("Apa Pesanan ke-" + urutan + "? ");
        String pesanan = sc.nextLine().trim();
        if (listMakanan.get(pesanan) == null){
            return -1;
        }
        return listMakanan.get(pesanan);
    }
    
}
