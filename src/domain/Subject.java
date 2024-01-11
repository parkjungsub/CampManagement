package domain;

public class Subject {
    private Integer subjectId = 0;
    private String name;
    private OptionalRequired optionalRequired;

    public Subject(String name, OptionalRequired optionalRequired) {
        this.subjectId++;
        this.name = name;
        this.optionalRequired = optionalRequired;
    }
}
