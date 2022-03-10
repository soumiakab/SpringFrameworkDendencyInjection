package springFrameworkDi.dependencyInjection;

public class Groupe{
    private String groupName;

    public Groupe(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
