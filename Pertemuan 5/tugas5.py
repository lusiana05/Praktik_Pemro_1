print("Selamat Datang di Sistem Informasi Akademik UNY!")
print("Silakan masukkan nama lengkap, NIM, dan IPK")

namaLengkap = input("Masukkan nama lengkap Anda: ")
NIM = input("Masukkan NIM Anda : ")
ipk = input("Masukkan IPK Anda: ")
lamaStudi = input("Masukkan lama studi (dalam tahun): ")

print("------------------------------------------------------")
print("     Pengumuman Hasil Capaian Studi Mahasiswa UNY     ")
print("------------------------------------------------------")
print("Nama lengkap : " + namaLengkap)
print("NIM : " + NIM)
print("IPK  : " + ipk)
print("Lama studi : " + lamaStudi)

if (ipk >= 3.51 and ipk <= 4.00 and lamaStudi <= 4):
    print("Selamat atas kelulusan Anda dengan predikat Summa Cumlaude!")
elif (ipk >= 3.51 and ipk < 4.00):
    print("Selamat atas kelulusan Anda dengan predikat Cumlaude!")
elif (ipk >= 3.01 and ipk < 3.51):
    print("Selamat atas kelulusan Anda dengan predikat Sangat Memuaskan!")
elif (ipk >= 2.76 and ipk < 3.01):
    print("Selamat atas kelulusan Anda dengan predikat Memuaskan!")
elif (ipk >= 2.00 and ipk < 2.76):
    print("Selamat atas kelulusan Anda dengan predikat Cukup!")
elif (ipk < 2.00):
    print("Kami ucapkan permohonan maaf karena Anda dinyatakan Tidak Lulus")
    print("Tetap semangat dan jangan putus asa!")
else:
    print("Tidak Valid. Mohon cek dan masukkan data Anda dengan benar")

print("Terima kasih. Semoga hari Anda menyenangkan!")