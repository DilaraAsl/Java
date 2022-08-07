package XtraTasks.SimpleTasks;

public class AbstractTask25 {
    public static void main(String[] args) {
        Y y = new Y();

        System.out.println(y.methodX());
    }
}

abstract class X {
    int i = 111;

    int methodX() {
        return methodX(i);
    }

    abstract int methodX(int i);
}

class Y extends X {
    @Override
    int methodX(int i) {
        return ++i + i++; // i++ becomes 112 and i is 112
    }
}

