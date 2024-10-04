package kadai_014;

public class Car_Chapter14 {
private int gear = 1;
private int speed = 10;

public Car_Chapter14(int gear , int speed) {
	this.gear = gear;
	this.speed = speed;
	
	 System.out.println("現在のギアは" + this.gear + "です" );
     System.out.println("現在の速度は時速" + this.speed + "kmです");	
	}
public void gearChange(int aftergear) {
	System.out.println("ギア" + this.gear + "から" + aftergear + "に切り替えました");
	switch(aftergear) {
	 case 1  -> this.speed = 10;
	    case 2  -> this.speed = 20;
	    case 3  -> this.speed = 30;
	    case 4  -> this.speed = 40;
	    case 5  -> this.speed = 50;
	    default -> this.speed = 10;
	}
}
public void run() {
	System.out.println("速度は時速"  + this.speed + "kmです");
	
}
}