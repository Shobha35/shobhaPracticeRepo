package JavaProgramAssignment;


class Bank 
{
    
    final String IFSC = "BANK0001234";

   
    final void showIFSC() 
    {
        System.out.println("The IFSC Code is: " + IFSC);
    }
}

class HDFCBank extends Bank 
{
    
    // Attempting to override the final method
    //  If uncomment the lines below, the program will NOT compile.
    
  
//    void showIFSC() {
//        System.out.println("Trying to change implementation...");
//    }
    
    
    public void display()
    {
        System.out.println("This is HDFC Bank.");
    }
}



public class FinalKwyword_Q9 
{
public static void main(String[] args) 
{
     HDFCBank b = new HDFCBank();

      b.showIFSC(); 
      b.display();
    }

}
