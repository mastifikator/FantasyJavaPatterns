package Bridge;

public enum ERangeType {
    RANGE("Издалека"),
    CLOSE("Сблизи");

    private String title;

    ERangeType(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
