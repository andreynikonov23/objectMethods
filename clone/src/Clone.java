public class Clone implements Cloneable{
    private String str;

    public Clone(String str){
        this.str = str;
    }
    public String getStr(){
        return str;
    }

    @Override
    public Clone clone(){
        try {
            return (Clone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
