import java.util.ArrayList;

public class InsertionSort extends Algo {
	InsertionSort(ArrayList<Double> array){
		 super(array);
	 }
	@Override
	 public ArrayList <Double> ReturnArray(){
		for(int i = 0; i < array.size();i++) {
			double key = array.get(i);
			int j = i-1;
			for ( ; j>=0;j--) {
				if(key < array.get(j)) {
					array.set(j+1, array.get(j));
				}else {
					break;
				}
			}
			array.set(j+1, key);
		}
		return array;
	}
}
