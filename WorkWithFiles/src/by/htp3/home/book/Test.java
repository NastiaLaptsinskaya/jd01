	package by.htp3.home.book;
	
	public class Test {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Point p = new Point(5, 90);
			Point coloredPoint = new ColoredPoint(3, 6, "red");
			
			String n1 = p.getClass().getName();
			String n2 = coloredPoint.getClass().getName();
			System.out.println(n1 + " " + n2);
			System.out.println(n1.equals(n2));
			
			System.out.println( "p instanceof Point   ---> " + (p instanceof Point) ); //true
			System.out.println( "coloredPoint instanceof Point   ---> " + (coloredPoint instanceof Point) );//true
		}
	
	}
	
	class Point {
		private int x;
		private int y;
	
		public int getX() {
			return x;
		}
	
		public void setX(int x) {
			this.x = x;
		}
	
		public int getY() {
			return y;
		}
	
		public void setY(int y) {
			this.y = y;
		}
	
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	class ColoredPoint extends Point {
		private String color;
	
		ColoredPoint(int x, int y, String color) {
			super(x, y);
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}
