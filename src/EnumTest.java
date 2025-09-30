public enum EnumTest {

    SPRING(1);

    private final int code;

    EnumTest(int a){
        this.code = a;
    }

    @Override
    public String toString() {
        return "EnumTest{" +
                "code=" + code +
                '}';
    }

    public Integer getCode(){
        return this.code;
    }
}
