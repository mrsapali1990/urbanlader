package JavaTraning;

class EvenThread extends Thread
{
    int limit;
     
    sharedPrinter printer;
     
    public EvenThread(int limit, sharedPrinter printer)
    {
        this.limit = limit;
         
        this.printer = printer;
    }
     
    @Override
    public void run() 
    {
        int evenNumber = 2;           //First even number is 2
         
        while (evenNumber <= limit)
        {
            printer.printEven(evenNumber);          //Calling printEven() method of SharedPrinter class
             
            evenNumber = evenNumber + 2;           //Incrementing to next even number
        }
    }
}