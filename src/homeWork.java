import java.util.Arrays;
import java.util.Collections;

public class homeWork {
    public static void main(String[] args) {
        Integer[] array = new Integer[args.length];
        for(int i=0;i<args.length;i++)
        {
            array[i]=Integer.parseInt(args[i]);//парсим в Integer и заполняем массив array[] чтобы отсортировать в обратном порядке
            System.out.println(i + "-element = " + args[i]);
        }
        System.out.println();
        for(int j=0;j<array.length;j++)
        {
            Arrays.sort(array, Collections.reverseOrder());// используем метод класса Collections - меняем на противоложный порядок массива
            System.out.println(j +"-element = " + array[j]);
        }
    }
}
