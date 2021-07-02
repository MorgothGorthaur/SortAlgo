import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {
		System.out.println("start");
		// TODO Auto-generated method stub
		ArrayList <Double> array = new ArrayList <Double> ();
		for ( int i = 6; i > 0; i--) {
			array.add((double)i);
		}
		BubleSort buble = new BubleSort(array);
		SelectionSort selsort = new SelectionSort(array);
		InsertionSort insort = new InsertionSort(array);
		ShuttleSort shtlesort = new ShuttleSort(array);
		ShellSort ssort = new  ShellSort(array);
		//PrintResult(ssort);
		
		
	}
	public static void PrintResult(Algo algo) {
		System.out.println(algo.ReturnArray());
	}
}
