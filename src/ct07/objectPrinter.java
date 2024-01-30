package ct07;

public class objectPrinter {
	public static void main(String[]args) {
		
		Printer printer = new Printer("epson",7000,"white");
		
		System.out.println("name:"+ printer.getName());
		System.out.println("befor money:"+ printer.getMoney());
		System.out.println("color:"+ printer.getColor());
		
		printer.setMoney(7700);
		System.out.println("after money:"+ 7700);
	}
	

}
