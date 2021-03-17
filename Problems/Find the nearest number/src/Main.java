import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        String[] temp = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        for (String s : temp) {
            lst.add(Integer.parseInt(s));
        }
        Collections.sort(lst);
        ArrayList<Integer> distance = new ArrayList<>(lst.size());
        for (Integer i : lst) {
            distance.add(Math.abs(n - i));
        }
        int minDist = Collections.min(distance);
        for (int i = 0; i < distance.size(); i++) {
            if (distance.get(i) == minDist) {
                System.out.print(lst.get(i) + " ");
            }
        }
    }
}