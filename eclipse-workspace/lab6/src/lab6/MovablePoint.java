package lab6;

public class MovablePoint implements Movable {
	int x,y,xSpeed,ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y -= ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y += ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x += xSpeed;
	}
	@Override
	public String toString() {
		return x +":" + y;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	
}
