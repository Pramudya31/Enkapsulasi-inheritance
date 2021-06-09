/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class Toko {

    private String Admin;
    int harga;
    int total;
    String merk;

    public void Display() {
        System.out.println(" <<< Selamat Berbelanja Di Mei Shop >>> ");
        System.out.println("             --- Sudirman, Probolinggo 310504 ---        ");
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public String getAdmin() {
        return Admin;
    }
}
