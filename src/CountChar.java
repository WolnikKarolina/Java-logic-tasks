public class CountChar {
    public int countChar( char x, String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if ( text.charAt(i) == x){
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        CountChar c = new CountChar();
        System.out.println(c.countChar('a', "masakra" ));
    }
}
