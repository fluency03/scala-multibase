package com.github.fluency03.multibase

object IdentityImpl {

  def encode(data: Array[Byte]): String = data.map(_.toChar).mkString

  def decode(data: String): Array[Byte] = data.getBytes()

}