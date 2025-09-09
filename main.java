package com.mycompany.manajemenapotek;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
// class obat
    static class obat {
        String namaObat;
        String kategori;
        String expiredDate;
        int stok;
        double harga;
        
        public obat(String namaObat, String kategori, String expiredDate, int stok, double harga) {
            this.namaObat = namaObat;
            this.kategori = kategori;
            this.expiredDate = expiredDate;
            this.stok = stok;
            this.harga = harga;
         }
    
         public void tampilkanObat() {
            System.out.println("Nama Obat: " + this.namaObat);
            System.out.println("Kategori: " + this.kategori);
            System.out.println("Expired Date: " + this.expiredDate);
            System.out.println("Stok: " + this.stok);
            System.out.println("Harga: " + this.harga);
            System.out.println("-------------------------------");
              }
    }
    
 // main
         public static void main (String[] args) {
             Scanner scanner = new Scanner(System.in);
              ArrayList<obat> daftarObat = new ArrayList<>();   
      
              obat obat1 = new obat ("Amoxcillin", "Antibiotik", "01-12-2027", 120, 5000);
              obat obat2 = new obat ("Paracetamol", "Analgesik", "22-03-2028", 80, 12000);
              obat obat3 = new obat ("Ibuprofen", "Analgesik", "30-02-2028", 50, 8000);
              obat obat4 = new obat ("Vitamin C", "Suplemen", "01-01-2026", 100, 4000);
              
              daftarObat.add(obat1);
              daftarObat.add(obat2);
              daftarObat.add(obat3);
              daftarObat.add(obat4);
              
         int pilihan; 
         do {
            System.out.println("\n---------< Manajemen Daftar Obat di Apotek >---------");
            System.out.println("1. Tampilkan Daftar Obat");
            System.out.println("2. Tambah Obat");
            System.out.println("3. Update Stok");
            System.out.println("4. Hapus Daftar");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu:  "); 
            
            pilihan = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
            
            switch (pilihan) {
                case 1:
                    if (daftarObat.isEmpty()) {
                    System.out.println("Obat belum tersedia.");
                    } else {
                        System.out.println("=============== < Daftar Obat > ===============");
                        for (int i = 0; i < daftarObat.size(); i++) {
                            obat o = daftarObat.get(i);
                            System.out.println((i + 1) + ". " + o.namaObat +
                                    " \n Kategori: " + o.kategori +
                                    "\n Exp: " + o.expiredDate +
                                    " \n Stok: " + o.stok +
                                    "\n Harga: Rp" + o.harga +
                                    "\n-----------------------------------------------------");
                                    
                    }
                }
                break;
          
                 case 2:
                    System.out.print("Masukkan nama obat: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan kategori: ");
                    String kategori = scanner.nextLine();
                    System.out.print("Masukkan expired date: ");
                    String expiredDate = scanner.nextLine();
                    System.out.print("Masukkan stok: ");
                    int stok = scanner.nextInt();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                    
                    daftarObat.add(new obat(nama, kategori, expiredDate, stok, harga));
                    System.out.println("Obat berhasil ditambahkan!");
                    break;
                    
                 case 3:
                    if (daftarObat.isEmpty()) {
                        System.out.println("Daftar obat kosong.");
                    } else {
                        System.out.print("Masukkan nomor obat yang ingin diubah: ");
                        int indexUbah = scanner.nextInt();
                        scanner.nextLine(); 

                        if (indexUbah > 0 && indexUbah <= daftarObat.size()) {
                            obat o = daftarObat.get(indexUbah - 1);

                            System.out.print("Nama baru (" + o.namaObat + "): ");
                            String namaBaru = scanner.nextLine();
                            if (!namaBaru.isEmpty()) {
                                o.namaObat = namaBaru;
                            }

                            System.out.print("Kategori baru (" + o.kategori + "): ");
                            String kategoriBaru = scanner.nextLine();
                            if (!kategoriBaru.isEmpty()) {
                                o.kategori = kategoriBaru;
                            }

                            System.out.print("Stok baru (" + o.stok + "): ");
                            String stokInput = scanner.nextLine();
                            if (!stokInput.isEmpty()) {
                                o.stok = Integer.parseInt(stokInput);
                            }

                            System.out.print("Harga baru (" + o.harga + "): ");
                            String hargaInput = scanner.nextLine();
                            if (!hargaInput.isEmpty()) {
                                o.harga = Double.parseDouble(hargaInput);
                            }

                            System.out.println("Data obat berhasil diubah!");
                        } else {
                            System.out.println("Nomor obat tidak valid!");
                        }
                    }
                    break;
                  
                case 4:
                    if (daftarObat.isEmpty()) {
                        System.out.println("Daftar obat kosong.");
                    } else {
                        System.out.print("Masukkan nomor obat yang ingin dihapus: ");
                        int indexHapus = scanner.nextInt();

                        if (indexHapus > 0 && indexHapus <= daftarObat.size()) {
                            daftarObat.remove(indexHapus - 1);
                            System.out.println("Obat berhasil dihapus!");
                        } else {
                            System.out.println("Nomor obat tidak valid.");
                        }
                    }
                    break;
                    
                 case 5:
                    System.out.println("Terima kasih telah menggunakan program. \nprogram selesai.");
                    break;
                    
                 default:
                     System.out.println("Pilihan tidak valid! \nSilahkan Input ulang.");
            }
                    
          } while (pilihan != 5);
          
          scanner.close();
    }
         }
    



