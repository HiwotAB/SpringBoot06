package hiwotab.springboot_06.Model;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Song {

    private long id;

    @NotEmpty(message = "Enter Name of Song ")
    private String names;

    @NotEmpty(message = "Enter the Number of Artist")
    private String artist;

    @NotEmpty(message = "Enter Album")
    private String album;

    @NotEmpty(message = "Enter the Rate")

    private int rating;


    @NotEmpty(message = "Enter the Year")

    private int year;

    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }





}
