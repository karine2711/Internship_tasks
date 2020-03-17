package java8.task4;

@FunctionalInterface
public interface ThreeFunction  <K,A,R,I> {
    I getResult (K a, A b, R c );
}
