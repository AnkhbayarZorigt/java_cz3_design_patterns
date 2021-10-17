package cz.sda.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Image {

    private static final Map<String, Image> IMAGES = new HashMap<>();

    private final String image;

    private final int size;

    public static Image get(String image) {
        return IMAGES.get(image);
    }

    public static Image add(String image, int size) {
        return IMAGES.put(image, new Image(image, size));
    }

    public Image(String image, int size) {
        this.image = image;
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public int getSize() {
        return size;
    }
}
