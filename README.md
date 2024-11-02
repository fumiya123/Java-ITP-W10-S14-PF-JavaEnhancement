# Java-ITP-W10-S14-PF-JavaEnhancement

Kelas Introduction to Programming / Week 10 / Session 14

### Penjelasan:
1. **List Declaration**:
   ``java
   List<String> list = new ArrayList<>() { ... };
   ``
   Di sini, kita membuat objek `ArrayList` yang merupakan **anonymous class**. Anonymous class adalah kelas tanpa nama yang dapat kita buat langsung saat menginisialisasi objek. Di dalam kurung kurawal `{ ... }`, kita menambahkan elemen `"Hello"` dan `"World"` ke dalam list.

2. **Diamond Operator (`<>`)**:
   Sebelum Java 9, kita harus menuliskan tipe data secara eksplisit, seperti `new ArrayList<String>()`. Namun, dengan diamond operator `<>`, Java secara otomatis akan menyimpulkan bahwa `ArrayList` ini berisi objek bertipe `String`, sehingga kita cukup menuliskan `new ArrayList<>()`.

3. **Menambahkan Elemen ke List**:
   Di dalam blok inisialisasi (yaitu, `{ ... }`), kita menambahkan elemen ke list menggunakan `add`. Blok ini bertindak seperti konstruktor untuk anonymous class, memungkinkan kita untuk mengisi list dengan nilai pada saat inisialisasi.

4. **Lambda Expression `list.forEach(System.out::println)`**:
   Metode `forEach` dari list akan menjalankan `System.out.println` untuk setiap elemen di dalam `list`. Jadi, setiap elemen (`"Hello"` dan `"World"`) akan dicetak ke layar.

Sekian.


Habib Azizul Haq  
(2702488253)
