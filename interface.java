interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall();
}

class SmartPhone implements Camera, Phone {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void makeCall() {
        System.out.println("Calling a contact...");
    }

    void playMusic() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.makeCall();
        sp.takePhoto();
        sp.playMusic();
    }
}
