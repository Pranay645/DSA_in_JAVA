package JavaCollections;

public class EnumBasics {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //These are enum constant
        //These are public,static nad final
        //Since it is final you cant create child enum
        Week(){
            System.out.println("Construction called for"+this);
        }
    }


    public static void main(String[] args) {
        Week day=Week.Friday;

    }
}
