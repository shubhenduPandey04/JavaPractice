public class Phone {
  void call(){
    System.out.println("Dailing..");
  }
  void sms(){
    System.out.println("Sms sent..");
  }
}

interface ICamera {
  void click();
  void record();
}

interface IMusicPlayer{
  void play();
  void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{
  @Override
  public void click() {
    System.out.println("Clicked some amazing pics of Krishna and Radha Rani");
  }
  @Override
  public void record() {
    System.out.println("Recorded some Krishna and Radha Rani's past time shorts");
  }
  @Override
  public void play() {
    System.out.println("Krishna playing flute for Radha rani");
  }
  @Override
  public void stop() {
    System.out.println("Video player stoped after watching Krishna and Radha rani");
  }
}