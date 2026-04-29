public class ReverseString {
    // odwróc stringa bez StringBuilders
    public String reverse(String text){
        String reverse = "";
        for (int i = 1 ; i <= text.length(); i++) {
            reverse += text.charAt(text.length() - i);
        }
        return reverse;
    }

    static void main(String[] args) {
        ReverseString rev = new ReverseString();
        System.out.println(rev.reverse("marusarzówna"));
    }
}
