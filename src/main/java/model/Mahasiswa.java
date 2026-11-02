/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Thinkpad
 */
public class Mahasiswa {
    private String nama, nim, email;

    public Mahasiswa(String nama, String nim, String email) {
        this.nama = nama; this.nim = nim; this.email = email;
    }
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getEmail() { return email; }
}
