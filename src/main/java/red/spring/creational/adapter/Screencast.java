public class Screencast {
    
    private String title;
    private String author;
    private Long duration;


     public Screencast(String title, String author, Long duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getDuration() {
        return this.duration;
    }    

}
