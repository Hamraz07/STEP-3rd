
public class Q3 {
    static class NameTag {
        private final String firstName,lastInitial;
        NameTag(String fullName){String[] parts=fullName.split(" ");firstName=parts[0];lastInitial=parts[1].substring(0,1);}
        String getNickname(){return firstName+" "+lastInitial+".";}
    }
    public static void main(String[] args) {
        NameTag tag=new NameTag("Maria Gomez");System.out.println(tag.getNickname());
    }
}
