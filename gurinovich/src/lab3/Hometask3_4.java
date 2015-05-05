package lab3;
/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
 1 1 1 1 1
 0 1 1 1 0
 0 0 1 0 0
 0 1 1 1 0
 1 1 1 1 1
 */
public class Hometask3_4 {
    public static void main(String[] args) {
        int num = 7;
        int[][] array = new int[num][num];

        int counter=0;
        for (int row=0; row < num; row++) {
            for (int column=counter; column < num-counter; column++) {
                array[row][column]=1;
            }
            if (row < num/2){
                counter++;
            } else {
                counter--;
            }
        }

        for (int row=0; row < num; row++) {
            for (int column = 0; column < array[row].length; column++){
               // if (array[row][column]!=1){
               //     array[row][column]=0;
               // }
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}