/*4 Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1*/
package HW3;

public class Exercise4 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = arr.length - 1; i >= arr.length / 2 + 1; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] anArr : arr) {
            for (int j = 0; j < anArr.length; j++) {
                System.out.print(anArr[j]);
            }
            System.out.println(" ");
        }
    }
}
