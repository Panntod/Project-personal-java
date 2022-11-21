package ujicobanuklir;

import java.util.HashMap;
import java.util.Map;


public class hashMap {
    
    
    public static void main(String[] args) {
        
        //membuat objek hasmap
        HashMap <String, Buku> books = new HashMap <String,Buku> ();
        Buku bukuJava = new Buku("Tutotial Java","Pandhu");
        Buku bukuKotlin = new Buku("tutorial Kotlin", "Ahsan");
        Buku bukuAndroid = new Buku("Tutorial Android","Yudhi");
        
        //mengisi objek hasmap dengan buku
        books.put("Java",bukuJava);
        books.put("Kotlin",bukuKotlin);
        books.put("Android",bukuAndroid);
        
        //memanggil buku
        for (Map.Entry b : books.entrySet()) {
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey()+": "+buku.getTitle() + " by " + buku.getAuthor());
            
        }
    }

 
    }

