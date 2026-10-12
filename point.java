class point {
    int x, y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("X coordinate: " + x);
        System.out.println("Y coordinate: " + y);
    }

    public static void main(String[] args) {
        point p = new point(10, 20);
        p.display();
    }
}
