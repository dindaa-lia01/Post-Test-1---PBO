# Post Test 1 - PBO

Nama: Dinda Aulia Rizky NIM: 2409116076 Kelas: B

# ***Program Manajemen Obat di Apotek***

# `A. Penjelasan Baris Kode`

Kode package com.mycompany.manajemenapotek; digunakan untuk menentukan bahwa file Java ini berada dalam sebuah package bernama com.mycompany.manajemenapotek. Package berfungsi untuk mengelompokkan kelas agar lebih terorganisir dan memudahkan pengelolaan program dalam skala besar.

<img width="412" height="26" alt="Screenshot 2025-09-08 224336" src="https://github.com/user-attachments/assets/8f56e05e-2be5-4391-9faf-e036221261cc" />

Bagian import java.util.ArrayList; dan import java.util.Scanner; berfungsi untuk mengimpor library bawaan Java. ArrayList digunakan untuk menyimpan data dalam bentuk list dinamis, sedangkan Scanner digunakan untuk menerima input dari pengguna melalui console.

<img width="230" height="65" alt="Screenshot 2025-09-08 224541" src="https://github.com/user-attachments/assets/f41cfece-c6c4-4b65-b7de-3d78e1596ded" />

Di dalam kelas utama main, terdapat kelas statis obat yang merepresentasikan objek obat. Kelas ini memiliki beberapa atribut, yaitu namaObat, kategori, expiredDate, stok, dan harga. Atribut ini digunakan untuk menyimpan informasi detail mengenai obat di apotek.

<img width="266" height="260" alt="Screenshot 2025-09-08 225212" src="https://github.com/user-attachments/assets/73dd9047-c30a-44a4-a4de-981beb0821a9" />

Constructor public obat(...) digunakan untuk memberikan nilai awal pada atribut-atribut kelas obat ketika objek baru dibuat. Dengan constructor ini, setiap kali membuat objek obat baru, pengguna dapat langsung mengisi nama, kategori, tanggal kadaluarsa, jumlah stok, dan harga.

<img width="814" height="223" alt="Screenshot 2025-09-08 225234" src="https://github.com/user-attachments/assets/20fee4bd-e199-4a6e-8450-123179517536" />

Method tampilkanObat() digunakan untuk menampilkan informasi detail dari setiap objek obat yang sudah dibuat. Method ini akan mencetak nama obat, kategori, expired date, stok, dan harga ke layar, sehingga memudahkan pengguna dalam melihat daftar obat yang tersedia.

<img width="528" height="258" alt="Screenshot 2025-09-08 225250" src="https://github.com/user-attachments/assets/f0b6813d-549e-4889-af2b-6eb4ea812481" />

Foto 6 (main method – scanner & arraylist)
Pada bagian public static void main, dibuat objek Scanner untuk membaca input dari pengguna, serta ArrayList<obat> daftarObat yang digunakan untuk menyimpan kumpulan objek obat. Dengan ArrayList, data obat dapat ditambah, dihapus, atau diperbarui secara dinamis.

<img width="492" height="98" alt="Screenshot 2025-09-08 225340" src="https://github.com/user-attachments/assets/3c07c7b0-4016-45fb-acc2-e0c971aa6ff2" />

Kode ini membuat beberapa objek obat (obat1, obat2, obat3, obat4) dengan data masing-masing, seperti nama, kategori, tanggal expired, stok, dan harga. Setelah itu, objek-objek tersebut ditambahkan ke dalam daftarObat agar bisa dikelola secara kolektif.

<img width="711" height="284" alt="Screenshot 2025-09-08 225357" src="https://github.com/user-attachments/assets/631d207b-37d5-40a9-9527-edd697958004" />

Bagian ini menampilkan menu interaktif di console yang memberikan opsi kepada pengguna, seperti menampilkan daftar obat, menambah obat baru, memperbarui stok, menghapus daftar, atau keluar dari program. Menu ini menjadi inti dari sistem manajemen apotek berbasis teks.

<img width="737" height="288" alt="Screenshot 2025-09-08 225425" src="https://github.com/user-attachments/assets/0a6d695b-bc78-481b-b4aa-63ef0b8425b1" />

Kode pilihan = scanner.nextInt(); digunakan untuk membaca input angka yang dimasukkan pengguna sebagai pilihan menu. Setelah itu, scanner.nextLine(); dipakai untuk membersihkan buffer input agar tidak terjadi error saat membaca input berikutnya.

<img width="274" height="101" alt="Screenshot 2025-09-08 225437" src="https://github.com/user-attachments/assets/f02371f7-fa18-4e52-aec5-f24412767775" />

Pada blok case 1, program pertama-tama memeriksa apakah daftarObat masih kosong dengan perintah isEmpty(). Jika kosong, maka akan ditampilkan pesan "Obat belum tersedia.". Namun, jika terdapat data obat, program akan mencetak judul daftar obat, kemudian melakukan perulangan dengan for untuk menampilkan setiap data obat secara terurut berdasarkan indeksnya. Setiap objek obat akan ditampilkan dengan atribut yang meliputi nama obat, kategori, tanggal kadaluarsa, jumlah stok, serta harga. Dengan demikian, bagian kode ini memiliki fungsi utama sebagai menu untuk melihat daftar obat yang sudah dimasukkan ke dalam sistem.

<img width="854" height="560" alt="Screenshot 2025-09-08 225737" src="https://github.com/user-attachments/assets/29a412c1-8399-4405-a07c-5ded2c3da533" />

Pada blok case 2, program meminta pengguna untuk menginput beberapa informasi terkait obat, yaitu nama, kategori, tanggal kadaluarsa, stok, dan harga. Input ini diambil melalui objek scanner. Setelah semua data berhasil diinput, program membuat objek baru dari kelas obat dengan menggunakan konstruktor yang menerima parameter sesuai data yang dimasukkan. Objek obat tersebut kemudian ditambahkan ke dalam daftarObat dengan perintah daftarObat.add(). Setelah proses berhasil, program akan menampilkan pesan "Obat berhasil ditambahkan!". Jadi, bagian kode ini berfungsi sebagai menu input data obat baru agar dapat tersimpan dalam daftar untuk ditampilkan pada menu sebelumnya.

<img width="646" height="472" alt="image" src="https://github.com/user-attachments/assets/97adac97-5852-4481-a6c5-3d64ce8e0e24" />






