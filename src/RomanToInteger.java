public class RomanToInteger {
    public int romanToInt(String s) {
    int y = 0;

        for (int i = 0; i < s.length(); i++) {
            int z = getValue(s.charAt(i));
            if (i < s.length() - 1) {
                int next = getValue(s.charAt(i + 1));
                if (z < next) {
                    y -= z;
                    continue;
                }
            }
            y += z;
        }
         return y;

    }
    private int getValue(char c){
        return switch(c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> throw new IllegalArgumentException("Zły znak: " + c);
        };
    }
}
