package com.github.fluency03.multibase

object Base16Impl {

  def encode(data: Array[Byte]): String = data.map("%02x".format(_)).mkString

  def decode(data: String): Array[Byte] = data.sliding(2, 2).toArray.map(Integer.parseInt(_, 16).toByte)

}
