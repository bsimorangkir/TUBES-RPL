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
public class jadwal {
    private String idJadwal;
    private String tanggal;
    private String jamMulai;
    private kursi Kursi[][] = new kursi;
    /**
     * @return the idJadwal
     */
    public String getIdJadwal() {
        return idJadwal;
    }

    /**
     * @param idJadwal the idJadwal to set
     */
    public void setIdJadwal(String idJadwal) {
        this.idJadwal = idJadwal;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the jamMulai
     */
    public String getJamMulai() {
        return jamMulai;
    }

    /**
     * @param jamMulai the jamMulai to set
     */
    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }
    
}
