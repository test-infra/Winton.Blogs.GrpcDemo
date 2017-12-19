// Comment to get more information during initialization
logLevel := Level.Warn

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")

// addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

