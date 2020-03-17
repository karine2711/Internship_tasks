package java8.task4;

public class Main {


    public static void main(String[] args) {
        ThreeFunction<String, String, String, String> concat = (a,b,c) -> a.concat(b).concat(c);
        ThreeFunction<Integer, Integer,Integer,Integer> sum = (a,b,c) -> a+b+c;
        System.out.println(concat.getResult("I ","wrote some ","code"));
        System.out.println(sum.getResult(1,2,3));

    }
}
