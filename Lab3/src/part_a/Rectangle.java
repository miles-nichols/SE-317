package part_a;

import java.awt.Point;

public class Rectangle {

    private Point origin;
    private Point opposite;

    public Rectangle(Point origin, Point oppositeCorner) {
        this.origin = origin;
        setOppositeCorner(oppositeCorner);
    }

    public Rectangle(Point origin) {
        this.opposite = this.origin = origin;
    }

    public int area() {
        return Math.abs(origin.x - opposite.x) * Math.abs(origin.y - opposite.y);
    }

    public void setOppositeCorner(Point opposite) {
        // Adjust the opposite corner to ensure sides do not exceed 100 units
        int adjustedX = adjustCoordinate(opposite.x, origin.x);
        int adjustedY = adjustCoordinate(opposite.y, origin.y);
        this.opposite = new Point(adjustedX, adjustedY);
    }

    private int adjustCoordinate(int value, int origin) {
        int delta = value - origin;
        if (Math.abs(delta) > 100) {
            return origin + (delta > 0 ? 100 : -100);
        }
        return value;
    }

    public Point origin() {
        return origin;
    }

    public Point opposite() {
        return opposite;
    }

    @Override
    public String toString() {
        return "Rectangle(origin " + origin + " opposite " + opposite + ")";
    }
}
