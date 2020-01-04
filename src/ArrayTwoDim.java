
public class ArrayTwoDim {
	public static void main(String[] args) {
		int[][] ArrayTwoDim = new int[4][3];
		int temp = 10;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				ArrayTwoDim[i][j] = temp;
				temp += 10;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				{
					System.out.println(ArrayTwoDim[i][j]);
				}
			}
		}

	}
}
