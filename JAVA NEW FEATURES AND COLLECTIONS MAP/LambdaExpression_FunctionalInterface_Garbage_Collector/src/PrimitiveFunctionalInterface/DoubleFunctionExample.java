package PrimitiveFunctionalInterface;


import java.util.function.DoubleFunction;

public class DoubleFunctionExample {
    public static void main(String[] args) {

        //in this example take inout value as double and return string which is specify in the genrics

        DoubleFunction<String> halfValue = num -> "Half is: " + (num / 2);

        System.out.println(halfValue.apply(10)); // Half is: 5.25


        //now talke double and return int


//        DoubleToIntFunction



    }
}
