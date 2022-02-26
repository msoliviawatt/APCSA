public class RotateArray {
    static void rotate90Clockwise(int a[][])
    {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][a.length - j - 1];
                a[i][a.length - j- 1] = temp;
            }
        }
        System.out.println();

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void counterClock(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
   
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][m.length - j - 1];
                m[i][m.length - j- 1] = temp;
            }
        }

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
   
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][m.length - j - 1];
                m[i][m.length - j- 1] = temp;
            }
        }

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
   
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][m.length - j - 1];
                m[i][m.length - j- 1] = temp;
            }
        }

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]arg) {
        int[][] x = new int[4][4];
        int c = 0;
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[0].length; j++){
                x[i][j] = c + 1;
                c++;
            }
        }

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        rotate90Clockwise(x);
        rotate90Clockwise(x);

        counterClock(x);
        counterClock(x);
    }
}
