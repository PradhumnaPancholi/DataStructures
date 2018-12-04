public class VideoGame {

    private String title;
    private int year;
    private String rating;
    private String[] platforms;

    public VideoGame(String title, int year, String rating, String[] platforms)
    {
        setTitle(title);
        setYear(year);
        setRating(rating);
        setPlatforms(platforms);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString()
    {
        return String.format("%s launched in %d earned a rating of %s on %s \n", title,year,rating,platforms);
    }
}

