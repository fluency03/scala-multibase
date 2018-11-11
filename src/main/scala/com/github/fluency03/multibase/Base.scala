package com.github.fluency03.multibase

sealed abstract class Base(val name: String, val code: Char, val alphabet: String, val size: Int)

object Base {
  case object Identity extends Base("identity", 0x00, "", 0)
  case object Base1 extends Base("base1", '1', "1", 1)
  case object Base2 extends Base("base2", '0', "01", 2)
  case object Base8 extends Base("base8", '7', "01234567", 8)
  case object Base10 extends Base("base10", '9', "0123456789", 10)
  case object Base16 extends Base("base16", 'f', "0123456789abcdef", 16)
  case object Base16Upper extends Base("base16upper", 'F', "0123456789ABCDEF", 16)
  case object Base32 extends Base("base32", 'b', "abcdefghijklmnopqrstuvwxyz234567", 32)
  case object Base32Upper extends Base("base32upper", 'B', "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", 32)
  case object Base32Pad extends Base("base32pad", 'c', "abcdefghijklmnopqrstuvwxyz234567=", 32)
  case object Base32PadUpper extends Base("base32padupper", 'C', "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=", 32)
  case object Base32Hex extends Base("base32hex", 'v', "0123456789abcdefghijklmnopqrstuv", 32)
  case object Base32HexUpper extends Base("base32hexupper", 'V', "0123456789ABCDEFGHIJKLMNOPQRSTUV", 32)
  case object Base32HexPad extends Base("base32hexpad", 't', "0123456789abcdefghijklmnopqrstuv=", 32)
  case object Base32HexPadUpper extends Base("base32hexpadupper", 'T', "0123456789ABCDEFGHIJKLMNOPQRSTUV=", 32)
  case object Base32Z extends Base("base32z", 'h', "ybndrfg8ejkmcpqxot1uwisza345h769", 32)
  case object Base58Flickr extends Base("base58flickr", 'Z', "123456789abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ", 58)
  case object Base58BTC extends Base("base58btc", 'z', "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", 58)
  case object Base64 extends Base("base64", 'm', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 64)
  case object Base64Pad extends Base("base64pad", 'M', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=", 64)
  case object Base64URL extends Base("base64url", 'u', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", 64)
  case object Base64URLPad extends Base("base64urlpad", 'U', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_=", 64)

  lazy val codes: Map[Char, Base] = Map(
    Identity.code -> Identity,
    Base1.code -> Base1,
    Base2.code -> Base2,
    Base8.code -> Base8,
    Base10.code -> Base10,
    Base16.code -> Base16,
    Base16Upper.code -> Base16Upper,
    Base32.code -> Base32,
    Base32Upper.code -> Base32Upper,
    Base32Pad.code -> Base32Pad,
    Base32PadUpper.code -> Base32PadUpper,
    Base32Hex.code -> Base32Hex,
    Base32HexUpper.code -> Base32HexUpper,
    Base32HexPad.code -> Base32HexPad,
    Base32HexPadUpper.code -> Base32HexPadUpper,
    Base32Z.code -> Base32Z,
    Base58Flickr.code -> Base58Flickr,
    Base58BTC.code -> Base58BTC,
    Base64.code -> Base64,
    Base64Pad.code -> Base64Pad,
    Base64URL.code -> Base64URL,
    Base64URLPad.code -> Base64URLPad
  )

  lazy val names: Map[String, Base]  = Map(
    Identity.name -> Identity,
    Base1.name -> Base1,
    Base2.name -> Base2,
    Base8.name -> Base8,
    Base10.name -> Base10,
    Base16.name -> Base16,
    Base16Upper.name -> Base16Upper,
    Base32.name -> Base32,
    Base32Upper.name -> Base32Upper,
    Base32Pad.name -> Base32Pad,
    Base32PadUpper.name -> Base32PadUpper,
    Base32Hex.name -> Base32Hex,
    Base32HexUpper.name -> Base32HexUpper,
    Base32HexPad.name -> Base32HexPad,
    Base32HexPadUpper.name -> Base32HexPadUpper,
    Base32Z.name -> Base32Z,
    Base58Flickr.name -> Base58Flickr,
    Base58BTC.name -> Base58BTC,
    Base64.name -> Base64,
    Base64Pad.name -> Base64Pad,
    Base64URL.name -> Base64URL,
    Base64URLPad.name -> Base64URLPad
  )

}