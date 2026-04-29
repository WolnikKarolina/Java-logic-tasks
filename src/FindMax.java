public class FindMax {
    public int findMax(int[] tab){
        if ( tab.length == 0){
            System.out.println("Tablica jest pusta");
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i : tab) {
            if ( i > max){
                max = i;
            }
        }
        return max;
    }

    static void main(String[] args) {
        FindMax find = new FindMax();
        int[] tab = {4, 7, 2 , 1, 0};
        System.out.println(find.findMax(tab));
    }
}
