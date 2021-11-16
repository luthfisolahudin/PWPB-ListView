package id.luthfisolahudin.smkn4.pwpb.listview.model;

public class Hero {
    private int idDrawableImage;
    private String name;
    private String team;

    public Hero(int idDrawableImage, String name, String team) {
        this.idDrawableImage = idDrawableImage;
        this.name = name;
        this.team = team;
    }

    public int getIdDrawableImage() {
        return idDrawableImage;
    }

    public void setIdDrawableImage(int idDrawableImage) {
        this.idDrawableImage = idDrawableImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
