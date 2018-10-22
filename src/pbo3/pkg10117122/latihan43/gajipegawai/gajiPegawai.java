/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan43.gajipegawai;

/**
 *
 * @author Aldy Senda
 */
public class gajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    public int totalGaji(){
        totalGaji = uangTunjangan + uangTransport + gajiPokok;
        return totalGaji;
    }
    public void tampilData(String nama, String alamat, int uangTunjangan,
            int uangTransport, int gajiPokok, int totalGaji){
        
        gajiPegawai object = new gajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        object.setNama("Rizki Adam Kurniawan");
        object.setAlamat("Jalan Semar dlm 4 No 72/66");
        object.setUangTransport(250000);
        object.setUangTunjangan(300000);
        object.setGajiPokok(4500000);
        System.out.println("Nama Karyawam  : " + object.getNama());
        System.out.println("Alamat         : " + object.getAlamat());
        System.out.println("Uang Transport : Rp. " + object.getUangTransport());
        System.out.println("Uang Tunjangan : Rp. " + object.getUangTunjangan());
        System.out.println("Gaji Pokok     : Rp. " + object.getGajiPokok());
        System.out.println("Total Gaji     : Rp. " + object.totalGaji());   
    }
}
