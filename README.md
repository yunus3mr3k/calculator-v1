# 🧮 Calculator V1 - JavaFX Masaüstü Uygulaması

JavaFX ile geliştirilmiş, modern ve kullanışlı bir masaüstü hesap makinesi uygulaması.

## 📌 Özellikler

✅ **Temel Hesap İşlemleri**
- Toplama (+)
- Çıkarma (-)
- Çarpma (x)
- Bölme (/)

✅ **Kullanıcı Dostu Arayüz**
- Temiz ve modern tasarım
- Büyük ve kolay okunabilir ekran
- Responsive düğme yerleşimi

✅ **Hata Yönetimi**
- Sıfıra bölme koruması
- Hata mesajı görüntüleme
- Ekranı temizleme özelliği

---

## 🛠️ Kullanılan Teknolojiler

- **Java**
- **JavaFX**
- **FXML** ile UI tasarımı

---

## ⚙️ Kurulum ve Gereksinimler

### 1️⃣ Ön Gereksinimler
- Java Geliştirme Kiti (JDK) 17+
- JavaFX SDK

---

## 🚀 Uygulamayı Çalıştırma

### Terminal ile Çalıştırma
```bash
javac -d out --module-path "javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml src/com/example/calculator_v1/*.java
java --module-path "javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml -cp out com.example.calculator_v1.App
```

### IDE ile Çalıştırma
1. IntelliJ IDEA, Eclipse veya VS Code'da açın
2. `App.java` dosyasını çalıştırın

---

## 📸 Ekran Görüntüsü

### **Hesap Makinesi Arayüzü**
![image](https://github.com/user-attachments/assets/9c61a651-f798-48cb-8766-84a76d39dba3)



---

## 🔧 Teknik Detaylar

- **Tasarım**: Modern, responsive JavaFX arayüzü
- **Renk Şeması**: 
  - Yeşil arka plan
  - Turuncu sayı düğmeleri
  - Mavi işlem düğmeleri
- **Hata Yönetimi**: 
  - Sıfıra bölme durumunda "Tanımsız" görüntüler
  - Geçersiz girişler için hata mesajları gösterir

---

## 🚧 Gelecek Geliştirmeler

- Ondalık sayı desteği
- Hafıza fonksiyonları
- Daha gelişmiş matematiksel işlemler
- Klavye girişi desteği

---

## 📜 Lisans

Öğrenme ve eğitim amaçlı açık kaynak projesi.

## 👨‍💻 Geliştirici

JavaFX öğrenme projesi olarak oluşturulmuştur
