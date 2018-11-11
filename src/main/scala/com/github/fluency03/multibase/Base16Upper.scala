package com.github.fluency03.multibase

object Base16Upper {

  def encode(data: Array[Byte]): String = data.map("%02X".format(_)).mkString

  def decode(data: String): Array[Byte] = BigInt(data, 16).toByteArray

}
