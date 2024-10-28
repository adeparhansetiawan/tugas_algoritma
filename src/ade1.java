
public class ade1 {
    public static void main(String[] args)

    {
        for (int i = 1; i <= 3; i++) {
            if (i != 2) {
                for (int j = 1; j <= 6; j++) {
                    int a = j % 2;
                    if (a == 1) {
                        System.out.print("s ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.print("");
            } else {
                for (int j = 1; j <= 6; j++) {
                    int a = j % 2;
                    if (a == 1) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("s");
                    }
                }
                System.out.println("");

            }
        }
    }
}