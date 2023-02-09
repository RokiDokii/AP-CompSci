public class elephant{

    private double weight;
    private int age;

    public elephant(){
        weight = 0;
        age = 0;
    }
    public elephant(double w, int a){
        weight = w;
        age = a;
    }

    public double loseWeight(){
        weight -= age-1/4.0;
        return weight;
    }
    public void talkingElephant(){
        System.out.println("Hi! I'm a talking Elephant.\n"+"I am "+age+" years old.\nI also weigh "+weight +" lbs.");
    
    }
}

