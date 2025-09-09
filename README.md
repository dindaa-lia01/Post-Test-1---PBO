# Post Test 1 - PBO

Nama: Dinda Aulia Rizky NIM: 2409116076 Kelas: B

# ***Program Manajemen Obat di Apotek***

Program manajemen obat di apotek ini dibuat dengan menggunakan bahasa pemrograman Java yang memiliki tujuan untuk membantu pengelolaan data obat secara sederhana. Program ini menggunakan konsep *object-oriented programming* (OOP), di mana terdapat kelas `obat` yang merepresentasikan setiap obat dengan atribut seperti nama obat, kategori, tanggal kadaluarsa, jumlah stok, serta harga. Untuk memudahkan penyimpanan, program menggunakan `ArrayList` agar data obat dapat dikelola secara dinamis, baik ditambah, dihapus, maupun diperbarui.

Selain itu, program juga memiliki menu interaktif sehingga pengguna bisa memilih berbagai opsi manajemen obat, seperti menampilkan daftar obat, menambahkan obat baru, memperbarui stok obat, menghapus data, maupun keluar dari program. Dengan adanya constructor dan method `tampilkanObat()`, setiap data obat yang tersimpan dapat diinput secara praktis sekaligus ditampilkan dengan rapi di layar.

Secara keseluruhan, program ini berfungsi sebagai simulasi sederhana sistem informasi apotek, khususnya untuk manajemen inventori obat. 

# `A. Penjelasan Baris Kode`

1. Package

   Kode package com.mycompany.manajemenapotek; digunakan untuk menentukan bahwa file Java ini berada dalam sebuah package bernama com.mycompany.manajemenapotek. Package berfungsi untuk mengelompokkan kelas agar lebih terorganisir dan memudahkan pengelolaan program dalam skala besar.

   <img width="412" height="26" alt="Screenshot 2025-09-08 224336" src="https://github.com/user-attachments/assets/8f56e05e-2be5-4391-9faf-e036221261cc" />

2. Import

   Bagian import java.util.ArrayList; dan import java.util.Scanner; berfungsi untuk mengimpor library bawaan Java. ArrayList digunakan untuk menyimpan data dalam bentuk list dinamis, sedangkan Scanner digunakan untuk menerima input dari pengguna melalui terminal.

   <img width="230" height="65" alt="Screenshot 2025-09-08 224541" src="https://github.com/user-attachments/assets/f41cfece-c6c4-4b65-b7de-3d78e1596ded" />

3. Class Obat

   Di dalam kelas utama main, terdapat kelas statis obat yang merepresentasikan objek obat. Kelas ini memiliki beberapa atribut, yaitu namaObat, kategori, expiredDate dengan tipe data string. stok menggunakan tipe data integer dan harga menggunakan tipe data double. Atribut ini digunakan untuk menyimpan informasi detail mengenai obat di apotek.

   <img width="266" height="260" alt="Screenshot 2025-09-08 225212" src="https://github.com/user-attachments/assets/73dd9047-c30a-44a4-a4de-981beb0821a9" />

4. Constructor

   Constructor public obat(...) digunakan untuk memberikan nilai awal pada atribut-atribut kelas obat ketika objek baru dibuat. Dengan constructor ini, setiap kali membuat objek obat baru, pengguna dapat langsung mengisi nama, kategori, tanggal kadaluarsa, jumlah stok, dan harga. Fungsi this pada class obat adalah untuk membedakan antara atribut milik objek dengan parameter yang diterima oleh constructor atau method.

    <img width="814" height="223" alt="Screenshot 2025-09-08 225234" src="https://github.com/user-attachments/assets/20fee4bd-e199-4a6e-8450-123179517536" />

5. Method tampilkanObat()

   Method tampilkanObat() digunakan untuk menampilkan informasi detail dari setiap objek obat yang sudah dibuat. Method ini akan mencetak nama obat, kategori, expired date, stok, dan harga ke terminal, sehingga memudahkan pengguna dalam melihat daftar obat yang tersedia.

   <img width="528" height="258" alt="Screenshot 2025-09-08 225250" src="https://github.com/user-attachments/assets/f0b6813d-549e-4889-af2b-6eb4ea812481" />

6. main method (scanner dan arraylist)

   Pada bagian public static void main, dibuat objek Scanner untuk membaca input dari pengguna, serta ArrayList<obat> daftarObat yang digunakan untuk menyimpan kumpulan objek obat. Dengan ArrayList, data obat dapat ditambah, dihapus, atau diperbarui.

   <img width="492" height="98" alt="Screenshot 2025-09-08 225340" src="https://github.com/user-attachments/assets/3c07c7b0-4016-45fb-acc2-e0c971aa6ff2" />

7. Pembuatan objek obat

   Kode ini membuat beberapa objek obat (obat1, obat2, obat3, obat4) dengan data masing-masing, seperti nama, kategori, tanggal expired, stok, dan harga. Setelah itu, objek-objek tersebut ditambahkan ke dalam daftarObat agar nantinya bisa ditampilkan pada terminal saat pengguna memilih menu "Tampilkan Daftar Obat".

   <img width="711" height="284" alt="Screenshot 2025-09-08 225357" src="https://github.com/user-attachments/assets/631d207b-37d5-40a9-9527-edd697958004" />

8. menu pilihan

   Bagian ini menampilkan menu interaktif di console yang memberikan opsi kepada pengguna, seperti menampilkan daftar obat, menambah obat baru, memperbarui stok, menghapus daftar, atau keluar dari program. Menu ini menjadi inti dari sistem manajemen apotek berbasis teks.

   <img width="737" height="288" alt="Screenshot 2025-09-08 225425" src="https://github.com/user-attachments/assets/0a6d695b-bc78-481b-b4aa-63ef0b8425b1" />

9. input pilihan

   Kode pilihan = scanner.nextInt(); digunakan untuk membaca input angka yang dimasukkan pengguna sebagai pilihan menu. Setelah itu, scanner.nextLine(); dipakai untuk membersihkan buffer input agar tidak terjadi error saat membaca input berikutnya.

   <img width="274" height="101" alt="Screenshot 2025-09-08 225437" src="https://github.com/user-attachments/assets/f02371f7-fa18-4e52-aec5-f24412767775" />

10. Menu menampilkan daftar obat

    Pada case 1, program akan memeriksa apakah daftarObat masih kosong dengan perintah isEmpty(). Jika kosong, maka akan ditampilkan pesan "Obat belum tersedia.". Namun, jika terdapat data obat, program akan mencetak judul daftar obat, kemudian melakukan perulangan dengan for untuk menampilkan setiap data obat secara terurut berdasarkan indeksnya.

    Setiap objek obat akan ditampilkan dengan atribut yang meliputi nama obat, kategori, tanggal kadaluarsa, jumlah stok, serta harga. Dengan demikian, bagian kode ini memiliki fungsi sebagai menu untuk melihat daftar obat yang sudah dimasukkan ke dalam program. fungsi break setiap case di dalam switch adalah supaya program berhenti setelah menemukan case yang cocok dan tidak mengeksekusi case lainnya yang tidak relevan.

    <img width="854" height="560" alt="Screenshot 2025-09-08 225737" src="https://github.com/user-attachments/assets/29a412c1-8399-4405-a07c-5ded2c3da533" />

12. Menu menambahkan data obat baru ke dalam daftar obat

    Pada case 2, program meminta pengguna untuk menginput beberapa informasi terkait obat, yaitu nama, kategori, tanggal kadaluarsa, stok, dan harga. Input ini diambil melalui objek scanner. Setelah semua data berhasil diinput, program membuat objek baru dari kelas obat dengan menggunakan konstruktor yang menerima parameter sesuai data yang dimasukkan. Objek obat tersebut kemudian ditambahkan ke dalam daftarObat dengan perintah daftarObat.add(). Setelah proses berhasil, program akan menampilkan pesan "Obat berhasil ditambahkan!". Jadi, bagian kode ini berfungsi sebagai menu input data obat baru agar dapat tersimpan dalam daftar untuk ditampilkan pada menu sebelumnya.

    <img width="646" height="472" alt="image" src="https://github.com/user-attachments/assets/97adac97-5852-4481-a6c5-3d64ce8e0e24" />

13. Menu mengubah data obat

    Pada potongan kode ini, program menangani pilihan menu untuk mengubah data obat. Program akan memeriksa apakah daftar obat kosong atau tidak. Jika tidak kosong, pengguna diminta untuk memasukkan nomor obat yang ingin diubah. Setelah itu, program akan mengambil objek obat berdasarkan nomor yang dimasukkan (dengan penyesuaian indeks karena dimulai dari 1).

    Kemudian, program akan menampilkan data lama dan meminta input baru untuk nama, kategori, stok, dan harga. Setiap input yang tidak kosong akan digunakan untuk memperbarui data obat tersebut. Jika input dibiarkan kosong, maka data lama akan tetap dipertahankan. Setelah semua proses selesai, program akan menampilkan pesan bahwa data berhasil diubah. Jika nomor obat yang dimasukkan tidak valid, akan ditampilkan pesan kesalahan.

    <img width="624" height="874" alt="Screenshot 2025-09-08 232605" src="https://github.com/user-attachments/assets/dbe42dfc-5d4a-452e-a559-ea8189ca8c71" />

    <img width="503" height="395" alt="Screenshot 2025-09-08 232637" src="https://github.com/user-attachments/assets/74686237-c62f-4579-bc92-3d8f9820365a" />

14. Menu menghapus data obat

    Kode pada gambar ini digunakan untuk menghapus data obat dari daftar. Program akan memeriksa apakah daftar obat kosong. Jika tidak, pengguna akan diminta untuk memasukkan nomor obat yang ingin dihapus. Program kemudian memvalidasi apakah nomor tersebut berada dalam rentang indeks yang tersedia. Jika valid, data obat akan dihapus dari daftar dan ditampilkan pesan bahwa obat berhasil dihapus. Jika tidak valid, maka akan ditampilkan pesan kesalahan bahwa nomor obat tidak valid.

    <img width="629" height="477" alt="Screenshot 2025-09-08 232701" src="https://github.com/user-attachments/assets/2d001434-6141-4244-9873-bffac547d7c2" />

15. Keluar program dan Penanganan Input Tidak Valid

    Potongan kode terakhir ini menangani dua hal, yaitu keluar dari program (case 5) dan penanganan input menu yang tidak valid (default). Pada case 5, program akan menampilkan pesan terima kasih kepada pengguna dan menyatakan bahwa program telah selesai.

    Sementara itu, jika input pengguna tidak sesuai dengan pilihan menu yang ada, maka program akan menampilkan pesan bahwa pilihan tidak valid dan meminta pengguna untuk menginput ulang dikarenakan program ini menerapkan perulangan do while untuk memastikan menu utama selalu ditampilkan kembali setelah pengguna memilih suatu opsi. Dengan perulangan ini, pengguna dapat melakukan berbagai operasi seperti menambah, memperbarui, atau menghapus data obat secara berulang tanpa harus menjalankan program dari awal.Terakhir, scanner ditutup dan program berhenti ketika pilihan adalah angka 5.

    <img width="826" height="414" alt="Screenshot 2025-09-08 232727" src="https://github.com/user-attachments/assets/c371f047-207d-41fe-a482-51e9db2eb421" />

# `B. Penjelasan Output`

   1. Menu Tampilkan Daftar Obat

      Program menampilkan menu utama “Manajemen Daftar Obat di Apotek” yang berisi beberapa pilihan, seperti menampilkan daftar obat, menambah obat, memperbarui stok, menghapus daftar, dan keluar dari program. Pengguna memilih opsi 1 (Tampilkan Daftar Obat) sehingga program menampilkan seluruh data obat yang sudah tersimpan. Informasi yang ditampilkan meliputi nama obat, kategori, tanggal kedaluwarsa, jumlah stok, serta harga. Contohnya, terdapat obat Amoxicillin, Paracetamol, Ibuprofen, dan Vitamin C dengan detail masing-masing.
      
      <img width="628" height="709" alt="image" src="https://github.com/user-attachments/assets/9472971c-33e7-43e7-b413-987895d15f00" />

   1. Menu Tambah Obat

      Pada menu kedua pengguna memilih untuk menambahkan obat. Setelah itu, program meminta input berupa nama obat, kategori, tanggal kedaluwarsa, stok, dan harga. Pengguna kemudian memasukkan data obat baru yaitu Omeprazole dengan kategori Antasida, expired date 10-03-2026, stok 76, dan harga Rp18000. Setelah seluruh data dimasukkan, program memberikan konfirmasi dengan pesan “Obat berhasil ditambahkan!”, yang menandakan bahwa obat tersebut sudah masuk ke dalam daftar.
      
      <img width="510" height="302" alt="image" src="https://github.com/user-attachments/assets/e256c79b-1841-4b4f-a65e-682786bf56c8" />

      Pengecekan:
      
      <img width="519" height="674" alt="image" src="https://github.com/user-attachments/assets/a97ab7e7-ca33-486d-a119-3a4f4e343484" />

   3. Menu Update Stok

      Pengguna memilih menu nomor 3 (Update Stok). Setelah itu, diminta untuk memasukkan nomor obat yang ingin diubah, yaitu obat nomor 1. Pengguna kemudian dapat memperbarui data obat, seperti stok baru (50), sedangkan nama, kategori, dan harga tetap seperti sebelumnya karena tidak diubah. Setelah semua data dimasukkan, program memberikan notifikasi bahwa data obat berhasil diubah.
    
      <img width="519" height="305" alt="image" src="https://github.com/user-attachments/assets/f2cf369a-06af-4c9d-afed-e08ee65426bc" />

      Pengecekan:
      
      <img width="541" height="154" alt="image" src="https://github.com/user-attachments/assets/ab011296-807a-4d77-998e-fce936ec9b81" />

   4. Menu Hapus Daftar

      Pengguna memilih menu nomor 4 (Hapus Daftar). Program meminta pengguna untuk memasukkan nomor obat yang ingin dihapus, yaitu obat nomor 5. Setelah dikonfirmasi, program menampilkan pesan bahwa obat berhasil dihapus dari daftar.
            
      <img width="538" height="223" alt="image" src="https://github.com/user-attachments/assets/8c32e3b9-21bf-4964-99bf-9e3a218165be" />

      Pengecekan:

      <img width="573" height="714" alt="image" src="https://github.com/user-attachments/assets/7dd437d8-99c1-41dd-9dc5-39cb7b676e8d" />

   5. Menu Keluar

      Setelah itu, pengguna memilih menu nomor 5 (Keluar). Program menampilkan pesan terima kasih dan menyatakan bahwa program selesai dijalankan.
      
      <img width="570" height="449" alt="image" src="https://github.com/user-attachments/assets/728de112-a433-4716-a3bc-b791893f72a3" />

   
   6. Pengecekan 

      Pengguna pertama kali memilih menu dengan nomor 6, yang tidak valid karena hanya tersedia pilihan 1 sampai 5. Program menampilkan pesan kesalahan dan meminta input ulang.
      
      <img width="529" height="381" alt="image" src="https://github.com/user-attachments/assets/e963befe-a1a5-440f-bdcf-3de731757c34" />







