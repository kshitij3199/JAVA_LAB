package lab6;
public class MovableCircle implements Movable, Comparable<MovableCircle> {
//public class MovableCircle implements Movable, Comparable {
	private MovablePoint center; // can use center.x, center.y directly
									// because they are package accessible
	private int radius;
	
	public MovableCircle(int x ,int y, int xSpeed, int ySpeed, int radius) {
		// Call the MovablePoint's constructor to allocate the center instance.
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
		}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.x -= center.xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.x += center.xSpeed;
	}
	public String toString() {
		return center.x +":" + center.y;
	}
	@Override
	public int compareTo(MovableCircle mov_c) {
		if (radius == mov_c.radius)
			return 0;
		else if (radius >mov_c.radius)
			return 1;
		else 
			return -1;
		
	}
//	@Override
//	public int compareTo(Object other) {
//		MovableCircle mov_c = (MovableCircle) other;
//		if (radius == mov_c.radius)
//			return 0;
//		else if (radius >mov_c.radius)
//			return 1;
//		else 
//			return -1;
//		
//	}

	public MovablePoint getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}
	

}
