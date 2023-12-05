//Example on Abstraction topic.

abstract public class Kfc {
  Kfc(){
    System.out.println("KFC Constructor has something ;)");
  }

  void makeItem(){
    System.out.println("1 Order, Burger with Coke.");
  }
  abstract void billing();
  abstract void offers();
}

class MyKfc extends Kfc{
  void billing(){
    System.out.println("Payments are accepted online only.");
  }

  void offers(){
    System.out.println("New year offer's on Burger, 50% off.");
  }
}
