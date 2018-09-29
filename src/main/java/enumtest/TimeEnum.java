package enumtest;

public enum  TimeEnum {
    tim("timkey","timvalue"),
    jim("jimkey","jimvalue");

    private String key;
    private String value;
    TimeEnum(String key,String value){
        this.key = key;
        this.value = value;
    }
    public String toString(){
        return "key="+key+";value="+value;
    }
}