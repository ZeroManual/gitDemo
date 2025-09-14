package methods;

/**
 * Hello world!
 *
 */
public class Method {
	  static void myMethod() {
	    System.out.println("I just got executed!");
	    System.out.println("Call me from main");
	    System.out.println("Iam waiting for ALLAH");
	  }

	  public static int DoubleMyMoney(int a) {
		  int result =a*2;
		  return result;
	  }
	  public static void main(String[] args) {
	    myMethod();
	    int totalDoubledMoney= DoubleMyMoney(500000);
	    System.out.println("Doubled Money:"+totalDoubledMoney);
	  }
	}
