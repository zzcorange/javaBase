package innerclass;

/**
 * @Author chengzi
 * @Date 2018/9/16 15:57
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }
    public void track(){internalTracking(true);}
    public static void mai(String[] args){
        Parcel6 p = new Parcel6();
        p.track();
    }
}
