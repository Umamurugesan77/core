public class isPerfect {
	public static void main(String args[]) {
		isPerfect t1=new isPerfect();
		System.out.println(t1.isPerfect(6));
	}
	public boolean isPerfect(int number) {
		int sum = 0;
		for(int i=1;i<=number/2;i++) {
			if(number%i == 0) {
				sum=sum+i;
			}
		}
		if(sum==number) {
			return true;
		}else {
			return false;
		}
	}

}
