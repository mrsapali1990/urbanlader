package JavaTraning;

public class MainClass 
{
    public static void main(String[] args) 
    {
        sharedPrinter printer = new sharedPrinter();
         
       // OddThread oddThread = new OddThread(20, printer);
         
      //  oddThread.setName("Odd-Thread");
         
        EvenThread evenThread = new EvenThread(20, printer);
         
        evenThread.setName("Even-Thread");
         
       // oddThread.start();
         
        evenThread.start();
    }
}