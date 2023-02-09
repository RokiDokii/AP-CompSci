public class BagOfTricks {

    //Finish this method
    //It should output "HEY!" followed by the message which is passed to it
    public static /*void*/ String shout(String message){
        System.out.println("HEY! " + message);
        return "Hey" + message;
    }

    //Write the 'reciprocate' method here
    //It is static, returns a double, and has a double as a parameter
    //It returns the reciprocal (1/x) of the parameter
    public static double reciprocate(double x){
        return 1/x;
    }


    //Write the 'runningSum' method here
    //It is static, returns an integer, and accepts an integer as a parameter
    //It returns the sum of integers from 0 to the parameter
    public static int runningSum(int y){
        int result = 0;
        for(int i=0; i <= y; i++)
            result += i;
        return result;
    }
    
}