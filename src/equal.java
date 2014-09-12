/**
 * Created by Николай on 11.09.2014.
 */
public class equal {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 1.0;
        double c = 3.0;
        double d = b*b - 4*a*c;
        if(d<0){
            System.out.println("вещественных корней нет");
        } else {
            if (d > 0) {
                double x1 = (Math.sqrt(d) - b) / (2 * a);
                double x2 = -(Math.sqrt(d) + b) / (2 * a);
                System.out.println("первый корень x1 = " + x1 + ", второй корень x2 = " + x2);
            } else {
                if (d == 0.0) {
                    double x = (-b) / (2 * a);
                    System.out.println("корень x = " + x);
                }
            }
        }
    }
}
