package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Movable m1 = new MovablePoint(5, 6, 10,11); // upcast
//		System.out.println(m1);
//		m1.moveLeft();
//		System.out.println(m1);
//		Movable m2 = new MovableCircle(2, 1, 2,1, 20); // upcast
//		System.out.println(m2);
//		m2.moveRight();
//		System.out.println(m2);
		
//		ArrayList<MovableCircle> al = new ArrayList<MovableCircle>();
//		al.add(new MovableCircle(1, 1, 1, 1, 1));
//		al.add(new MovableCircle(1, 1, 1, 1, 20));
//		al.add(new MovableCircle(1, 1, 1, 1, 13));
//		al.add(new MovableCircle(1, 1, 1, 1, 15));
//		Collections.sort(al);
//		for(MovableCircle mc : al) {
//			System.out.println(mc.getCenter().x+":"+mc.getCenter().y +":"+mc.getRadius());
//			}
		
		ArrayList<MovablePoint> al2 = new ArrayList<MovablePoint>();
		al2.add(new MovablePoint(1, 1, 1, 1));
		al2.add(new MovablePoint(2, 3, 5, 7));
		al2.add(new MovablePoint(2, 3, 5, 6));
		al2.add(new MovablePoint(2, 3, 7, 8));
		al2.add(new MovablePoint(2, 3, 6, 5));
		Comparator<MovablePoint> c1 = new XspeedByYspeed();
		Collections.sort(al2,c1);
		for(MovablePoint mp : al2) {
			System.out.println(mp.xSpeed+":"+mp.ySpeed);
		}

	}

}
