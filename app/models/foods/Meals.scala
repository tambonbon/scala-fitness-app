package models.foods

import play.api.libs.json.Format
import play.api.libs.json.Reads
import play.api.libs.json.Json
import play.api.libs.json.{JsResult, JsValue}
import play.api.libs.json.Writes

class Meals extends Enumeration {
    type Meals = Value
    val BREAKFAST, LUNCH, DINNER = Value

    implicit val mealFormat: Format[Meals] = Json.formatEnum(this)

    implicit val mealRead: Reads[Meals]= ???

    implicit val mealWrite: Writes[Meals] = ???
    // def unapply(meal: Meals) = ???
}

object Meals {

    def apply(meals: Meals) = ???

    // implicit val mealWrites = Json.writes[Meals]
}
