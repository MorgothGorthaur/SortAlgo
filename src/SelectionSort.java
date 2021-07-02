import java.util.ArrayList;

public class SelectionSort extends Algo {
	SelectionSort(ArrayList<Double> array){
		 super(array);
	 }
	 @Override
	 public ArrayList <Double> ReturnArray(){
		 for(int i = 0; i < array.size(); i++) {
			 int min = i;
			 for( int j =i + 1; j < array.size(); j++) {
				 if (array.get(j) < array.get(min)) {
					 min = j;
				 }
			 }
			 /*double temp = array.get(i);
			 array.set(i,array.get(min));
			 array.set(min, temp);*/
			swap(i,min);
			 
		 }
		 return array;
	 }
}
