public class Author {
    private String firstName;
    private String secondName;
    private String fullName;
    public void setName(String fn,String sn){
        this.firstName = fn;
        this.secondName = sn;
    }
    public String getName(){
        fullName = firstName +" "+ secondName;
        return fullName;
    }
    @Override
    public String toString(){
        return firstName+" "+secondName;
    }

    @Override 
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return firstName.equals(a2.firstName) && secondName.equals(a2.secondName);
    }
    @Override 
    public int hashCode(){
        return java.util.Objects.hash(firstName , secondName);
    }
}
