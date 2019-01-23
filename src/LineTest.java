import java.util.Locale;
import java.util.Scanner;

public class LineTest {
    public static void main(String[] args) {

        //wczytywanie
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Podaj dane do punktu początkowego dla pierwszego odcinka.");
        System.out.println("Podaj x_p1 - pierwszą współrzędną punktu startowego:");
        double xStart1 = scan.nextDouble();
        System.out.println("Podaj y_p1 - drugą współrzędną punktu startowego:");
        double yStart1 = scan.nextDouble();
        Point startPoint1 = new Point(xStart1, yStart1);
        System.out.println("Podaj x_k1 - pierwszą współrzędną punktu końcowego:");
        double xEnd1 = scan.nextDouble();
        System.out.println("Podaj y_k1 - drugą współrzędną punktu końcowego:");
        double yEnd1 = scan.nextDouble();
        Point endPoint1 = new Point(xEnd1, yEnd1);

        System.out.println("Podaj dane do punktu początkowego dla drugiego odcinka.");
        System.out.println("Podaj x_p2 - pierwszą współrzędną drugiego punktu startowego:");
        double xStart2 = scan.nextDouble();
        System.out.println("Podaj y_p2 - drugą współrzędną drugiego punktu startowego:");
        double yStart2 = scan.nextDouble();
        Point startPoint2 = new Point(xStart2, yStart2);
        System.out.println("Podaj x_k2 - pierwszą współrzędną drugiego punktu końcowego:");
        double xEnd2 = scan.nextDouble();
        System.out.println("Podaj y_k2 - drugą współrzędną drugiego punktu końcowego:");
        double yEnd2 = scan.nextDouble();
        Point endPoint2 = new Point(xEnd2, yEnd2);

        Line line1 = new Line(startPoint1, endPoint1);
        Line line2 = new Line(startPoint2, endPoint2);
        LineMethod method = new LineMethod();
        Line longerLine = method.isLonger(line1, line2);
        double len = method.length(longerLine);
        System.out.println("("+longerLine.getStartPoint().getX()+", "+longerLine.getStartPoint().getY()+")");
        System.out.println("("+longerLine.getEndPoint().getX()+", "+longerLine.getEndPoint().getY()+")");
        System.out.println(len);

        }
}