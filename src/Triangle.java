public class Triangle extends Shape{

    private double height;
    private double base ;

    public Triangle(double base, double height) {

        if(base < 0 ){
            System.out.println("you can't add minus base");
            this.base = 0;
        }else{
            this.base = base;
        }

        if(height < 0 ){
            System.out.println("you can't add minus height");
            this.height = 0;
        }else{
            this.height = height;
        }

    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if(height < 0 ){
            System.out.println("you can't add minus height");
            this.height = 0;
        }else{
            this.height = height;
        }

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base < 0 ){
            System.out.println("you can't add minus base");
            this.base = 0;
        }else{
            this.base = base;
        }
    }


    @Override
    public double calculateArea(){
        return (0.5 * base * height) ;
    }

    @Override
    public double calculateCircumference() {
        double third = Math.sqrt(base * base + height * height);

        return base + height + third;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
