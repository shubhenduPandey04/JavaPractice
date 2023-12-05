public class Main {
  public static void main(String[] args) {
    // var browser = new Browser();
    // browser.navigate(null);

    //Example for Abstraction
    // Super s1 = new sub();
    // s1.constr();
    // s1.methd();

    //Example for Abstraction on KFC
    // Kfc k1 = new MyKfc();
    // k1.makeItem();
    // k1.billing();
    // k1.offers();

    //Example of Abstraction on Shapes
    // Shapes s1 = new Circle();
    // s1.perimeter();
    // s1.area();

    // Shapes s2 = new Rectangle();
    // s2.perimeter();
    // s2.area();

    //Example of Interface on Phone
    Phone p1 = new Phone();
    p1.call();
    p1.sms();
    ICamera p2 = new SmartPhone();
    p2.click();
    p2.record();
    IMusicPlayer p3 = new SmartPhone();
    p3.play();
    p3.stop();
  }
}
