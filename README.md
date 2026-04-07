# Vibe Java - Spring Boot 3 & Java 21 🚀

Selamat datang di **Vibe Java**, sebuah proyek inisialisasi Spring Boot modern yang dirancang untuk kecepatan pengembangan (*Vibe Coding*) dengan standar arsitektur kelas produksi.

Proyek ini menggunakan **Java 21** dan **Spring Boot 3.4.x**, mengintegrasikan database relasional, migrasi skema otomatis, dokumentasi API, dan komunikasi antar layanan secara deklaratif.

---

## ✨ Fitur Utama

- **Inisialisasi Cepat**: Struktur proyek yang rapi dan siap pakai dengan arsitektur berlapis (Controller-Service-Repository).
- **Automated API Documentation**: Dokumentasi OpenAPI 3 yang interaktif dan *always up-to-date*.
- **Database Versioning**: Manajemen perubahan skema database yang aman dengan Liquibase.
- **Declarative REST Client**: Integrasi API eksternal yang bersih menggunakan OpenFeign.
- **Robust Exception Handling**: Penanganan error terpusat untuk response API yang konsisten.
- **Configuration Properties**: Pengelolaan konfigurasi aplikasi yang fleksibel dan dinamis.

---

## 🛠️ Tech Stack

Kombinasi teknologi terbaik untuk skalabilitas dan efisiensi:

| Kategori | Teknologi |
| :--- | :--- |
| **Bahasa & Framework** | Java 21, Spring Boot 3.4 |
| **Database** | PostgreSQL |
| **Database Migration** | Liquibase |
| **Persistence** | Spring Data JPA (Hibernate) |
| **API Documentation** | SpringDoc OpenAPI (Swagger UI) |
| **External Client** | Spring Cloud OpenFeign |
| **Utilities** | Project Lombok, Bean Validation (JSR-303) |

---

## 🚀 Cara Menjalankan Proyek

Ikuti langkah-langkah di bawah ini untuk memulai pengembangan di lingkungan lokal Anda.

### 1. Prasyarat
- **Java 21** terinstal (rekomendasi: SDKMAN! atau Oracle/OpenJDK).
- **Maven 3.x** terinstal (atau gunakan `./mvnw` yang sudah tersedia).
- **PostgreSQL** berjalan di port default `5432`.

### 2. Persiapan Database
Buat database baru di PostgreSQL dengan nama `vibe_db`:
```sql
CREATE DATABASE vibe_db;
```

### 3. Konfigurasi
Periksa file `src/main/resources/application.properties` dan pastikan kredensial database Anda sesuai:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/vibe_db
spring.datasource.username=postgres
spring.datasource.password=Youtap@2025!
```

### 4. Menjalankan Aplikasi
Gunakan Maven Wrapper untuk menjalankan aplikasi langsung dari terminal:
```bash
./mvnw spring-boot:run
```

Aplikasi akan berjalan di port **8080** secara default.

---

## 📚 Akses Dokumentasi API

Setelah aplikasi berjalan, Anda dapat mengakses Swagger UI untuk mencoba API secara langsung:

🔗 **Swagger UI**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)  
🔗 **OpenAPI JSON**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

---

## 🧪 Pengujian
Untuk menjalankan unit test dan integrasi test:
```bash
./mvnw test
```

---

## 📝 Catatan Tambahan
Proyek ini dikembangkan dengan pendekatan **Vibe Coding**, di mana fokus utama adalah pada *intent* dan logika bisnis, sementara detail teknis ditangani secara efisien melalui bantuan AI.

Dibuat dengan ❤️ oleh [Gandhi](https://github.com/gandhi-wibowo).
