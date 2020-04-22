package systemmodel;

public enum KindOfInstructor {
    BallRoomDancingInstructor ("BallRoomDancingInstructor"),
    ZumbaInstructor ("ZumbaInstructor"),
    SwimmingInstructor ("SwimmingInstructor"),
    SynchronizedSwimmingInstructor ("SynchronizedSwimmingInstructor"),
    YogaInstructor ("YogaInstructor"),
    HealthySpineInstructor ("HealthySpineInstructor");

    private final String usingName;

    KindOfInstructor(String usingName) {
        this.usingName = usingName;
    }
}
