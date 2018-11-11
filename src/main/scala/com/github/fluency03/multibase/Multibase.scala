package com.github.fluency03.multibase

object Multibase {

  def encode(base: Base, data: Array[Byte]): String = base.code + {
    base match {
      case Base.Base1 => throw new UnsupportedOperationException("Base1 is not supported yet!")
      case Base.Identity => Identity.encode(data)
      case Base.Base16 => Base16.encode(data)
      case Base.Base16Upper => Base16Upper.encode(data)
      case _ => BaseN.encode(base, data)
    }
  }

  def encodeString(base: Base, data: String): String = encode(base, data.getBytes())

  def decode(data: String): Array[Byte] = {
    val baseOpt = Base.codes.get(data.charAt(0))
    if (baseOpt.isEmpty) {
      throw new IllegalArgumentException("Cannot get Multibase type from input: " + data)
    }

    val base = baseOpt.get
    val rest = data.substring(1)

    base match {
      case Base.Base1 => throw new UnsupportedOperationException("Base1 is not supported yet!")
      case Base.Identity => Identity.decode(rest)
      case Base.Base16 => Base16.decode(rest)
      case Base.Base16Upper => Base16Upper.decode(rest)
      case _ => BaseN.decode(base, rest)
    }
  }

  def decodeToString(data: String): String = decode(data).map(_.toChar).mkString

}
