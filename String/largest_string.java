public class largest_string {
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"};
        String largest=fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println(largest);
        //0: equal 
        //<0: -ve str1<str2
        //>0: +ve str1>str2
        //compareTo function check using lexicographically:-
        /*
         * sorted in a way that uses an algorithm based on the alphabetical order used
         *  in dictionaries: The addresses will be lexicographically rather than 
         * numerically ordered.
         */
    }
}
