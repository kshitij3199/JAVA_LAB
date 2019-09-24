package lab6;

import java.util.Comparator;

public class XspeedByYspeed implements Comparator<MovablePoint> {
	public int compare(MovablePoint mp1,MovablePoint mp2) {
		if (mp1.xSpeed==mp2.xSpeed)
		{
			if (mp1.ySpeed==mp2.ySpeed)
			{
				return 0;
			}
			else if (mp1.ySpeed>mp2.ySpeed)
				return 1;
			else 
				return -1;
		}
		else if (mp1.xSpeed>mp2.xSpeed)
			return 1;
		else 
			return -1;
	}

}
