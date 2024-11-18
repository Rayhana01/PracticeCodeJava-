package Demo;

public class CurrentAccount implements Bank2 {

	double income=10000;
	double taxrate=0.2;
	

	@Override
	public void calculateinterest() {
		// TODO Auto-generated method stub

		System.out.println("Interest Calculated");
		System.out.println();

	}

	@Override
	public void calculatetax() {
		// TODO Auto-generated method stub
		
		double tax=income*taxrate;
		
		System.out.println("Tax Calculated: "+ tax);
		System.out.println();
		
	}

	@Override
	public void calculateemi() {
		// TODO Auto-generated method stub
		System.out.println("EMI Calculated");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrentAccount AC = new CurrentAccount();
		AC.calculateinterest();
		AC.calculatetax();
		AC.calculateemi();

	}

}