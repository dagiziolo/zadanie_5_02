public class LineMethod {

    double length (Line line1) {
        double xtmp = Math.pow(line1.endPoint.getX() - line1.startPoint.getX(),2);
        double ytmp = Math.pow(line1.endPoint.getY() - line1.startPoint.getY(),2);
        double len = Math.pow(xtmp + ytmp,0.5);
        return len;
    }


}
