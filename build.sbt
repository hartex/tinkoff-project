lazy val commonSettings = Seq(
  name := "tinkoff-assignment",
  version := "0.1-SNAPSHOT",
  organization := "me.hartex",
  scalaVersion := "2.13.1",
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-Ywarn-unused:-implicits",
    "-Xlint")
)

lazy val app = project
  .in(file("."))
  .settings(
    libraryDependencies ++= Dependencies.db ++ Dependencies.testing
  ).settings(commonSettings: _*)