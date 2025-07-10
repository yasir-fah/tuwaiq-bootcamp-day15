public class Circle extends Shape{

    private double radius;


    public Circle(double radius) {

        if(radius < 0 ){
            System.out.println("you can't add minus radius");
            this.radius = 0;
        }else {
            this.radius = radius;
        }

    }



    public double getRadius() {
        return radius;
    }



    public void setRadius(double radius) {

        if(radius < 0 ){
            System.out.println("you can't add minus radius");
            this.radius = 0;
        }else {
            this.radius = radius;
        }

    }



    @Override
    public double calculateArea(){
        return (radius * radius) * Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return (2 * Math.PI * radius);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
