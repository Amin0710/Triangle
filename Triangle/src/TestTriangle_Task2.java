import java.util.Scanner;
//Testing class-Driver class
public class TestTriangle_Task2
{
//main method-Driver method
  public static void main(String[] args)
  {
//Scanner class to read inputs from user
    Scanner scan = new Scanner(System.in);
    
//prompts the user to enter three sides of the triangle
    System.out.print("Enter side1 of the triangle:");
    double side1=scan.nextDouble();
    System.out.print("Enter side2 of the triangle:");
    double side2=scan.nextDouble();
    System.out.print("Enter side3 of the triangle:");
    double side3=scan.nextDouble();
    System.out.print("Enter color of the triangle:");
    String color=scan.nextLine();
//skipping nextline
    scan.next();
    System.out.print("Triangle is filled or not?(Enter true,or flase)");
    boolean isFilled=scan.nextBoolean();
//create a Triangle object with these sides
    Triangle_Task2 triangle = new Triangle_Task2(side1,side2,side3);
//setting color and filled values
    triangle.setColor(color);
    triangle.setFilled(isFilled);
    
    System.out.println("\nArea of triangle:"+triangle.getArea());
    System.out.println("\nPerimeter of triangle:"+triangle.getPerimeter());
    System.out.println("\nColor of triangle: "+triangle.getColor());
    System.out.println("\nTriangle filled:"+triangle.getFilled());
    System.out.println(triangle.toString());
  }
}