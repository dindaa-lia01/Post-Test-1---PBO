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

   Bagian import java.util.ArrayList; dan import java.util.Scanner; berfungsi untuk mengimpor library bawaan Java. ArrayList digunakan untuk menyimpan data dalam bentuk list dinamis, sedangkan Scanner digunakan untuk menerima input dari pengguna melalui console.

   <img width="230" height="65" alt="Screenshot 2025-09-08 224541" src="https://github.com/user-attachments/assets/f41cfece-c6c4-4b65-b7de-3d78e1596ded" />

3. Class Obat

   Di dalam kelas utama main, terdapat kelas statis obat yang merepresentasikan objek obat. Kelas ini memiliki beberapa atribut, yaitu namaObat, kategori, expiredDate, stok, dan harga. Atribut ini digunakan untuk menyimpan informasi detail mengenai obat di apotek.

   <img width="266" height="260" alt="Screenshot 2025-09-08 225212" src="https://github.com/user-attachments/assets/73dd9047-c30a-44a4-a4de-981beb0821a9" />

4. Constructor

   Constructor public obat(...) digunakan untuk memberikan nilai awal pada atribut-atribut kelas obat ketika objek baru dibuat. Dengan constructor ini, setiap kali membuat objek obat baru, pengguna dapat langsung mengisi nama, kategori, tanggal kadaluarsa, jumlah stok, dan harga.

    <img width="814" height="223" alt="Screenshot 2025-09-08 225234" src="https://github.com/user-attachments/assets/20fee4bd-e199-4a6e-8450-123179517536" />

5. Method tampilkanObat()

   Method tampilkanObat() digunakan untuk menampilkan informasi detail dari setiap objek obat yang sudah dibuat. Method ini akan mencetak nama obat, kategori, expired date, stok, dan harga ke layar, sehingga memudahkan pengguna dalam melihat daftar obat yang tersedia.

   <img width="528" height="258" alt="Screenshot 2025-09-08 225250" src="https://github.com/user-attachments/assets/f0b6813d-549e-4889-af2b-6eb4ea812481" />

6. main method (scanner dan arraylist)

   Pada bagian public static void main, dibuat objek Scanner untuk membaca input dari pengguna, serta ArrayList<obat> daftarObat yang digunakan untuk menyimpan kumpulan objek obat. Dengan ArrayList, data obat dapat ditambah, dihapus, atau diperbarui secara dinamis.

   <img width="492" height="98" alt="Screenshot 2025-09-08 225340" src="https://github.com/user-attachments/assets/3c07c7b0-4016-45fb-acc2-e0c971aa6ff2" />

7. Pembuatan objek obat

   Kode ini membuat beberapa objek obat (obat1, obat2, obat3, obat4) dengan data masing-masing, seperti nama, kategori, tanggal expired, stok, dan harga. Setelah itu, objek-objek tersebut ditambahkan ke dalam daftarObat agar bisa dikelola secara kolektif.

   <img width="711" height="284" alt="Screenshot 2025-09-08 225357" src="https://github.com/user-attachments/assets/631d207b-37d5-40a9-9527-edd697958004" />

8. menu pilihan

   Bagian ini menampilkan menu interaktif di console yang memberikan opsi kepada pengguna, seperti menampilkan daftar obat, menambah obat baru, memperbarui stok, menghapus daftar, atau keluar dari program. Menu ini menjadi inti dari sistem manajemen apotek berbasis teks.

   <img width="737" height="288" alt="Screenshot 2025-09-08 225425" src="https://github.com/user-attachments/assets/0a6d695b-bc78-481b-b4aa-63ef0b8425b1" />

9. input pilihan

   Kode pilihan = scanner.nextInt(); digunakan untuk membaca input angka yang dimasukkan pengguna sebagai pilihan menu. Setelah itu, scanner.nextLine(); dipakai untuk membersihkan buffer input agar tidak terjadi error saat membaca input berikutnya.

   <img width="274" height="101" alt="Screenshot 2025-09-08 225437" src="https://github.com/user-attachments/assets/f02371f7-fa18-4e52-aec5-f24412767775" />

10. Menu menampilkan daftar obat

    Pada blok case 1, program pertama-tama memeriksa apakah daftarObat masih kosong dengan perintah isEmpty(). Jika kosong, maka akan ditampilkan pesan "Obat belum tersedia.". Namun, jika terdapat data obat, program akan mencetak judul daftar obat, kemudian melakukan perulangan dengan for untuk menampilkan setiap data obat secara terurut berdasarkan indeksnya. Setiap objek obat akan ditampilkan dengan atribut yang meliputi nama obat, kategori, tanggal kadaluarsa, jumlah stok, serta harga. Dengan demikian, bagian kode ini memiliki fungsi utama sebagai menu untuk melihat daftar obat yang sudah dimasukkan ke dalam sistem.

    <img width="854" height="560" alt="Screenshot 2025-09-08 225737" src="https://github.com/user-attachments/assets/29a412c1-8399-4405-a07c-5ded2c3da533" />

11. Menu menambahkan data obat baru ke dalam daftar obat

    Pada blok case 2, program meminta pengguna untuk menginput beberapa informasi terkait obat, yaitu nama, kategori, tanggal kadaluarsa, stok, dan harga. Input ini diambil melalui objek scanner. Setelah semua data berhasil diinput, program membuat objek baru dari kelas obat dengan menggunakan konstruktor yang menerima parameter sesuai data yang dimasukkan. Objek obat tersebut kemudian ditambahkan ke dalam daftarObat dengan perintah daftarObat.add(). Setelah proses berhasil, program akan menampilkan pesan "Obat berhasil ditambahkan!". Jadi, bagian kode ini berfungsi sebagai menu input data obat baru agar dapat tersimpan dalam daftar untuk ditampilkan pada menu sebelumnya.

    <img width="646" height="472" alt="image" src="https://github.com/user-attachments/assets/97adac97-5852-4481-a6c5-3d64ce8e0e24" />

12. Menu mengubah data obat

    Pada potongan kode ini, program menangani pilihan menu untuk mengubah data obat. Pertama-tama, program akan memeriksa apakah daftar obat kosong atau tidak. Jika tidak kosong, pengguna diminta untuk memasukkan nomor obat yang ingin diubah. Setelah itu, program akan mengambil objek obat berdasarkan nomor yang dimasukkan (dengan penyesuaian indeks karena dimulai dari 1). Kemudian, program akan menampilkan data lama dan meminta input baru untuk nama, kategori, stok, dan harga. Setiap input yang tidak kosong akan digunakan untuk memperbarui data obat tersebut. Jika input dibiarkan kosong, maka data lama akan tetap dipertahankan. Setelah semua proses selesai, program akan menampilkan pesan bahwa data berhasil diubah. Jika nomor obat yang dimasukkan tidak valid, akan ditampilkan pesan kesalahan.

    <img width="624" height="874" alt="Screenshot 2025-09-08 232605" src="https://github.com/user-attachments/assets/dbe42dfc-5d4a-452e-a559-ea8189ca8c71" />

    <img width="503" height="395" alt="Screenshot 2025-09-08 232637" src="https://github.com/user-attachments/assets/74686237-c62f-4579-bc92-3d8f9820365a" />

13. Menghapus data obat

    Kode pada gambar ini digunakan untuk menghapus data obat dari daftar. Program akan memeriksa apakah daftar obat kosong. Jika tidak, pengguna akan diminta untuk memasukkan nomor obat yang ingin dihapus. Program kemudian memvalidasi apakah nomor tersebut berada dalam rentang indeks yang tersedia. Jika valid, data obat akan dihapus dari daftar dan ditampilkan pesan bahwa obat berhasil dihapus. Jika tidak valid, maka akan ditampilkan pesan kesalahan bahwa nomor obat tidak valid.

    <img width="629" height="477" alt="Screenshot 2025-09-08 232701" src="https://github.com/user-attachments/assets/2d001434-6141-4244-9873-bffac547d7c2" />

14. Keluar program dan Penanganan Input Tidak Valid

    Potongan kode terakhir ini menangani dua hal, yaitu keluar dari program (case 5) dan penanganan input menu yang tidak valid (default). Pada case 5, program akan menampilkan pesan terima kasih kepada pengguna dan menyatakan bahwa program telah selesai. Sementara itu, jika input pengguna tidak sesuai dengan pilihan menu yang ada, maka program akan menampilkan pesan bahwa pilihan tidak valid dan meminta pengguna untuk menginput ulang. Terakhir, scanner ditutup dan program berhenti ketika pilihan adalah angka 5.

    <img width="826" height="414" alt="Screenshot 2025-09-08 232727" src="https://github.com/user-attachments/assets/c371f047-207d-41fe-a482-51e9db2eb421" />

# `B. Penjelasan Output`








