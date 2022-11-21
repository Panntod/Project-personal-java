package ujicobanuklir;

public class Buku {
    
    private String title;
    private String author;
    
    public Buku (String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthor(String author){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
}
  

