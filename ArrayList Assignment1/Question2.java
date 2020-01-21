import java.util.ArrayList;

class Question2 {

    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int minIndex = -1;
        for ( int i = 0; i < nums.size(); i++ ) {
            if ( minIndex == -1 || nums.get(i) < nums.get(minIndex) ) {
                minIndex = i;
            }
        }

        if ( minIndex != -1 ) nums.remove(minIndex);       
    }

    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }

        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }

}
