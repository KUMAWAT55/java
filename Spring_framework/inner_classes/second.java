

public class second {
private first A;

public first getA() {
	return A;
}

public void setA(first a) {
	System.out.println("second class injection");
	A = a;
}
public  void method(){
	A.method();
}
}
