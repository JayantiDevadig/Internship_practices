//Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.


class Shape{
  int getArea(){
    return 0.0;
  }
  class circel extends Shape{
  double getArea(){
    int r=7;
   double area=(22/7)*(r*r);
    System.out.println("area of circel");
    return area;
    }
    
  }
  class extends Shape{
    double getArea(){
      int l=8,b=6;
    double length=(l*b);
      return length;
      
    }
  }
  class ShapesDemo{
    public static void mai (String args[]);
    circel area=new circel();
    Rectangle length=new Rectangle();
    double result;
    result=area.getArea();
    System.out.println("the result is"+result);
  }
