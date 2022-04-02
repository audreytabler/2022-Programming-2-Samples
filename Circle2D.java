//Audrey Tabler 700718345
//This is a class that allows for the creation of Circle2D objects

class Circle2D {
    //initialize variables
    private double x;
    private double y;
    private double radius;

    public Circle2D(){ //no arg constructor
        x = 0;
        y = 0;
        radius = 1;
    }
    public Circle2D(double x, double y, double radius){ //arg constructor
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //get methods
    public double getX(){return x;}
    public double getY(){return y;}
    public double getRadius() {return radius;}
    public double getArea() {return (Math.pow(getRadius(),2) * Math.PI);}
    public double getPerimeter() {return ( 2*Math.PI*getRadius() );}

    //returns value for distance between center points of circles
    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    // returns true if circle centered around given values is contained within this circle
    public boolean contains(double x, double y){
        if (distance(getX(),getY(), x,y) <= getRadius())
            return true;
        else
            return false;
    }

    // returns true if given circle object is within this circle object
    public boolean contains(Circle2D circle){
        if ((distance(getX(),getY(), circle.getX(),circle.getY()) + circle.radius) <= (radius))
            return true;
        else
            return false;
    }

    //returns true if given circle & this circle overlap
    public boolean overlaps(Circle2D circle){
        if (distance(getX(),getY(), circle.getX(),circle.getY()) <= (radius + circle.radius))
            return true;
        else
            return false;
    }
}
