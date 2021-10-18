umur = input("Masukkan umur Anda = ")
umur = int(umur)
if (umur >= 0 and umur <= 5):
    print("Anda masih balita")
elif(umur > 5 and umur <= 19):
    print("Anda masih remaja")
else:
    print("Umur Anda tidak valid")