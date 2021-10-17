package cz.sda.flyweight;

public class Main {
    public static void main(String[] args) {
        var game = new Game();
        Image.add("bullet", 10);
        Image.add("tree", 15);
        Image.add("player", 25);

        game.add(new Sprite("bullet", 1, 2));
        game.add(new Sprite("bullet", 5, 2));
        game.add(new Sprite("bullet", 8, 2));
        game.add(new Sprite("bullet", 9, 2));
        game.add(new Sprite("tree", 15, 2));
        game.add(new Sprite("tree", 20, 2));
        game.add(new Sprite("tree", 25, 2));
        game.add(new Sprite("tree", 30, 2));
        game.add(new Sprite("tree", 35, 2));
        game.add(new Sprite("tree", 40, 2));
        game.add(new Sprite("player", 7, 2));
        game.run();
    }
}
