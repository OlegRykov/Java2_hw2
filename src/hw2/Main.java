package hw2;

public class Main {
    static int x;
    static int y;
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            diArr(arr);
            System.out.println(sumDiArr(arr));
        }catch (MyArraySizeException s){
            System.out.println("Размер двумерного массива должен быть 4х4.");
        }catch (NumberFormatException n){
           try {
               throw new MyArrayDataException("Невозможно перевести строку в число в: " + y +" строке, "
                       + x + " элементе.");
           }catch (MyArrayDataException d) {
               System.out.println("Невозможно перевести строку в число в: " + y +" строке, "
                       + x + " элементе.");
           }
        }
    }

    public static void diArr(String[][] arr) throws MyArraySizeException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            }
            if (arr.length != 4 || arr[i].length != 4){
                throw new MyArraySizeException("Размер двумерного массива должен быть 4х4.");
            }
        }
    }

    public static int sumDiArr(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            y = i;
            for (int j = 0; j < arr[i].length; j++) {
                x = j;
                Integer.parseInt(arr[i][j]);
                sum = Integer.parseInt(arr[i][j]) + sum;
            }
        }
        return sum;
    }
}
