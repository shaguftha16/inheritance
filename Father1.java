class Father1 {
    void property() {
        System.out.println("Father's Property");
    }
}

class Son extends Father1 {
    void bike() {
        System.out.println("Son has a Bike");
    }
}

class Daughter extends Father1 {
    void scooty() {
        System.out.println("Daughter has a Scooty");
    }

    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();

        s.property();
        s.bike();

        d.property();
        d.scooty();
    }
}

