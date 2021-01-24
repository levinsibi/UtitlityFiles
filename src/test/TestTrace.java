package test;

public class TestTrace {
	
	public  static void a() {
		b();
	}

	private static void b() {
		// TODO Auto-generated method stub
		String s=c();
		System.out.println(s);
	}

	
	private static String c() {
		// TODO Auto-generated method stub
		StackTraceElement trace[] = Thread.currentThread().getStackTrace();
	    if (trace.length > 0) {
	      return trace[trace.length - 1].getClassName();
	    }
	    return "Unknown";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a();
	}

}
