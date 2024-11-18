package Demo;

public class sortingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 100,20, 5, 2,120 };
		int temp;

		for (int i = 0; i < 5; i++) {

			for (int j = i + 1; j < 5; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

}
