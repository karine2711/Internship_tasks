package spring.beans.classwork.customannotations;

public interface Animal {

    default boolean isMammal() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    };


}
