import javax.inject.Inject;

public class Main {
    @Inject
    public Rose rose;

    public static void main(String[] args) {
        Main m = new Main();
        DaggerMainComponent.create().inject(m);
        m.rose.drink();
    }
}

class Rose {
    @Inject
    public Water water;

    @Inject
    public Rose() {
    }

    public void drink() {
        System.out.println("花：需要喝水");
        water.watering();
    }
}

class Water {
    @Inject
    public Water() {
    }

    public void watering() {
        System.out.println("水：给你浇水");
    }
}

