public class MinInTheArray {

    public static void main(String[] args) {
        int []array = {2, 7, 8, 6, 5, 1, 9, 11};
        int index = findMinValue(array);
        System.out.println("Phan tu nho nhat trong mang la " + array[index] + " tai vi tri thu " + (index+1));
    }

    public static int findMinValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
