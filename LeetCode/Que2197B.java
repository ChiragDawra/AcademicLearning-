import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            boolean possible = true;
            Map<Integer, Integer> first = new HashMap<>();
            Map<Integer, Integer> last = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!first.containsKey(a[i])) {
                    first.put(a[i], i);
                }
                last.put(a[i], i);
            }
            for (int value : first.keySet()) {
                int l = first.get(value);
                int r = last.get(value);
                for (int i = l; i <= r; i++) {
                    if (a[i] != value) {
                        possible = false;
                        break;
                    }
                }
                if (!possible) break;
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}