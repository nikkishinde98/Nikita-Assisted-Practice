package InnerClass;

public class innerClassAssisted1 {
		private String msg = "Hello Inner Class";
		void display() {
			class Inner1 {
				void msg() {
					System.out.println(msg);
				}
			}
			Inner1 a = new Inner1();
			a.msg();
		}
		
		public static void main(String [] args) {
			innerClassAssisted1 ob = new innerClassAssisted1();
			ob.display();
	}
}

