package Tasks;

	public class Shape {
		double length = 10;
		double breadth = 20;
		double height = 30;
	}

	class Square extends Shape {
		void area() {
			System.out.println("Area of Square : " +length*length);
		}
	}

	class Rectangle extends Shape {
		void area() {
			System.out.println("Area of rectangle : "+length*breadth);
		}
	}

	class Trapazium extends Shape {
		void area() {
			System.out.println("Area of Trapazium : " + (length+breadth)/2*height);
		}
	}

	class Inheritance {
		public static void main(String[] args) {
			Square sqr = new Square();
			Rectangle rec = new Rectangle();
			Trapazium trp = new Trapazium();
			sqr.area();
			rec.area();
			trp.area();
		}
	}
