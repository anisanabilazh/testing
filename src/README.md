Program ini menyambut pemain dengan teks bertema Halloween: "SELAMAT DATANG DI PETUALANGAN HALLOWEEN".
Setelah itu, program meminta pemain memilih salah satu dari dua pilihan utama, yaitu "masuk" atau "balik".
Program ini ditulis dalam kelas AfterStarGame.
Program menggunakan metode print() yang khusus untuk menampilkan teks ke layar. Hal ini mengurangi pengulangan System.out.println() dan membuat kode lebih mudah dibaca.
Setiap blok tindakan utama dipecah menjadi metode-metode khusus: enterHauntedHouse(), turnBack(), dan invalidChoice(), yang membuat struktur program lebih modular dan mudah dipahami.
Alur dari program ini Program menerima input dari pengguna untuk menentukan langkah-langkah yang akan diambil dalam petualangan.
Pilihan utama pemain adalah:
"masuk" - Pemain memasuki rumah berhantu dan dihadapkan pada dua pilihan tambahan.
"balik" - Pemain memutuskan untuk berbalik dan juga dihadapkan pada dua pilihan tambahan.
Jika pemain mengetik sesuatu selain "masuk" atau "balik", program akan memanggil metode invalidChoice() untuk memberikan pesan bahwa pilihan tidak valid.
Detail Tiap Pilihan Tindakan:
enterHauntedHouse():
Menyediakan dua pilihan tambahan bagi pemain:
"1" - Mendekati bayangan: Memicu metode approachShadow(), yang menampilkan pesan seolah pemain mendekati bayangan dengan jantung berdebar.
"2" - Bersembunyi di balik meja: Memicu metode hideUnderTable(), yang memberikan pesan bahwa pemain bersembunyi di balik meja.
turnBack():
Menyediakan dua pilihan tambahan:
"1" - Berlari lebih cepat: Memicu metode runFaster(), yang menampilkan pesan bahwa pemain berlari sekuat tenaga.
"2" - Bersembunyi di balik pohon: Memicu metode hideBehindTree(), yang memberikan pesan bahwa pemain bersembunyi di balik pohon.
Jadi program ini didesain untuk memberi pemain sensasi petualangan singkat dengan suasana Halloween.