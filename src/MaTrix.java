import java.util.Random;

public class MaTrix {
    int n;
    int[][] matrixA, matrixB;

    public MaTrix(int n){
        this.n = n;
        matrixA = new int[n][n];
        matrixB = new int[n][n];
        initValue();
    }

    public void initValue(){
        Random random = new Random();
        for(int i = 0; i<n; i++){
             for(int j = 0; j<n; j++){
                  matrixA[i][j] = random.nextInt(10);
                  matrixB[i][j] = random.nextInt(10);
             }
         }
    }

    public void printMatrix(int[][] maTrix ){
        System.out.println("MatrixA"+"-------------------------");
        for(int i = 0; i<maTrix.length; i++){
            for(int j = 0; j<maTrix[i].length; j++){
                System.out.print(maTrix[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("MaTrixB"+"-------------------------");
    }


    public void printMatrixA(){
        printMatrix(matrixA);
    }

    public void printMatrixB(){
        printMatrix(matrixB);
    }

    public int[][] sumMaTrix(){
        int[][] matrixSum = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixSum;
    }

    public int[][] multMaTrix(){
        int[][] matrixResoult = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrixResoult[i][j] = 0;
                for(int k = 0; k<n; k++){
                    matrixResoult[i][j]+= (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return matrixResoult;
    }

    public static void main(String[] args) {
        MaTrix m = new MaTrix(5);
        m.printMatrixA();
        m.printMatrixB();
        System.out.println("A + B = ");
        m.printMatrix(m.sumMaTrix());
        System.out.println("A * B = ");
        m.printMatrix(m.multMaTrix());
    }
}
