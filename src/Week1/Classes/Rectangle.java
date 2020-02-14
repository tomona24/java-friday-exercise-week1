package Week1.Classes;

public class Rectangle {
    private int width = 1;
    private int height = 1;
    private String color = "Blue";

    // constructor 1 (width, height)
    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    // getter
    public int getWidth() { return this.width; }
    public int getHeight() { return this.height; }
    public String getColor() { return this.color; }

    // setter
    private void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    private void setHeight(int height) {
        if (height > 0) {
        this.height = height;
    }
    }

    private void setColor(String color) {
        if (color.length() > 2 && color.length() < 20) {
            this.color = color.substring(0, 1).toUpperCase() + color.substring(1);
        }
    }

    // methods

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++){
                System.out.print(getColor().charAt(0));
            }
            System.out.println();
        }
    }

}
