/*
    TODO 3
        - buatlah return berupa perhitungan perkalian antara a dan b
        - (0 pada return dihapus)
*/
// Tulis Code di function ini
fun calculator(a: Int, b: Int): Int {
    val hasil = a * b
    return if (hasil == 0) {

        1 // Misalnya, mengembalikan 1
    } else {
        hasil
    }
}