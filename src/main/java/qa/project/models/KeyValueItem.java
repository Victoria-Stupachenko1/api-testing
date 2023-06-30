package qa.project.models;

public class KeyValueItem {
    private String key;
    private String value;

    @Override
    public String toString() {
        return "KeyValueItem{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
