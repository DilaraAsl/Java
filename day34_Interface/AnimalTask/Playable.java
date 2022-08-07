package day34_Interface.AnimalTask;

public interface Playable {
    boolean isFriendly = true;

    default void play() {
        System.out.println(getClass().getSimpleName() + " plays with its owner");
    }

}
