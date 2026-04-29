import java.util.Arrays;

public class Even {


    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public String palindorme(String text){
        String[] tab = text.split("");
        String reverse = "";
        for (int i = 0 ; i < tab.length; i++) {
            reverse += tab[tab.length - i - 1];
        }
        return reverse;
    }

    public static void main() {
        Even e = new Even();
        System.out.println(e.isEven(4));
    }

}
