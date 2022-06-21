public class Quadrado {
    public static double area(double lado){
        if(lado > 0){
            double area= (lado * lado);
            return area;
        }else{
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
    }
}
