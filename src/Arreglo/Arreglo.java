package Arreglo;

public class Arreglo {

    private static int[] array;
    private static int ren, col;
    private static int data;
    
    public Arreglo(int ren, int col) {
        this.ren = ren;
        this.col = col;
        this.array = new int[ren * col];
    }
    
    public static long Insercion(){
        int pos,aux;
        for (int i = 0; i < array.length; i++) {
            pos = i;
            aux=array[i];
            while ((pos > 0) && (array[pos-1] > aux)) {
                array[pos]= array[pos-1];
                pos--;
            }
            array[pos]=aux;
        }
        return System.currentTimeMillis();
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
