lazy val root = (project in file(".")).
  settings(
    name := "sprayWebsocketSample",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http-experimental" % "2.4.6"
    )
  )
