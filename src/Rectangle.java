public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {

        if(height < 0 ){
            System.out.println("you can't add minus height");
            this.height = 0;
        }else{
            this.height = height;
        }

        if(width < 0 ){
            System.out.println("you can't add minus width");
            this.width = 0;
        }else {
            this.width = width;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if(width < 0 ){
            System.out.println("you can't add minus width");
            this.width = 0;
        }else{
            this.width = width;
        }

    }



    @Override
    public double calculateArea(){
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return  (2 * width) + (2 * height);
    }



    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';

    }
}
