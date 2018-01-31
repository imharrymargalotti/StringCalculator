/**
 * Created by harrymargalotti on Jan/30/18.
 */
public class HWFunctionsimpl implements HWFunctions {
    public int Add(String numbers){
        int sum=0;
        //------------0 numbers in string----------------------------
        if (numbers.equals("")){
            return sum;
        }
        //------------1 number in string-----------------------------
        else if (numbers.indexOf(',')==-1){
            sum = Integer.parseInt(numbers);
        }
        //------------2 or more numbers------------------------------
        else{
            String[] values = numbers.split(",");
            for (int i = 0; i<values.length; i++){
                int temp = Integer.parseInt(values[i]);
                sum+=temp;
            }
        }//----------------------------------------------------------
        return sum;
    }

}
