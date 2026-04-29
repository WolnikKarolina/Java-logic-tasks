public class PalindormeString {
    public boolean palindrome(String text){
        for (int i = 0; i < text.length()/2; i++) {
            if ( text.charAt(i) != text.charAt(text.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        PalindormeString pal = new PalindormeString();
        System.out.println(pal.palindrome("kajak"));
        System.out.println(pal.palindrome("krzesło"));
        System.out.println(pal.palindrome(""));
    }
}
