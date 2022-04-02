//Audrey Tabler 700718345
//This program tests the Circle2D class


public class Test_Circle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5); //creates new circle object

        //displays results of calculations to user
        System.out.println("Area of this circle is " + c1.getArea() + " Perimeter of this circle is " + c1.getPerimeter());

        //checks if the point 3,3 is within c1
        if ((c1.contains(3, 3)) == true)
            System.out.println("The point (3,3) is contained within this circle");
        else
            System.out.println("The point (3,3) is not contained within this circle");

        //checks if given circle is contained within c1
        if ((c1.contains(new Circle2D(4, 5, 10.5)) == true))
            System.out.println("Circle with radius 10.5 centered at point (4,5) is contained within this circle");
        else
            System.out.println("Circle with radius 10.5 centered at point (4,5) is not contained within this circle");

        if ((c1.contains(new Circle2D(3, 5, 2.3)) == true))
            System.out.println("Circle with radius 2.3 centered at point (3,5) is contained within this circle");
        else
            System.out.println("Circle with radius 2.3 centered at point (3,5) is not contained within this circle");

        //checks if circle overlaps c1
        if (( c1.overlaps(new Circle2D(3, 5, 2.3))) == true)
            System.out.println("Circle with radius 2.3 centered at point (3,5) overlaps this circle");
        else
            System.out.println("Circle with radius 2.3 centered at point (3,5) overlaps this circle");



    }
}
