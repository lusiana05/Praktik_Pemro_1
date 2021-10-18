print("------------------------------------------------------")
print("                Latihan Operator Java                 ")
print("------------------------------------------------------")
print("Masukkan nilai a:")
a = input("Masukan nilai a = ")
b = input("Masukan nilai b = ")
c = input("Masukan nilai c = ")
d = input("Masukan nilai d = ")
e = input("Masukan nilai e = ")
hasil1 = a + b
hasil2 = a - b
hasil3 = a / b
hasil4 = a % b
hasil5 = a * b + c * d % e
hasil6 = a % b + c / d % e - a % (b % c)
hasil7 = a + b + c + d + e * d + c + (b + a)

print("                     Chapter 1                          ")
print("Hasil dari a + b adalah " + hasil1)
print("Hasil dari a - b adalah " + hasil2)
print("Hasil dari a / b adalah " + hasil3)
print("Hasil dari a % b adalah " + hasil4)

print("                     Chapter 2                          ")
print("Hasil dari a * b + c * d % e adalah " + hasil5)
print("Hasil dari a % b + c / d % e - a % (b % c) adalah " + hasil6)
print("Hasil dari a + b + c + d + e * d + c + (b + a) adalah " + hasil7)