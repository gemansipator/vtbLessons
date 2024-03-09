package lesson03.home;

public class MyArrayDataException extends Exception {  //Исключение "в ячейке массива лежит что-то не то"


    public int y;
    public int q;

    MyArrayDataException(int y, int q) {
        this.y = y;
        this.q = q;

    }
}
