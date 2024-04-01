package main;

import geometry.Block;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5); 
        double height = 10; // Define the height of the block
        Block block = new Block(rectangle, height); // Pass the height when creating the Block object
        
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Block Volume: " + block.calculateVolume());
        System.out.println("Block Base Area: " + block.calculateBaseArea());
    }
}
