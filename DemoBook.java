
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roaa
 */
public class DemoBook extends Book{

    public DemoBook(String ISBN, String title, LocalDateTime year_published, double price) {
        super(ISBN, title, year_published, price);
    }
    
    @Override
    public void deliver(String email,String address)
    {
        System.out.println("Demo Books are not for sale :)");
    }
    
}
