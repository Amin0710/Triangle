//Triangle class-STARTS
public class Triangle_Task2
{
//Three double data fields named side1, side2, and side3
private double side1,side2,side3;
private String color;
private boolean filled;
//A no-arg constructor that creates a default triangle.
public Triangle_Task2()
{side1=side2=side3=1.0;}

//A constructor that creates a triangle with the specified side1, side2, and side3.

public Triangle_Task2(double side1,double side2,double side3)

{
this.side1=side1;
this.side2=side2;
this.side3=side3;
}

//The accessor methods for all three data fields.

public double getSide1() {return side1;}
public void setSide1(double side1) {this.side1 = side1;}

public double getSide2() {return side2;}
public void setSide2(double side2) {this.side2 = side2;}

public double getSide3() {return side3;}
public void setSide3(double side3) {this.side3 = side3;}

public String getColor(){return this.color;}
public void setColor(String color){this.color=color;}

public boolean getFilled() {return filled;}
public void setFilled(boolean filled) {this.filled = filled;}

//A method named getArea() that returns the area of this triangle.

public double getArea()
{
//finding half of the perimeter
double s=this.getPerimeter()/2;
//Calculating area using p value
double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
//returning area
return area;
}

//A method named getPerimeter() that returns the perimeter of this triangle.

public double getPerimeter()
{return (side1+side2+side3);}//returning perimeter

//A method named toString() that returns a string description for the triangle.

public String toString()
{return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3+getColor();}

}//Triangle class-ENDS