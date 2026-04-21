import java.util.ArrayList;
import java.util.List;
// sprawdź czy liczba x jest palindromem
public class PalindromeNumbers {
    public boolean isPalindrome(int x) {
        boolean theSame = false;
       String y = String.valueOf(x);
       String z = new StringBuilder(y).reverse().toString();
       if (y.equals(z)){
           theSame = true;
       }
        return theSame;
    }

    // nie używając Stringa

    public boolean isPalindrome2(int x) {
        if ( x < 0){
            return false;
        }
        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
    // Krok po kroku
    //
    //Start: 54321
    //
    //54321 % 10 = 1
    //→ ostatnia cyfra
    //54321 / 10 = 5432
    //5432 % 10 = 2
    //→ kolejna cyfra
    //5432 / 10 = 543
    //543 % 10 = 3
    //543 / 10 = 54
    //54 % 10 = 4
    //54 / 10 = 5
    //5 % 10 = 5
    //5 / 10 = 0 → stop

}
