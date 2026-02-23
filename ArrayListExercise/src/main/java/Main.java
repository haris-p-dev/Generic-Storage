import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> nums = new ArrayList<Integer>(List.of(8, 3, 29, 1, 0, 6, 10, 11));
//        ArrayList<Integer> even = new ArrayList<>();
//
//        minMax(nums);

        ArrayList<String> words = new ArrayList<>(List.of
                ("java", "python", "java", "c", "java", "python") );

        wordCount(words);
    }

    public static int wordCount(ArrayList<String> list){
        String x = list.get(0);
        int counter=0;
        for(int i=0; i<list.size();i++){
            if(list.get(i).equals(x)){
                counter++;
                
            }

        }
        System.out.println(counter);
        return counter;
    }

    public static void minMax(ArrayList<Integer> list){
        int min=list.get(0);
        int max=list.get(0);

        for(int i=1; i<list.size(); i++){
            if(list.get(i)<min){
                min=list.get(i);
            }else if (list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static int min(ArrayList<Integer> list) {
        int mini = list.get(0);
        for(int i=1; i< list.size()-1 ;i++){
            if (list.get(i) < mini) {
                mini = list.get(i);
            }}
        return mini;
    }

    public static int max(ArrayList<Integer> list) {

        int maxi = list.get(0);
        for(int i=1; i<list.size(); i++){
            if (maxi < list.get(i)) {
                maxi = list.get(i);
            }
        }
        return maxi;
    }
    }
