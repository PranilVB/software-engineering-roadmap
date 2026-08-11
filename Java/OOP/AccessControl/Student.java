package AccessControl;
public class Student {

    private String name;
    String sirname;
    protected int DOB;
    public String Address;
    public Student(){
        this.name = "NA";
        this.sirname="NA";
        this.DOB=0;
        this.Address="NA";
    }
    public Student(String Address){
        this.name = "NA";
        this.sirname="NA";
        this.DOB=0;
        this.Address=Address;
    }
    public void setName(String name,String sirname,int DOB,String Address) {
        this.name = name;
        this.sirname=sirname;
        this.DOB=DOB;
        this.Address=Address;

    }
    public void setName(String name,String sirname) {
        this.name = name;
        this.sirname=sirname;
    }
    public void setName(String name) {
        this.name = name;
        this.sirname="NA";
        this.DOB=0;
        this.Address="NA";
    }

 public void setName(String name, String sirname, int DOB) {
        this.name = name;
        this.sirname = sirname;
        this.DOB = DOB;
        this.Address = "NA";
    }


    public String getName() {
        return name;
    }
}