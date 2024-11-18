package Demo;

public class FindoccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Rayhana Ibrahim";
		char ch[] = str.toCharArray();
		
		// ch= ['R','a','y','h','a','n','a','I','b','r','a','h','i','m']

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (ch[i] == 'R' || ch[i]=='r') {
				count++;

			}
		}

		System.out.println("the occrence of char r = " + count);

	}

}
