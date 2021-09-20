package models

import io.circe.generic.extras.Configuration
import io.circe.syntax._
import io.circe
import io.circe.parser
import io.circe.{Decoder, Encoder}

final case class Dish(name: String, description: String, price: Double)

object Dish {
    
    val dish = Dish("Ice cream", "Vanilla Icecream", 7)

    implicit val customConfig: Configuration =
      Configuration.default.withDiscriminator("type")

    implicit val encodeFieldType: Encoder[Dish] = 
        Encoder.forProduct3("name", "description", "price")(Dish.unapply(_).get)

    implicit val decodeFieldType: Decoder[Dish] = 
        Decoder.forProduct3("name", "description", "price")(Dish.apply)
    

    // serialize to json
    val serializedDish: String = dish.asJson.spaces2 // add 2 spaces before each key

    // deserialize from json
    val errorOrDish: Either[circe.Error, Dish] = parser.decode[Dish](
        """{
            | "name": "Eggs",
            | "description: "English muffin"
            | "price": 12
            |}"""
    )
}
