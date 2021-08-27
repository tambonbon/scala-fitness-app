lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """scala-fitness-app""",
    version := "1.0",
    organization := "io.github.tambonbon",
    maintainer := "tammy.nguyen@ordina.nl",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      guice,
      "com.typesafe.play" %% "play-slick" % "5.0.0",
      "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0",
      "com.h2database" % "h2" % "1.4.199",
      specs2 % Test,
      "com.typesafe.slick" %% "slick" % "3.3.3",
        "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
        "com.zaxxer" % "HikariCP" % "2.4.1",
//        evolutions,
//        ws,
//        "org.slf4j" % "slf4j-nop" % "1.6.4",
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
