package cz.sda.flyweight;

public class Sprite {
    private Image image;
    private int x;
    private int y;

    public Sprite(String image, int x, int y) {
        this.image = Image.get(image);
        this.x = x;
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing: " + image.getImage() + " at [" + x + ", " + y + "]");
    }
}
