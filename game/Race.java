package sda.game;

public enum Race {
    ELF("Elf"),
    DWARF("Dwarf"),
    HUMAN("Human");

    private String full;

    Race(String full) {
        this.full=full;
    }

    public String getFull() {
        return full;
    }
}