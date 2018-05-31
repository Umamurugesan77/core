package core;

public class car {
	String model;
	double speed;

public boolean start() {
	return true;
}
public void accelerate() {
	speed += 10;
}
public static void main(String args[])
{
	car car1 = new car();
	car car2 = new car();
	car1.speed=20.3;
	car2.speed=30.3;
	System.out.println(car1.speed);
	System.out.println(car2.speed);
}
}
