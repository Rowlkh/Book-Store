
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Roaa
 */
public class PaperBook extends Book {
    private int stock;

    public PaperBook(int stock, String ISBN, String title, LocalDateTime year_published, double price) {
        super(ISBN, title, year_published, price);
        this.stock = stock;
    }

 

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void reduceStockQuantity(int Quantity)
    {
        stock -=Quantity;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Shipped to " + address);
    }
    
}
