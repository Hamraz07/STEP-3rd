
public class Q4 {
    static class TrafficLight {
        private final String id;private String color="RED";
        TrafficLight(String id){this.id=id;}
        void next(){if(color.equals("RED"))color="GREEN";else if(color.equals("GREEN"))color="YELLOW";else color="RED";}
        String getColor(){return color;}
        String getId(){return id;}
    }
    public static void main(String[] args) {
        TrafficLight light=new TrafficLight("TL-9");
        for(int i=0;i<4;i++){System.out.println(light.getId()+": "+light.getColor());light.next();}
    }
}
