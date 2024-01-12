package domain;

public class Subject {
    private static int idSeq = 1;
    private Integer subjectId ;
    private String name;
    private OptionalRequired optionalRequired;

    public Subject(String name, OptionalRequired optionalRequired) {
        this.subjectId = idSeq++;
        this.name = name;
        this.optionalRequired = optionalRequired;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public OptionalRequired getOptionalRequired() {
        return optionalRequired;
    }
}
