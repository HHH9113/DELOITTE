package deloitteproject;

public class Mammal {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();
		l.roam();
		l.sleep();
		l.makeNoise();
		System.out.println("----------------------");
		Tiger t = new Tiger();
		t.eat();
		t.roam();
		t.sleep();
		t.makeNoise();
		System.out.println("----------------------");
		Cat c = new Cat();
		c.eat();
		c.roam();
		c.sleep();
		c.makeNoise();
		System.out.println("----------------------");
		Hippo h = new Hippo();
		h.eat();
		h.roam();
		h.sleep();
		h.makeNoise();
		System.out.println("----------------------");
		Dog d = new Dog();
		d.eat();
		d.roam();
		d.sleep();
		d.makeNoise();
		
		Wolf w = new Wolf();
		w.eat();
		w.roam();
		w.sleep();
		w.makeNoise();
		
		
		
	}
}
abstract class Animal {
    public abstract void eat();
    public abstract void makeNoise();
    public abstract void roam();
    public void sleep()
    {
   	 System.out.println("Animal sleeps");
    }
		
	

}
 abstract class Fenine extends Animal{

	@Override
	public void roam() {
	System.out.println("Fenine roam");
	}

	
	

}
 class Lion extends Fenine {

		@Override
		public void eat() {
			System.out.println("Lion eats");
			
		}

		@Override
		public void makeNoise() {
			System.out.println("Lion roar");
			
		}
 }

		
		 class Tiger extends Fenine {

				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("Tiger eats");
				}

				@Override
				public void makeNoise() {
					// TODO Auto-generated method stub
					System.out.println("Tiger roar");
				}

				
			}
		 class Cat extends Fenine{

				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("Cat eats");
				}

				@Override
				public void makeNoise() {
					// TODO Auto-generated method stub
					System.out.println("Meow");
					
				}

				
			}
		 abstract class Canine extends Animal {

				@Override
				public void roam() {
					// TODO Auto-generated method stub
					System.out.println("Canine roams");
					
				}
				

				
			}


		 class Dog extends Canine {

				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("Dog eats");
					
				}

				@Override
				public void makeNoise() {
					// TODO Auto-generated method stub
					System.out.println("Dog bark");
					
				}

				
			}
		 class Wolf extends Canine {

				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("Wolf eats");
					
				}

				@Override
				public void makeNoise() {
					// TODO Auto-generated method stub
					System.out.println("Wolf");
					
				}

				
			}
		 class Hippo extends Animal {

				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("Dog eats");
					
				}

				@Override
				public void makeNoise() {
					// TODO Auto-generated method stub
					System.out.println("Dog bark");
					
				}

				@Override
				public void roam() {
					// TODO Auto-generated method stub
					System.out.println("Hippo roam");
					
				}

				
			}



		
	