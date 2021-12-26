package Java_3_Interface;

public class hsbcbank implements bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transfermoney() {
	
		System.out.println("transfer money");
	}

	@Override
	public void credit() {
		System.out.println("credit money");

	}

	@Override
	public void debit() {
		System.out.println("debit money");

	}

	// create one function 
	public void internationaltransfer(){
		
	}
}
