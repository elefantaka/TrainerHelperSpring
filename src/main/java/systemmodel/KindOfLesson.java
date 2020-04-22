package systemmodel;

public enum KindOfLesson {
    BallRoomDancing ("BallRoomDancing"),
    Zumba ("Zumba"),
    Swimming ("Swimming"),
    SynchronizedSwimming ("SynchronizedSwimming"),
    Yoga ("Yoga"),
    HealthySpine ("HealthySpine");

    private final String usingName;

    KindOfLesson(String usingName) {
        this.usingName = usingName;
    }
}
