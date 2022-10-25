import java.util.Scanner;
public class runBloodData {
	public static void main(String[] args) { 
	Scanner input=new Scanner(System.in);
    
    System.out.print("Enter the blood type of the patient:");
    String input1=input.nextLine();
    if(input1.equalsIgnoreCase("O")||input1.equalsIgnoreCase("A")||input1.equalsIgnoreCase("B")||input1.equalsIgnoreCase("AB")){
    }
    
    System.out.print("Enter the Rhesus factor (+ or -): ");
    String input2=input.nextLine();
    if(input2.equals("+")||input2.equals("-")){
    }
    
    if(!input1.isEmpty()&&!input2.isEmpty()){
    	BloodData bd = new BloodData();
    	bd.setBloodType(input1);
    	bd.setRhFactor(input2);
    	bd.display();
    }
    else if (input1.isEmpty()&&input2.isEmpty()){
    	BloodData bd = new BloodData();
    	bd.display();
    }
    else{
    	System.out.println("Invalid!");
    }
}
}