public class Author {
    private String firstName;
    private String secondName;
    public void setName(String fn,String sn){
        this.firstName = fn;
        this.secondName = sn;
    }
    public String getName(){
        String fullName = firstName +" "+ secondName;
        return fullName;
    }
}
