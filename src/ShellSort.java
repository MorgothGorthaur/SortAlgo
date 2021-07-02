import java.util.ArrayList;

public class ShellSort extends Algo{
	ShellSort(ArrayList<Double> array){
		 super(array);
	 }
	 @Override
	 public ArrayList <Double> ReturnArray(){
		 int gap  = array.size()/2;
		 while(gap >= 1) {
			 for(int i = 0; i < array.size(); i ++) {
				 for(int j = i - gap; j>=0; j -= gap ) {
					 if(array.get(j) > array.get(j+gap)) {
						 swap(j,j+gap);
					 }
				 }
			 }
			 gap /=2;
		 }
		 return array;
	 }
}
