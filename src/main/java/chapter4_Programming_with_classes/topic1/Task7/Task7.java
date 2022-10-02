package chapter4_Programming_with_classes.topic1.Task7;

public class Task7 {
    public static void main(String[] args) throws Exception {

        int x1 = (int) (0 + Math.random()*50);
        int y1 = (int) (0 + Math.random()*50);
        int x2 = (int) (0 + Math.random()*50);
        int y2 = (int) (0 + Math.random()*50);
        int x3 = (int) (0 + Math.random()*50);
        int y3 = (int) (0 + Math.random()*50);
        System.out.println("your triangle: " );
        System.out.println("point 1: [ " + x1 + ", " + y1 + " ]" );
        System.out.println("point 2: [ " + x2 + ", " + y2 + " ]" );
        System.out.println("point 3: [ " + x3 + ", " + y3 + " ]" );

        findPerimetr(x1,x2,x3,y1,y2,y3);

        findPointOfMedianIntersection(x1,x2,x3,y1,y2,y3);

    }

    private static void findPointOfMedianIntersection(int x1, int x2, int x3, int y1, int y2, int y3) {
//        представим что треугольник ABC, найдем середины BC. Точка M пресечения медиан делит её (медиану) в отношении 1:2

        double xA1 = (x2+x3)/2;
        double yA1 = (y2+y3)/2;

        double xM = (1*x1+2*xA1)/3;
        double yM = (1*y1+2*yA1)/3;

        System.out.println("Point of median intersection" + "[ " + xM + ", " + yM + " ]");

    }

    private static double findPerimetr (int x1, int y1,int x2,int y2,int x3,int y3){
//  сторона треугольника = √((х1 - х2)² + (у1 - у2)²)
        double xy12 = Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5);
        double xy13 = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), 0.5);
        double xy23 = Math.pow(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2), 0.5);
        double perimetr = xy12 + xy13 + xy23;
        System.out.println("Perimetr = " + perimetr);
        findSquare(xy12, xy13, xy23, perimetr);
        return perimetr;
    }

    private static void findSquare(double xy12, double xy13, double xy23, double perimetr) {
        //  (square) S = (p(p-a)(p-b)(p-c))^0.5, p = Perimetr/2
        double polyPerimetr = perimetr/2;
        double square = Math.pow((polyPerimetr)*(polyPerimetr-xy12)*(polyPerimetr-xy13)*(polyPerimetr-xy23) , 0.5);
        System.out.println("Square = " + square);
    }



}
