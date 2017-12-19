// Comment to get more information during initialization
logLevel := Level.Warn
// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
//
scalaVersion := "2.10.6"
//
addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

