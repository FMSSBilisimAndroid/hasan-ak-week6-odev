


https://user-images.githubusercontent.com/96025300/193469112-790f2a86-ff83-4dac-b8ac-0c2929432d20.mp4




# Sonuçlar
### 1. Döngü kilitlenmeye sebep olacak mı ?
* **Evet UI kilitlendi.**
* Yukarıdaki videodada görüldüğü üzere UI bir türlü açılamıyor.
### 2. Kilitlenmeye sebep olmadan  aşağıdaki blok çalışır mı ?
* **Hayır coroutineScope çalışmaz**
* Çünkü Logcatte SECOUND tag döngünün devam ettiğini 
  gösteriyor,PATIKA tag ise logcatte düşmüyor nedeni **MainThread döngü ile meşgul
  döngü kırılamadığı sürece coroutineScope çalışmayacaktır**
