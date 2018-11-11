package com.github.fluency03.multibase

import org.scalatest.{FlatSpec, Matchers}

class MultibaseTest extends FlatSpec with Matchers {

  it should "convert given string to correct encodings." in {
    val str = "Multibase is awesome! \\o/"

    Multibase.decodeToString(Multibase.encodeString(Base.Identity, str)) shouldBe str
//    Multibase.decodeToString(Multibase.encodeString(Base.Base1, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base2, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base8, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base10, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base16, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base16Upper, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32Upper, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32Pad, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32PadUpper, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32Hex, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32HexUpper, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32HexPad, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32HexPadUpper, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base32Z, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base58Flickr, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base58BTC, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base64, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base64Pad, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base64URL, str)) shouldBe str
    Multibase.decodeToString(Multibase.encodeString(Base.Base64URLPad, str)) shouldBe str

  }


}
