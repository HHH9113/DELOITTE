package deloitteproject;
interface ChangePassword{
	void doChange();
}

public class DemoInnerClass {
	
	class EncryptPassword
	{   String password = "pass@12356";
		int passwordLevel=5;
		public void doEncrypt()
		{
			
			System.out.println("The password is: " + password);
		}
		class ShowPassword
		{
			public void Show()
			{
				System.out.println("password " + password);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoInnerClass di = new DemoInnerClass();
		DemoInnerClass.EncryptPassword ep = di.new EncryptPassword();
		ep.doEncrypt();
         EncryptPassword.ShowPassword sp = ep.new ShowPassword();
         sp.Show();
        ChangePassword cp = new ChangePassword() {       //annonymous inner class
			
			@Override
			public void doChange() {
				// TODO Auto-generated method stub
				System.out.println("The password is changed");
			}
		};
	cp.doChange();
	}
	

}
