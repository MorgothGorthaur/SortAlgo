import java.util.ArrayList;
public class BubleSort extends Algo{
	 BubleSort(ArrayList<Double> array){
		 super(array);
	 }
	 @Override
	 public ArrayList <Double> ReturnArray(){
		for(int i = 0; i < array.size(); i++) {
			for ( int j = 0; j < array.size()  -1; j++) {
				if ( array.get(i) < array.get(j)) {
					/*double temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);*/
					swap(i,j);
				}
			}
		}
		return array;
	}

}
