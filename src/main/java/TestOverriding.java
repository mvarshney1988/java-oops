
public class TestOverriding {

	public static void main(String[] args) {
		A a = new B();
		a.print("test");
		a.print(123);

	}

}
 class A{
	
	public void print(Integer i){
		System.out.println(i);
	}

	
}
class B extends A {
	
	

	public void print(String s){
		System.out.println(s);
	}
}