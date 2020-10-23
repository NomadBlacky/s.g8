ThisBuild / scalaVersion := "2.13.3"
ThisBuild / organization := "dev.nomadblacky"
ThisBuild / organizationName := "NomadBlacky"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest-funspec" % "3.2.2" % Test
    )
  )