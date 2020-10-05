package Lesson2;
/*
 1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
         10 3 1 2
         2 3 2 2
         5 6 7 1
         300 3 1 0
         Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
         2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
         3. Ваши методы должны бросить исключения в случаях:
         Если размер матрицы, полученной из строки, не равен 4x4;
         Если в одной из ячеек полученной матрицы не число; (например символ или слово)
         4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
         5. * Написать собственные классы исключений для каждого из случаев
*/


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AdaptToArray newString = new AdaptToArray("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0");

        try{
            System.out.println(newString.getDivision());
        }
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

}