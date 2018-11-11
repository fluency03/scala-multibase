name := "scala-multibase"

version := "0.0.1"

organization := "com.github.fluency03"

scalaVersion := "2.12.7"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

//publishTo := {
//  val nexus = "https://oss.sonatype.org/"
//  if (isSnapshot.value) {
//    Some("snapshot" at nexus + "content/repositories/snapshots")
//  } else {
//    Some("releases" at nexus + "service/local/staging/deploy/maven2/")
//  }
//}


