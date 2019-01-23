public class LineMethod {

    double length (Line line1) {
        double xtmp = Math.pow(line1.getEndPoint().getX() - line1.getStartPoint().getX(),2);
        double ytmp = Math.pow(line1.getEndPoint().getY() - line1.getStartPoint().getY(),2);
        double len = Math.pow(xtmp + ytmp,0.5);
        return len;
    }


}
