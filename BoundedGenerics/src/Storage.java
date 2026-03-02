import java.util.ArrayList;

public class Storage <T extends hasId>  {

    private ArrayList<T> mainList;  // list declaration


    public Storage(T thing){
        validate(thing);
        mainList = new ArrayList<>(); // list initialization
        mainList.add(thing);
    }

    //validate thing for null value
    private T validate(T thing){
        if(thing!=null){
            return thing;
        }
        return null; //we will change that later
    }

    // Lists Methods
    public ArrayList getWholeList(){
        return mainList;
    }
    public void add(T other){
        mainList.add(other);
    }

    public T getByIndex(int x){
        System.out.println(mainList.get(x));
        return mainList.get(x);
    }

    public int size(){
       return mainList.size();
    }

    //Interface method implementation
        @Override
        public int getId(){

            return 0;
        }


}
