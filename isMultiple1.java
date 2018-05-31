public class isMultiple1 {
	public static void main(String args[]) {
		isMultiple1 t1=new isMultiple1();
		System.out.println(t1.isMultiple(2,3));
		
	}
		public boolean isMultiple(int one,int two) {
			return two % one ==0 ? true : false;
		}
}
