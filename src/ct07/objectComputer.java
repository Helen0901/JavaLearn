package ct07;

public class objectComputer {
	public static void main (String[]args) {
		
	  Computer computer = new Computer("Surface Laptop Studio 2",16,"Intel Core i7");
		
	  System.out.println("before name:"+ computer.getName()+ "/before memorySize:" + computer.getMemorySize()+"/before computer processor:"+ computer.getProcessor());
	
	  computer.setName("niubiplus");
	  computer.setMemorySize(20);
	  computer.setProcessor("abaaba");
	  
	  System.out.println("after name:"+ computer.getName()+ "/after  memorySize:" + computer.getMemorySize()+"/after  computer processor:"+ computer.getProcessor());
		
	
	}

}
