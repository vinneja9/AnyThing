package School.ch2024FirstDataStructure.Matrix;

public class Matrix {
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        a = new int[m][n];

    }

    public Matrix set(int x, int y, int value) {
        this.a[x][y] = value;
        return this;
    }

    public int get(int x, int y) {
        return a[x][y];
    }

    public Matrix transpose() {
        Matrix mat = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat.a[i][j] = a[j][i];
            }
        }
        return mat;
    }

    public void display() {
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", this.a[i][j]);
            }
            System.out.println();
        }
    }

    private int[][] a;
    private int m;
    private int n;

}
