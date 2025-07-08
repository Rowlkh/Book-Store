
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roaa
 */
public class EBook extends Book{
    private String fileType;

    public EBook(String fileType, String ISBN, String title, LocalDateTime year_published, double price) {
        super(ISBN, title, year_published, price);
        this.fileType = fileType;
    }
    
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
        @Override
    public void deliver(String email, String address) {
        System.out.println("Deliver to " + email);
    }
    

    
}
