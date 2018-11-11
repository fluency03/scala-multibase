name := "scala-multibase"

version := "0.0.1"

organization := "com.github.fluency03"

scalaVersion := "2.12.7"

val scalaTestVersion = "3.0.5"

val testDependencies = Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test
)

libraryDependencies ++= testDependencies

// Maven settings
publishMavenStyle := true

publishArtifact in Test := false

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("https://raw.githubusercontent.com/fluency03/scala-multibase/master/LICENSE"))

homepage := Some(url("https://github.com/fluency03/scala-multibase"))

pomExtra :=
  <scm>
    <url>git@github.com:fluency03/scala-multibase.git</url>
    <connection>scm:git:git@github.com:fluency03/scala-multibase.git</connection>
  </scm>
  <developers>
    <developer>
      <id>fluency03</id>
      <name>fluency03</name>
      <url>https://github.com/fluency03</url>
    </developer>
  </developers>
