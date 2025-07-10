public class Main {
    public static void main(String[] args) {

        /// Circle object:
        System.out.println("========== circle ==========");
        Circle circle = new Circle(5);

        //1- calculate area:
        System.out.println("area: "+circle.calculateArea()); // 78.53

        //2- calculate perimeter:
        System.out.println("perimeter: "+circle.calculateCircumference()); // 31.41

        //3- setter:
        circle.setRadius(8);

        //4- getter:
        System.out.println("get radius after change it: "+circle.getRadius()); // 8






        /// Rectangle object:
        System.out.println("========== rectangle ==========");
        Rectangle rectangle = new Rectangle(5,10);

        //1- calculate area:
        System.out.println("area: "+rectangle.calculateArea()); // 50

        //2- calculate perimeter:
        System.out.println("perimeter: "+rectangle.calculateCircumference()); // 30

        //3- setter:
        rectangle.setHeight(4);
        rectangle.setWidth(4);

        //4- getter:
        System.out.println("get height after change it: "+rectangle.getHeight()); // 4
        System.out.println("get width after change it: "+ rectangle.getWidth()); // 4






        /// Rectangle object:
        System.out.println("========== triangle ==========");
        Triangle triangle = new Triangle(3,9);

        //1- calculate area:
        System.out.println("area: "+triangle.calculateArea()); // 13.5

        //2- calculate perimeter:
        System.out.println("perimeter: "+triangle.calculateCircumference()); // 21.48

        //3- setter:
        triangle.setHeight(6);
        triangle.setBase(6);

        //4- getter:
        System.out.println("get height after change it: "+triangle.getHeight()); // 6
        System.out.println("get width after change it: "+ triangle.getBase()); //  6






    }
}