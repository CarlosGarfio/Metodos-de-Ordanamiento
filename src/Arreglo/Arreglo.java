package Arreglo;

public class Arreglo {

    private int[] array;
    private int ren, col;
    private int data;
    
    public Arreglo(int ren, int col) {
        this.ren = ren;
        this.col = col;
        this.array = new int[ren * col];
    }
    
    public static long Insercion(){
        System.currentTimeMillis();
        return 0L;
    }
    
    public void fill(int n, int m) {
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                array[(ren * i) + j] = (int) Math.abs(Math.floor(Math.random() * (n - m + 1) + m));
            }
        }
    }
    
    public void print() {
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[(ren * i) + j] + "\t");
            }
            System.out.println("");
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getRen() {
        return ren;
    }

    public void setRen(int ren) {
        this.ren = ren;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
