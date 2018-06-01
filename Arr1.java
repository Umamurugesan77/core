public class Arr1 {
	public static void main(String args[]) {
		int sum = 1;
		String sum1 = "";
		for(int i=1;i<args.length;i++) {
			sum = sum + Integer.parseInt(args[i]);
			sum1 = sum1 + args[i];
		}
			System.out.println(sum);
			System.out.println(sum1);
		}
}