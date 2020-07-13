package controllers

import javax.inject._
import play.api.mvc._
import models.Barang

@Singleton
class BarangController @Inject() (
    val controllerComponents: ControllerComponents
) extends BaseController {
  def barang = Action { implicit request: Request[AnyContent] =>
    val barangBarang = Barang.tampilBarang

    Ok(views.html.barang(barangBarang))
  }
}
