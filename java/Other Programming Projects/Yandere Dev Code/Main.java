public class Main{
    public static void main(String[] args) {
    int i = 2001;
    String a = "not";
    while (i <= 3000){
        if ((i % 4 == 0 && i % 100 != 0) || (i % 4 == 0 && i % 400 == 0)){
            a = "is";
        }
        else{
            a = "not";
        }
        System.out.println("else if (year == " + i + "){System.out.println( '"+ i + " " + a + " a leap year' );}");
        i++;
    }
    }
}