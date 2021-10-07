# Kan Bağış Durumu
Kullanılan Dataset : https://archive.ics.uci.edu/ml/datasets/Blood+Transfusion+Service+Center

# ÖZET
Neuroph kitaplığınızdaki veri setini kullanarak, veri setimin %70'ini eğitim için ve %30'unu test için ayırdım. 
Sonra eğitim ve test yöntemlerini yazdım. Eğitimde her dönem için ayrı ayrı öğrendim. Ardından singleTest bölümünü ekledim. 
Bu bölümde normalizasyon için girilen girdileri normalize edilecek parametre olarak verdim. Grafikleri oluşturdum.

# GELİŞTİRİLEN YAZILIM 
Veri seti belirli kriterler göre insanların belirtilen tarihte kan verip, vermeme durumu incelemekte. Veri 
setini ilk indirdiğimde Recency (months),Frequency (times),Monetary (c.c. blood) ve sonuç 
bulunmaktaydı. 
Her kan alındığında 250 c.c. kan alındığı için Monetary alanı ile Frequency alanı sonucu hep aynı şekilde 
etkiledi yani korelasyonları eşitti ve Monetary alanını sildim. Bu durumda recency, frequency ve time 
olmak üzere üç girişim kaldı. 
İlk olarak data setimi txt dosyası olarak ödeve ekledim. Ardından YSA adında bir kurucu metot yazdım 
ve parametre olarak momentum, lambda, minError, epoch ve nöron sayısını verdim bu metotta gereken 
atamaları gerçekleştirdim. Neuroph kütüphanesi yardımı ile Blood.txt dosyandaki verileri bir data set 
içerisine atatım. Normalizasyon işlemini gerçekleştirdim.
Veri setimin %70’ini eğitim %30’unu test olamak üzere ayırdım.
Train metodunda ise MultiLayerPerceptron yardımın ile aktivasyon fonksiyonu sigmoid olan kendi data 
set değerlerime göre bir ağ oluşturdum. Burada Learn işlemini gerçekleştirdim. Ayrıca ek puan alabilmek 
için her bir epoch’ta öğrenme işleminide gerçekleştirdim. Hata değeri hesaplayıp metottu bitirdim.
Test metodunda ağın %30’u ile ağ test edilecek.
Mape hata hesabına göre hatayı hesaplamak için mape metodunu çağırır. Return kısmın /100 yaparak 
işlemi tamamlanır.
Çıktılarım 0 ve 1 olması gerektiği ve 0 bölünün olamayacağı için bölünen değer 1 kabul edilip hesaplanır. 
TekTest metodunda kullanıcıdan alınan değerler için bir dataSet oluşturdum içerisini kullanıcıdan aldığın 
değerleri atadım. Ve bu data set ile normalizasyonu gerçekleştirip return kısmında sonuç fonksiyonunu 
çağırdım bu fonksiyon çıkış 0 ise kan vermez, 1 ise kan verir olarak gönderdi.

# 10 farklı ağ tasarımı ve sonuçları
# 1.YSA
![1](https://user-images.githubusercontent.com/61979226/136314378-9cc004ed-21a7-4aac-86b0-b364cd6a72d7.png)

# 2.YSA
![2](https://user-images.githubusercontent.com/61979226/136314431-5a2b57c1-9190-4e22-8100-b286a1050711.png)

# 3.YSA
![3](https://user-images.githubusercontent.com/61979226/136314438-01e3ad04-ea07-4722-9e90-0abebc0a7bd2.png)

# 4.YSA
![4](https://user-images.githubusercontent.com/61979226/136314460-14c1e333-ee0e-4dfa-bab0-2ab82390a501.png)

# 5.YSA
![5](https://user-images.githubusercontent.com/61979226/136314461-5db2e6e7-86bf-4556-8164-505aaec9a836.png)

# 6.YSA
![6](https://user-images.githubusercontent.com/61979226/136314470-1fbf5783-3355-4db9-90c9-e8fb82149785.png)

# 7.YSA
![7](https://user-images.githubusercontent.com/61979226/136314490-26a37289-ac0b-44a9-b058-aa5e4a041485.png)

# 8.YSA
![8](https://user-images.githubusercontent.com/61979226/136314499-ee9bcb0b-4639-415b-b528-41633f51a9a3.png)

# 9.YSA
![9](https://user-images.githubusercontent.com/61979226/136314508-037fd59f-8ec6-4a89-bd32-49aed8ddc41c.png)

# 10.YSA
![10](https://user-images.githubusercontent.com/61979226/136314522-032b6352-f431-4752-9a1a-999b52fe413c.png)

# ÇIKTILAR :

![11](https://user-images.githubusercontent.com/61979226/136314571-c02b4ca8-723f-4df3-b780-3750ce3bcf94.png)


![12](https://user-images.githubusercontent.com/61979226/136314574-01dfd1d5-1a52-410d-9f14-f3cc7abbd72a.png)









