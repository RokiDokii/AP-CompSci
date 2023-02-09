public class Main{
    public static void main(String[] args) {
        System.out.println(hasRepeat("spoon"));
        System.out.println(hasRepeat("avocado"));
    }
    public static boolean hasRepeat(String x){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWZ";
        x = x.toUpperCase();
        for (int i = 0; i < x.length()-1; i++){
            if (letters.indexOf(x.charAt(i)) == letters.indexOf(x.charAt(i+1))){
                return true;
            }
        }
        return false;        
    }
}