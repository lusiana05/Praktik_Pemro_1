umur = input("printMasukkan umur Anda: ")
umur = int(umur)
if (umur >=0 and umur <=5):
    print("Anda masih balita ")
    print("Masukkan umur orang tua Anda: ")
    umur_orangtua = input("Masukkan umur orang tua Anda: ")
    if (int(umur_orangtua)< 15):
        print("Sebaiknya orang tua perlu pengasuh anak")
    else:
        print("Orang tua bisa mengasuh anak sendiri")
elif (umur > 5 and umur <= 19):
    print("Anda sudah remaja")
else:
    print("Umur Anda tidak valid")