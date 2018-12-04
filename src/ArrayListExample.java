import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] arges){
        String[] platforms1 = {"ps3"};
        String[] platforms2 = {"3DS", "Wii"};

        VideoGame game1 =  new VideoGame("Battlefield 1", 2000,"M",platforms1);
        VideoGame game2 =  new VideoGame("Battlefield 2", 2007,"G",platforms2);
        VideoGame game3 =  new VideoGame("The Legend of Zelda", 2013,"M",platforms2);
        VideoGame game4 =  new VideoGame("Heroes and Generals", 2016,"M",platforms1);
        VideoGame game5 =  new VideoGame("God Of War 3", 2015,"M",platforms1);

        //using arraylist//
        ArrayList<VideoGame> games = new ArrayList<>();

        //adding videogame object to arraylist
        games.add(game1);
        games.add(game2);
        games.add(0,game3);//we can set index value//
        games.add(game4);
        games.add(game5);

        //printing them out//
        System.out.println(games);
    }
}

