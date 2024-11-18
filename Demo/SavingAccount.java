package Demo;

public class SavingAccount implements Bank2{
	
	@Override
	public void calculateinterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatetax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateemi() {
		// TODO Auto-generated method stub
		System.out.println("Emi calculated");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount s1=new SavingAccount();
		s1.calculateemi();
	}

}

