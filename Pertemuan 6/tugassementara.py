print("Selamat Datang di Siakad UNY!")
print(".: Program Siakad :.")
print("1. Tambah Data ")
print("2. Edit Data")
print("3. Hapus Data ")
print("4. Lihat Data")
menuI = input("Menu yang ada pilih: ")
menuI = int(menuI)
if (menuI == 1) :
    print("----- Tambah Data -----")
    print("1. Tambah Data Mahasiswa")
    print("2. Tambah Data Mata Kuliah")
    print("3. Kembali")
    menuI2 = input("Menu yang ada pilih: ")
    menuI2 = int (menuI2)
    if (menuI2 == 1):
        namaMahasiswa = input("Masukkan nama mahasiswa: ")
        print("Mahasiswa yang Anda tambah adalah " + namaMahasiswa)
    elif (menuI2 ==2):
        mataKuliah = input("Masukkan mata kuliah: ")
        print("Mata kuliah yang Anda tambah adalah " + mataKuliah)
    elif (menuI2 == 3):
        print("Terima kasih")
    else:
        print("Menu tidak ada")
elif (int(menuI) >= 2 and int(menuI)<= 4):
    print("Fitur belum ada")
else:
    print("Menu belum tersedia")