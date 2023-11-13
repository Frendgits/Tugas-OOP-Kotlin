package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        print("Masukkan bilangan bulat: ")
        val userInput = readLine()
        val number = userInput?.toInt()

        println("Anda memasukkan bilangan bulat: $number")

    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    }
}
