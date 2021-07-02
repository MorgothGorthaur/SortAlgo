import java.util.ArrayList;
import java.util.Arrays;
abstract class Algo {
	protected ArrayList<Double> array = new ArrayList <Double> ();
	Algo (ArrayList<Double> array){
		this.array = array;
	}
	Algo (){
		ArrayList <Double> array = new ArrayList <Double>();
		array.add((double) 0);
		array.add((double) 0);
		array.add((double) 0);
		this.array = array;
			
	}
	public ArrayList <Double> ReturnArray(){
		return array;
	}
	protected void swap(int i,int j) {
		double temp = array.get(i);
		array.set(i,array.get(j));
		array.set(j, temp);
	}
	
}
