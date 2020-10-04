class Publication {

    public String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        String type = getType();
        String details = getDetails();

        return  type + ": " + details;

    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "The new era";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return "(source - " + source + "): " + title;
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here


    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return "(author - " + author + "): " + title;
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getType() {
        return "Announcements";
    }

    @Override
    public String getDetails() {
        return "(days to expire - " + daysToExpire + "): " + title;
    }
}