package com.israelandradedev.abstracao.metalband;

public class ProgressiveMetalBand extends MetalBand implements PlayAtProgNation {

    private String musicalFestival;

    public ProgressiveMetalBand(String bandName, int numberOfMembers){
        super("Progressive Metal", bandName, numberOfMembers);
    }

    public String getMusicalFestival() {
        return musicalFestival;
    }

    public void setMusicalFestival(String musicalFestival) {
        this.musicalFestival = musicalFestival;
    }

    @Override
    public void playAlbumAtProgNation() {
        System.out.println(super.getBandName() + " is playing the album songs at the " + getMusicalFestival() + ".");
    }

    @Override
    public void playGuitarKeyboardDuel() {
        System.out.println(super.getBandName() + " is performing a duel between keyboard and guitar.");
    }
}
