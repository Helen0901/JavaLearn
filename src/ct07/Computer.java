package ct07;

public class Computer {
	
	private String name;
	
	private int  memorySize;
	
	private String processor;
	

	
	public Computer(String name,int  memorySize,String processor){
		
		this.name = name;
		this.memorySize = memorySize;
		this.processor = processor;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemorySize(){
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	public String getProcessor(){
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor =  processor;
	}

	
}
