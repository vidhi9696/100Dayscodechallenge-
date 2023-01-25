import java.util.*;
class profitloss
{
    public static void main(String args[])
    {
        
        int cprice,sprice, plamt; 
        Scanner s = new Scanner(System.in);
        cprice=s.nextInt();
        sprice=s.nextInt(); 
      
        if(sprice>cprice) 
        {  
            plamt = sprice-cprice;  
            System.out.println("profit amount: "+ plamt);   
        }  
        else if(cprice>sprice) 
        {  
            plamt = cprice-sprice;  
           System.out.println("loss amount : "+ plamt);  
        }  
        else 
        {  
           System.out.println("You are running in no profit no loss condition"); 
        }  
    }
}
