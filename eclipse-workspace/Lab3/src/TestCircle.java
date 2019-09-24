
public class TestCircle {
	
		public static void main(String args[]) {
			Circle c1 = new Circle(2.3);
			c1.area();
			// accessing static method with class name
			Circle.getCircumference();
			Circle c2 = new Circle(3.45);
			c2.area();
			// accessing static method with references is discouraged
			//c2.getCircumference (3.45);
		}
	}
