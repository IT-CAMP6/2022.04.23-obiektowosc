public class Main4 {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3};
        int[] tab2 = {2,3,10};

        MatchUp matchUp = new MatchUp();
        int result = matchUp.matchUp(tab1, tab2);
        System.out.println(result);
    }
}
