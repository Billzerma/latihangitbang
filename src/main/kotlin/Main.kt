fun main() {
    /*
    TODO 1
        Buatlah variable dengan ketentuan berikut :
        - Variable dapat diubah sewaktu-waktu
        - Variable memiliki Identifier berupa myName
        - Variable memiliki tipe data berupa String
        - Variable memiliki Initialization berupa nama panggilan kamu
    */
    // Tulis Code dibawah ini
    var myName: String ="Nabil"
    println("nama panggilan saya "+myName)


    /*
    TODO 2
        Ubah Initialization pada varible myName diatas menjadi Nama Lengkap kamu
     */
    // Tulis Code dibawah ini
    myName="Nabil Zerma Maulana"
    println("nama lengkap saya "+myName)

    /*
    TODO 4
        Buatlah Array dengan ketentuan berikut :
        - variabel Array bernama mobileMentors
        - Array berisi tipe data String
        - Index pada Array berisi ["Reza Kurniawan", "Raihan Zhaky", "Reynaldi", "Nabila Putri Syafarina Bukka", "Rahmad Noor Ikhsan"]
        - Ubah index yang berisi "Raihan Zhaky" pada Array menjadi "Raihan Zhaky Al-Hafizh"
        - Tampilkan index yang berisi "Raihan Zhaky Al-Hafizh"
    */
    // Tulis Code dibawah ini

    val mobileMentors= arrayOf<String>("Reza Kurniawan", "Raihan Zhaky", "Reynaldi", "Nabila Putri Syafarina Bukka", "Rahmad Noor Ikhsan")
    mobileMentors.set(1, "Raihan Zhaky Al-Hafizh")

    println(mobileMentors[1])

    println("hasil kalkulator: "+calculator(200, 150))


    println("hasil ekpedisi: "+expedition(20))
}