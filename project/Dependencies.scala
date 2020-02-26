import sbt._

object Dependencies {
  lazy val doobieVersion = "0.8.8"
  lazy val scalatestVersion = "3.1.1"

  lazy val testing = Seq(
    "org.scalactic" %% "scalactic" % scalatestVersion,
    "org.scalatest" %% "scalatest" % scalatestVersion % "test",
    "org.tpolecat" %% "doobie-scalatest" % doobieVersion % "test" // ScalaTest support for typechecking statements.
  )

  lazy val doobie = Seq(
    "org.tpolecat" %% "doobie-core" % doobieVersion,
    "org.tpolecat" %% "doobie-hikari" % doobieVersion, // HikariCP transactor.
    "org.tpolecat" %% "doobie-postgres" % doobieVersion, // Postgres driver 42.2.9 + type mappings.
  )

  lazy val db = Seq(
    "org.flywaydb" % "flyway-core" % "6.2.4"
  ) ++ doobie

}