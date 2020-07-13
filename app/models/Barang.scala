package models

case class Barang(
    id: Long,
    kode: String,
    img: String,
    kategori: Int,
    ket: String,
    status: String
)

object Barang {
  val barangBarang = Set(
    Barang(1, "VC-01", "hc-1.png", 2, "", "Tersedia"),
    Barang(2, "VC-01", "hc-1.png", 2, "", "Tersedia"),
    Barang(3, "VC-01", "hc-1.png", 2, "", "Tersedia"),
    Barang(4, "VC-01", "hc-1.png", 2, "", "Tersedia"),
    Barang(5, "DC-01", "dc-1.png", 1, "", "Tersedia")
  )

  def tampilBarang = barangBarang.toList.sortBy(_.id)
}
