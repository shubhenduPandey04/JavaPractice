//Example on Abstraction topic

abstract class Super{
  void constr(){System.out.println("Constructor has been called..");}
 abstract public void methd();
}

class sub extends Super{
  // @Override
   public void methd(){System.out.println("Abstract method has been called..");}
}