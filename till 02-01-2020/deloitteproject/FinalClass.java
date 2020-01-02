package deloitteproject;

public class FinalClass {
     public final int AGE;
	public FinalClass() {
		AGE = 22;
		System.out.println(AGE);
	}
	public FinalClass(int i) {
		AGE = 23;
		System.out.println(AGE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FinalClass fc = new FinalClass();
         fc = new FinalClass(34);
         
	}

}
