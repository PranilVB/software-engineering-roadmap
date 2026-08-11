package AccessControl;
public class Student {

    private String name;
    String sirname;
    protected int DOB;

    public void setName(String name,String sirname,int DOB) {
        this.name = name;
        this.sirname=sirname;
        this.DOB=DOB;
    }
    public void setName(String name,String sirname) {
        this.name = name;
        this.sirname=sirname;
    }
    public void setName(String name) {
        this.name = name;
        this.sirname="NA";
        this.DOB=00;
    }

    public String getName() {
        return (name);
    }
}