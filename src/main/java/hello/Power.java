package hello;

public class Power {
    int number;
    int power;
    Power(int number, int power){
        this.number = number;
        this.power = power;
    }
    public int getResult(){
        return (int)Math.pow(number, power);
    }
}
