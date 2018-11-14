name := "scala-multibase"

version := "0.0.1"

organization := "com.github.fluency03"
organizationName := "fluency03"
organizationHomepage := Some(url("https://github.com/fluency03"))

scalaVersion := "2.12.7"

val scalaTestVersion = "3.0.5"

val testDependencies = Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test
)

libraryDependencies ++= testDependencies

sonatypeProfileName := "com.github.fluency03"

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

scmInfo := Some(
  ScmInfo(
    url("https://github.com/fluency03/scala-multibase"),
    "scm:git@github.com:fluency03/scala-multibase.git"
  )
)

developers := List(
  Developer(
    id  = "fluency03",
    name = "Chang Liu",
    email = "fluency.03@gmail.com",
    url = url("https://github.com/fluency03")
  )
)

description := "Scala Implementation of Multibase."

licenses := Seq("MIT" -> url("https://raw.githubusercontent.com/fluency03/scala-multibase/master/LICENSE"))

homepage := Some(url("https://github.com/fluency03/scala-multibase"))

pomIncludeRepository := { _ => false }
