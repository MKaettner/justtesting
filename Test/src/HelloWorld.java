
public class HelloWorld {
	public static void main(String[] args) {
		
		int one = 1;
		int two = 2;
		
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		
		System.out.println(VariousThings.add(one, two));
		
		System.out.println(VariousThings.accumulate(array));
		
		System.out.println(VariousThings.hashiarrangs(array));
	}
}
