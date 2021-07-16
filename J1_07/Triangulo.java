import java.lang.Math;

public class Triangulo {
    double x1, x2, x3;
    double y1, y2, y3;
    double perimetro = 0;

    public double DistanciaTotal(double d1, double d2){
        double d = Math.sqrt((Math.pow(d1, 2) + Math.pow(d2, 2)));
        return d;
    }

    public void CalculaPerimetro(){
        double dx1_x2 = Math.abs(this.x1 - this.x2);
        double dy1_y2 = Math.abs(this.y1 - this.y2);

        double dp1_p2 = DistanciaTotal(dx1_x2, dy1_y2);

        double dx1_x3 = Math.abs(this.x1 - this.x3);
        double dy1_y3 = Math.abs(this.y1 - this.y3);

        double dp1_p3 = DistanciaTotal(dx1_x3, dy1_y3);

        double dx2_x3 = Math.abs(this.x2 - this.x3);
        double dy2_y3 = Math.abs(this.y2 - this.y3);

        double dp2_p3 = DistanciaTotal(dx2_x3, dy2_y3);

        this.perimetro = dp1_p2 + dp2_p3 + dp1_p3;
    }
}
