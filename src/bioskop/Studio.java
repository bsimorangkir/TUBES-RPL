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
public class Studio {
    private String kodeStudio;
    private String namaStudio;
    private film Film = new film();
    private jadwal Jadwal = new jadwal();

    /**
     * @return the kodeStudio
     */
    public String getKodeStudio() {
        return kodeStudio;
    }

    /**
     * @param kodeStudio the kodeStudio to set
     */
    public void setKodeStudio(String kodeStudio) {
        this.kodeStudio = kodeStudio;
    }

    /**
     * @return the namaStudio
     */
    public String getNamaStudio() {
        return namaStudio;
    }

    /**
     * @param namaStudio the namaStudio to set
     */
    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    /**
     * @return the Film
     */
    public film getFilm() {
        return Film;
    }

    /**
     * @param Film the Film to set
     */
    public void setFilm(film Film) {
        this.Film = Film;
    }

    /**
     * @return the Jadwal
     */
    public jadwal getJadwal() {
        return Jadwal;
    }

    /**
     * @param Jadwal the Jadwal to set
     */
    public void setJadwal(jadwal Jadwal) {
        this.Jadwal = Jadwal;
    }
    
    
}
