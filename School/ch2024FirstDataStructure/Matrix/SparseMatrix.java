package School.ch2024FirstDataStructure.Matrix;

public class SparseMatrix {

    public class Triple {
        int row;
        int col;
        int value;

        public Triple() {
            row = col = value = 0;
        }

        public Triple(int r, int c, int v) {
            row = r;
            col = c;
            value = v;
        }
    }

    private int nRows, nCols;
    private List<Triple> a;

    public SparseMatrix(int rows, int cols, int terms) {
        nRows = rows;
        nCols = cols;
        a = new ArrayList<Triple>(terms);
    }

    public void display() {
        System.out.println("Number of rows : " + nRows);
        System.out.println("Number of cols : " + nCols);
        System.out.println("Number of Non-zero terms : " + a.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.println("[" + i + "]" + a.get(i).row + " " + a.get(i).col + " " + a.get(i).value + " ");
        }
    }

    public void storeTriple(int r, int c, int v) {
        a.add(new Triple(r, c, v));
    }

    public SparseMatrix tSparseposeS() {
        int nTerm = a.size();
        SparseMatrix m = new SparseMatrix(nCols, nRows, nTerm);
        m.nCols = this.nRows;
        m.nRows = this.nCols;
        if (nTerm > 0) {
            for (int p = 0; p < nRows; p++) {
                for (int i = 0; i < nTerm; i++) {
                    if (a.get(i).col == p) {
                        Triple t = a.get(i);
                        m.storeTriple(t.col, t.row, t.value);
                    }
                }
            }
        }
        return m;
    }

    public SparseMatrix tSparseposeS2() {
        int[] rowTerms = new int[nCols];
        int[] rowBegins = new int[nCols];

        int nTerms = a.size();
        SparseMatrix m = new SparseMatrix(nCols, nRows, nTerms);
        if (nTerms > 0) {
            int i;
            for (i = 0; i < nCols; i++) {
                rowTerms[i] = 0;
            }
            for (i = 0; i < nTerms; i++) {
                rowTerms[a.get(i).col]++;
            }

            rowBegins[0] = 0;
            for (i = 1; i < nCols; i++) {
                rowBegins[i] = rowBegins[i - 1] + rowTerms[i - 1];
            }

            for (i = 0; i < nTerms; i++) {
                m.a.add(null);
            }

            for (i = 0; i < nTerms; i++) {
                Triple t = a.get(i);
                int no = rowBegins[t.col]++;
                m.a.set(no, new Triple(t.col, t.row, t.value));
            }

        }
        return m;
    }
}