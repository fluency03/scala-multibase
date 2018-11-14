package com.github.fluency03.multibase

import com.github.fluency03.multibase.Base._

object Multibase {

  def encode(base: Base, data: Array[Byte]): String = base.code + {
    base match {
      case Base1 => throw new UnsupportedOperationException("Base1 is not supported yet!")
      case Identity => IdentityImpl.encode(data)
      case Base16 => Base16Impl.encode(data, Base16)
      case Base16Upper => Base16Impl.encode(data, Base16Upper)
      case Base32 => Base32Impl.encode(data, Base32)
      case Base32Upper => Base32Impl.encode(data, Base32Upper)
      case Base32Pad => Base32Impl.encode(data, Base32Pad)
      case Base32PadUpper => Base32Impl.encode(data, Base32PadUpper)
      case Base32Hex => Base32Impl.encode(data, Base32Hex)
      case Base32HexUpper => Base32Impl.encode(data, Base32HexUpper)
      case Base32HexPad => Base32Impl.encode(data, Base32HexPad)
      case Base32HexPadUpper => Base32Impl.encode(data, Base32HexPadUpper)
      case Base64 => Base64Impl.encode(data, Base64)
      case Base64Pad => Base64Impl.encode(data, Base64Pad)
      case Base64URL => Base64Impl.encode(data, Base64URL)
      case Base64URLPad => Base64Impl.encode(data, Base64URLPad)
      case _ => BaseNImpl.encode(base, data)
    }
  }

  def encodeString(base: Base, data: String): String = encode(base, data.getBytes)

  def decode(data: String): Array[Byte] = {
    val baseOpt = Base.Codes.get(data.charAt(0))
    if (baseOpt.isEmpty) {
      throw new IllegalArgumentException("Cannot get Multibase type from input data: " + data)
    }

    val base = baseOpt.get
    val rest = data.substring(1)
    if (rest.isEmpty) Array[Byte]()
    else base match {
      case Base1 => throw new UnsupportedOperationException("Base1 is not supported yet!")
      case Identity => IdentityImpl.decode(rest)
      case Base16 => Base16Impl.decode(rest, Base16)
      case Base16Upper => Base16Impl.decode(rest, Base16Upper)
      case Base32 => Base32Impl.decode(rest, Base32)
      case Base32Upper => Base32Impl.decode(rest, Base32Upper)
      case Base32Pad => Base32Impl.decode(rest, Base32Pad)
      case Base32PadUpper => Base32Impl.decode(rest, Base32PadUpper)
      case Base32Hex => Base32Impl.decode(rest, Base32Hex)
      case Base32HexUpper => Base32Impl.decode(rest, Base32HexUpper)
      case Base32HexPad => Base32Impl.decode(rest, Base32HexPad)
      case Base32HexPadUpper => Base32Impl.decode(rest, Base32HexPadUpper)
      case Base64 => Base64Impl.decode(rest, Base64)
      case Base64Pad => Base64Impl.decode(rest, Base64Pad)
      case Base64URL => Base64Impl.decode(rest, Base64URL)
      case Base64URLPad => Base64Impl.decode(rest, Base64URLPad)
      case _ => BaseNImpl.decode(base, rest)
    }
  }

  def decodeToString(data: String): String = new String(decode(data))

}
