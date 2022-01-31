package com.israelandradedev.abstracao.metalband;

public class MetalBandApp {

    public static void main(String[] args) {

        // Se você armazenar os objetos na classe super, não terá acesso aos métodos da classe filha. É melhor declarar
        // os objetos nas classes filhas e posteriormente agrupá-las em arrays. Se elas forem agrupadas e declaradas
        // ao mesmo tempo como classe super, o problema acima se repete.
        ProgressiveMetalBand dreamTheater = new ProgressiveMetalBand("Dream Theater", 5);
        PowerMetalBand rhapsodyOfFire = new PowerMetalBand("Rhapsody of Fire", 5);

        MetalBand[] bands = new MetalBand[2];
        bands[0] = dreamTheater;
        bands[1] = rhapsodyOfFire;

        for (MetalBand band : bands) {
            band.playLive();
            band.showMetalStyle();
            band.recordAlbum();
        }

        dreamTheater.setMusicalFestival("Prog Nation 2022");
        dreamTheater.playAlbumAtProgNation();
        dreamTheater.playGuitarKeyboardDuel();
    }
}
