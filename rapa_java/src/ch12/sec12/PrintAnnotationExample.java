package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		try {
			Class _class = Service.class;
			Method[] methods = _class.getMethods();
			
			for(Method method: methods) {
				PrintAnnotation printAnn = method.getAnnotation(PrintAnnotation.class);
				if (printAnn != null) {
					String mark = printAnn.value();
					int number = printAnn.number();
					for (int i = 0; i< number; i++) {
						System.out.print(mark);
					}
					System.out.println();
					method.invoke(new Service());
					
					for (int i = 0; i< number; i++) {
						System.out.print(mark);
					}
					System.out.println();
				}
			}
		} catch(Exception e) {System.err.println(e.getMessage());}
		
	}

}
