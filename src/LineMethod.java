public class LineMethod {

    double length (Line line1) {
        double xtmp = Math.pow(line1.getEndPoint().getX() - line1.getStartPoint().getX(),2);
        double ytmp = Math.pow(line1.getEndPoint().getY() - line1.getStartPoint().getY(),2);
        double len = Math.pow(xtmp + ytmp,0.5);
        return len;
    }

    Line isLonger (Line line1, Line line2){
        double len1 = length(line1);
        double len2 = length(line2);
        Line tmpLine = line1;
        if (len1>len2) {
            System.out.println("Dłuższym odcinkiem jest odcinek pierwszy.");
            tmpLine = line1;
        } else if (len1<len2) {
            System.out.println("Dłuższym odcinkiem jest odcinek drugi.");
            tmpLine = line2;
        } else {
            System.out.println("Odcinki są równe. Jeden z nich");
            tmpLine = line1;}
        return tmpLine;
    }

}
