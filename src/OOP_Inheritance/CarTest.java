package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//child (BMW) -- overridden
		b.stop();//Parent(CAR) -- Inherited
		b.refuel();//Inherited
		b.autoParking();//Individual
		b.engine();//--overridden
		b.increaseSpeed();//Inherited
		BMW.billing();//Individual
		Car.billing();
		b.getBMWInfo();
		b.getInfo();
		System.out.println(b.speed);//200

		
		System.out.println("--------");

		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		au.engine();
		System.out.println(au.speed);//100

		
		System.out.println("--------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println(c.speed);//100
		
		System.out.println("--------");

		Truck tr = new Truck();
		tr.loading();
		
		System.out.println("--------");

		//child class object can be referred by parent class ref variable
		//Top casting
		Car c1 = new BMW();
		c1.refuel();
		c1.stop();
		c1.start();
		c1.engine();
		c1.increaseSpeed();
		c1.getInfo();
		BMW.billing();
		
		
		//down casting:
		//parent class object can be referred by child class ref variable
		//BMW b1 = (BMW) new Car();//ClassCastException -- runtime
		
		//child class object can be referred by grand parent ref variable?
//		Vehicle v1 = new BMW(); //IS-A
//		v1.engine();
		
		//BMW b2 = (BMW) new Vehicle();//ClassCastException
				
		
	}

}
