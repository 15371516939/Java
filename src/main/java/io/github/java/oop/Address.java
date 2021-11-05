import lombok.Data;

@Data


 class Address implements Cloneable{
    private Integer id;
    private String describe;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
