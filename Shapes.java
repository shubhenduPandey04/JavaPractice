abstract public class Shapes {
  abstract void perimeter();
  abstract void area();
}

class Circle extends Shapes{
  double r=81.34;
  @Override
  void perimeter() {
    System.out.println("Perimeter of circle: "+2*3.14*r);
  }

  @Override
  void area() {
    System.out.println("Area of Circle: "+3.14*r*r);
  }
}

class Rectangle extends Shapes{
  int l=30;
  int b=20;
  @Override
  void perimeter() {
    System.out.println("Perimeter of Rectangle: "+2*(l+b));
  }

  @Override
  void area() {
   System.out.println("Area of Rectangle: "+l*b);
}
}