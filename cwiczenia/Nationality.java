package cwiczenia;

public enum Nationality {
    PL("Polish"),
    GB("British"),
    FR("French"),
    SP("Spanish"),
    GE("German");

    private String full;
    Nationality(String full) {
        this.full = full;
    }
    public String getFull() {
        return full;
    }
}
