public class Numbers {
    public static void main(String[] args) {
        int n=10;
        int k=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%5d",k);
                k++;
            }
            System.out.println();
            
        }
    }
}
