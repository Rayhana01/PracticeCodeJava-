package Demo;

public class FixedDeposit implements Bank2 {
	
	@Override
	public void calculateinterest() {
		// TODO Auto-generated method stub
		
		System.out.println("CI Calculated");
		
	}

	@Override
	public void calculatetax() {
		// TODO Auto-generated method stub
		
		System.out.println("CT Calculated");
		
		
	}

	@Override
	public void calculateemi() {
		// TODO Auto-generated method stub
		
		System.out.println("CE Calculated");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedDeposit FD=new FixedDeposit();
		FD.calculateemi();
		FD.calculateinterest();
		FD.calculatetax();
		

	}

	
}
