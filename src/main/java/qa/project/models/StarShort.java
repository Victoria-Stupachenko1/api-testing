package qa.project.models;

public class StarShort {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "StarShort{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
