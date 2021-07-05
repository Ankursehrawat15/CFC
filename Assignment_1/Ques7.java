
public class Ques7 {

    public static boolean checkSquares(int[] arr1, int[] arr2) {

        for (int elem : arr1) {
            int count = 0;
            int num = elem * elem;
            for (int sq : arr2) {
                if (sq == num) {
                    count++;
                }
            }

            if (count == 0) {
                return false;
            }
        }

        return true;
    }

    public static void pattern7f(int n) {
        int id = 1, nst = 1, nsp = n - 1;
        while (id <= 2 * n) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("   ");
                csp++;
            }

            int cst = 1;
            while (cst <= nst) {
                System.out.print(" * ");
                cst++;
            }
            System.out.println();

            if (id < n) {
                nst = nst + 2;
                nsp--;
                id++;
            } else {

                nst = nst - 2;
                nsp++;
                id++;
            }

        }
    }

    public static void pattern7d(int n) {
        int id = 1, nst = 1, nsp = n - 1;
        while (id <= n) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("    ");
                csp++;
            }

            int cst = 1;
            int num = id;
            while (cst <= nst / 2 + 1) {

                System.out.print("  " + num + " ");
                cst++;
                num++;
            }

            int h = 1;
            while (h <= cst - 2) {
                System.out.print("  " + (num - 2) + " ");
                num--;
                h++;
            }

            System.out.println();

            nsp--;
            nst = nst + 2;
            id++;
        }
    }

    public static void pattern7c(int n) {
        int id = 1, nst = 1, nsp = n - 1;
        while (id <= n) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("   ");
                csp++;
            }

            int cst = 1;

            while (cst <= nst / 2 + 1) {
                System.out.print(" " + cst + " ");
                cst++;
            }

            cst = nst / 2;
            while (cst != 0) {
                System.out.print(" " + cst + " ");
                cst--;
            }

            System.out.println();
            nst = nst + 2;
            nsp--;
            id++;
        }
    }

    public static void pattern7b(int n) {
        int id = 1, nst = 1;
        while (id <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print(cst + "  ");
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }

    public static void pattern7a(int n) {
        int id = 1, nst = 1;
        while (id <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*   ");
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }

    public static void main(String[] args) {
        // pattern7a(5);
        // pattern7b(5);
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 16, 15, 1, 9 };
        System.out.println(checkSquares(arr1, arr2));
    }
}
