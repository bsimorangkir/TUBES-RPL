/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bioskop;

/**
 *
 * @author Benny Christian
 */
public class film {
    private String kodeFilm;
    private String judulFilm;
    private String genre;

    /**
     * @return the kodeFilm
     */
    public String getKodeFilm() {
        return kodeFilm;
    }

    /**
     * @param kodeFilm the kodeFilm to set
     */
    public void setKodeFilm(String kodeFilm) {
        this.kodeFilm = kodeFilm;
    }

    /**
     * @return the judulFilm
     */
    public String getJudulFilm() {
        return judulFilm;
    }

    /**
     * @param judulFilm the judulFilm to set
     */
    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
