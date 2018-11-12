package com.github.fluency03.multibase

import com.github.fluency03.multibase.Base._

object Multibase {

  def encode(base: Base, data: Array[Byte]): String = base.code + {
    base match {
      case Base1 => throw new UnsupportedOperationException("Base1 is not supported yet!")
      case Identity => IdentityImpl.encode(data)
      case Base16 => Base16Impl.encodeToLower(data)
      case Base16Upper => Base16Impl.encodeToUpper(data)
      case _ => BaseN.encode(base, data)
    }
  }

  def encodeString(base: Base, data: String): String = encode(base, data.toCharArray.map(_.toByte))

  def decode(data: String): Array[Byte] = {
    val baseOpt = Base.codes.get(data.charAt(0))
    if (baseOpt.isEmpty) {
      throw new IllegalArgumentException("Cannot get Multibase type from input data: " + data)
    }

    val base = baseOpt.get
    val rest = data.substring(1)
    if (rest.isEmpty) Array[Byte]()
    else base match {
      case Base1 => throw new UnsupportedOperationException("Base1 is not supported yet!")
      case Identity => IdentityImpl.decode(rest)
      case Base16 => Base16Impl.decode(rest)
      case Base16Upper => Base16Impl.decode(rest)
      case _ => BaseN.decode(base, rest)
    }
  }

  def decodeToString(data: String): String = decode(data).map(_.toChar).mkString

}
