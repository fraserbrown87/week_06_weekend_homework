public enum RoomValue {
    LOW(100),
    MEDIUM(200),
    HIGH(300),
    PREMIUM(500),
    BALLER(1000);

    private final int value;

    RoomValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

//    int cardValue = RoomValue.PREMIUM.getValue();
}
