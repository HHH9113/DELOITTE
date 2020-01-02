//local and instance variable
package Finance;

public class Variable {
	int i;// instance variable initialize by compiler
	int num=30;
	public void show() {
		int j;  //local variable must initialize by us
		if(num==40) {
			j=20;
		}
		else
		{
			j=60;
		}
		System.out.println(i);
		System.out.println((i+num)-j);
		
	}
	public static void main (String args[])
	{
		Variable v = new Variable();
		v.show();
	}
}
