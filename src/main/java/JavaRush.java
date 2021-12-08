

public class JavaRush {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //напишите тут ваш код
        symbols[0] = '\u00A9';
        symbols[1] = '\n004A';
        symbols[2] = '\n0061';
        symbols[3] = '\n0076';
        symbols[4] = '\n0061';
        symbols[5] = '\n0052';
        symbols[6] = '\n0075';
        symbols[7] = '\n0073';
        symbols[8] = '\n0068';
    }
}
