package mmf.piskunou.mastermind.lettered;

import mmf.piskunou.mastermind.ColorFactory;
import mmf.piskunou.mastermind.Color;

public class LetteredColorFactory implements ColorFactory {

    private static final String letters = "0123456789ABCDEFGHIJKLMNOPQRSTVWXYZabcdefghijklmnopqrstvwxzy";
    private int counter = 0;

    @Override
    public Color newColor() {
        Color color = new LetteredColor(letters.substring(counter, counter + 1));
        counter++;
        return color;
    }
}
