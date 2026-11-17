interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {

    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

public class rectangle3{
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);

        System.out.println("Original Rectangle:");
        r.display();

        r.resizeWidth(30);
        r.resizeHeight(40);

        System.out.println("After Resizing:");
        r.display();
    }
}
