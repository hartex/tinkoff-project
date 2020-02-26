package me.hartex.tinkoff

import org.flywaydb.core.Flyway

import scala.util.Try

object Main {
  def main(args: Array[String]): Unit = {
    println("hello")
  }

  private def migrateSchema(): Try[Int] = {
    val url = ""
    val user = ""
    val password = ""
    val flyway = Flyway.configure.dataSource(url, user, password).load
    Try(flyway.migrate)
  }
}