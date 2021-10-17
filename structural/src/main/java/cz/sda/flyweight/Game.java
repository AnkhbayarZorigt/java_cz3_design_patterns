package cz.sda.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private final List<Sprite> sprites;

    public Game() {
        sprites = new ArrayList<>();
    }

    public void add(Sprite sprite) {
        sprites.add(sprite);
    }

    public void run() {
        sprites.forEach(Sprite::draw);
        int memory = sprites.stream()
                .map(Sprite::getImage)
                .collect(Collectors.toSet())
                .stream()
                .map(Image::getSize)
                .reduce(0, Integer::sum);
        System.out.println("Statistics: memory[" + memory + "MB]");
    }
}
