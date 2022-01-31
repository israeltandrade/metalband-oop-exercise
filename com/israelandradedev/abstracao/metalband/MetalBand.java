package com.israelandradedev.abstracao.metalband;

public abstract class MetalBand {
    private String  musicalStyle;
    private String  bandName;
    private int numberOfMembers;

    public String getMusicalStyle() {
        return musicalStyle;
    }

    public void setMusicalStyle(String musicalStyle) {
        this.musicalStyle = musicalStyle;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public MetalBand(String musicalStyle, String bandName,  int numberOfMembers){
        this.musicalStyle = musicalStyle;
        this.bandName = bandName;
        this.numberOfMembers = numberOfMembers;
    }

    public void playLive() {
        System.out.println(bandName + " started to play live.");
    }

    public void recordAlbum() {
        System.out.println(bandName + " started to record a new album!");
    }

    public void showMetalStyle() {
        System.out.println(bandName + " plays " + musicalStyle + ".");

    }
}
