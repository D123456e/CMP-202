public class physics{
    float calculateVelocity (float distance, int time){
        return distance/time;
    }
    float calculateVelocity (float initialVelocity, float initialVelocity, float accelartion, int time){
        return initialVelocity + (accelartion*time);
    }
    public static void main( String []args){
        Physics calculate = new Physics(); 
        System.out.printIn(calculate.calculateVelocity(45, 14));
        System.out.printIn(calculate.calculateVelocity(25, 15, 40))
    }
}