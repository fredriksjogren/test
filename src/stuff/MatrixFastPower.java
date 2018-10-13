package stuff;



class MatrixFastPower {

    public static Matrix FastPower(Matrix matrix, int k) throws RuntimeException {

        if(matrix.getColumns() != matrix.getRows())
            throw new RuntimeException("Matrix is not square Matrix.");

        int[][] newData = new int[matrix.getColumns()][matrix.getRows()];

        for(int i = 0; i < matrix.getColumns(); i++)
            newData[i][i] = 1;

        Matrix newMatrix = new Matrix(newData),
                coMatrix = new Matrix(matrix.data);

        while(k != 0) {

            if((k & 1) != 0)
                newMatrix = newMatrix.multiply(coMatrix);

            k >>= 1;
            coMatrix = coMatrix.multiply(coMatrix);

        }

        return newMatrix;
    }

    public static void main(String[] argv) {

        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(data);

        System.out.println("original matrix : ");
        System.out.println(matrix.toString());

        matrix = MatrixFastPower.FastPower(matrix, 5);

        System.out.println("after power : ");
        System.out.println(matrix.toString());

        matrix = MatrixFastPower.FastPower(matrix, 1000000);

        System.out.println("notice, large power may cause overflow : ");
        System.out.print(matrix.toString());
        System.out.println("you can use mod to fix that :-) ");

    }
}
class Matrix {
    public int[][] data;


    public Matrix(int[][] pData) {


        if(pData.length != 0) {
            int[][] newData = new int[pData.length][pData[0].length];

            for(int i = 0; i < pData.length; i++)
                for(int j = 0; j < pData[0].length; j++)
                    newData[i][j] = pData[i][j];

            this.data = newData;
        } else {
            this.data = null;
        }
    }


    public int getElement(int x, int y) {
        return data[x][y];
    }


    public int getRows() {
        if(this.data == null)
            return 0;

        return data.length;
    }


    public int getColumns() {
        if(this.data == null)
            return 0;

        return data[0].length;
    }



    public Matrix multiply(Matrix other) throws RuntimeException {

        int[][] newData = new int[this.data.length][other.getColumns()];

        if(this.getColumns() != other.getRows())
            throw new RuntimeException("The two matrices cannot be multiplied.");

        int sum;

        for (int i = 0; i < this.getRows(); ++i)
            for(int j = 0; j < other.getColumns(); ++j) {
                sum = 0;

                for(int k = 0; k < this.getColumns(); ++k) {
                    sum += this.data[i][k] * other.getElement(k, j);
                }

                newData[i][j] = sum;
            }

        return new Matrix(newData);
    }

    
    public String toString() {
        String str = "";

        for(int i = 0; i < this.data.length; i++) {
            str += "[ ";

            for(int j = 0; j < this.data[0].length; j++) {
                str += data[i][j];
                str += " ";
            }

            str += "]";
            str += "\n";
        }

        return str;
    }

}
