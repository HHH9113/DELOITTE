import Finance.*;
public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome");
		// TODO Auto-generated method stub
		Bye b = new Bye();
		b.display();
		Third th = new Third();
		th.calling();
		Fourth f = new Fourth();
		f.last();
		Fifth fi = new Fifth();
		fi.allTheBest();
		Salary salary = new Salary();
		int res = salary.calculateSalary(50000, 3000);
		System.out.println(res);

	}

}
