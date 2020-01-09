package checking;


class lets {

	class outer
	{
		
		public void letstest()
		{
			System.out.print("Hogya");
		}
	}
}

class inner extends lets

{

	public static void main(String[] args) {
		lets e= new lets();
		lets.outer f=e.new outer();
		
		f.letstest();
	}
}