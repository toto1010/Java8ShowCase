import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Zadanie8 {

	public void compereSortTimeForStreamAndParallelStream() {
		List<Integer> il = new Random().ints(100000, 0, Integer.MAX_VALUE).boxed().collect(Collectors.toList());
		List<Integer> il2 = new ArrayList<Integer>();
		il2.addAll(il);
		long start = System.nanoTime();
		il.stream().sorted();
		long time1 = System.nanoTime();
		
		il2.parallelStream().sorted();
		long time2 = System.nanoTime();
		
		System.out.println(time1 - start);
		System.out.println(time2 - start);
		
	}
	
	public static void main(String[] args) {
		Zadanie8 z8 = new Zadanie8();
		z8.compereSortTimeForStreamAndParallelStream();
	}
}
