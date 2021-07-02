import java.util.ArrayList;

public class ShuttleSort extends Algo{
	ShuttleSort(ArrayList<Double> array){
		 super(array);
	 }
	@Override
	 public ArrayList <Double> ReturnArray(){
		for(int i = 1; i < array.size(); i++) {
			if(array.get(i) < array.get(i-1)) {				
				swap(i,i-1);
			}
			for(int j = i-1; (j-1) >= 0; j--) {
				if(array.get(j) < array.get(j-1)) {
					swap(j,j-1);
				}else {
					break;
				}
			}
		}
		return array;
	}
}
