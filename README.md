# scala-multibase

[![standard-readme compliant](https://img.shields.io/badge/standard--readme-OK-green.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)

> Scala Implementation of [Multibase](https://github.com/multiformats/multibase).

## Table of Contents

- [Install](#install)
- [Usage](#usage)
- [API](#api)
- [Maintainers](#maintainers)
- [Contribute](#contribute)
- [License](#license)

## Install

Latest version: **0.0.1**

#### Maven

```
<dependency>
  <groupId>com.github.fluency03</groupId>
  <artifactId>scala-multibase_2.12</artifactId>
  <version>{latestVersion}</version>
</dependency>
```


#### sbt

```
libraryDependencies += "com.github.fluency03" % "scala-multibase_2.12" % {latestVersion}
```


## Usage

```scala
import com.github.fluency03.multibase.Multibase       //import com.github.fluency03.multibase.Multibase
import com.github.fluency03.multibase.Base._          //import com.github.fluency03.multibase.Base._
                                                      //
val str = "Multibase is awesome! \\o/"                //str: String = Multibase is awesome! \o/
                                                      //
Multibase.encodeString(Identity, str)                 //res0: String =  Multibase is awesome! \o/
Multibase.encodeString(Base2, str)                    //res1: String = 01001101011101010110110001110100011010010110001001100001011100110110010100100000011010010111001100100000011000010111011101100101011100110110111101101101011001010010000100100000010111000110111100101111
Multibase.encodeString(Base8, str)                    //res2: String = 71153526616432261141346624403227144030273545346675553122044027067457
Multibase.encodeString(Base10, str)                   //res3: String = 9486216053176948155926383873229601216905247370463094989680431
                                                      //
Multibase.encodeString(Base16, str)                   //res4: String = f4d756c74696261736520697320617765736f6d6521205c6f2f
Multibase.encodeString(Base16Upper, str)              //res5: String = F4D756C74696261736520697320617765736F6D6521205C6F2F
                                                      //
Multibase.encodeString(Base32, str)                   //res6: String = bjv2wy5djmjqxgzjanfzsaylxmvzw63lfeeqfy3zp
Multibase.encodeString(Base32Upper, str)              //res7: String = BJV2WY5DJMJQXGZJANFZSAYLXMVZW63LFEEQFY3ZP
Multibase.encodeString(Base32Pad, str)                //res8: String = cjv2wy5djmjqxgzjanfzsaylxmvzw63lfeeqfy3zp
Multibase.encodeString(Base32PadUpper, str)           //res9: String = CJV2WY5DJMJQXGZJANFZSAYLXMVZW63LFEEQFY3ZP
                                                      //
Multibase.encodeString(Base32Hex, str)                //res10: String = v9lqmot39c9gn6p90d5pi0obnclpmurb544g5orpf
Multibase.encodeString(Base32HexUpper, str)           //res11: String = V9LQMOT39C9GN6P90D5PI0OBNCLPMURB544G5ORPF
Multibase.encodeString(Base32HexPad, str)             //res12: String = t9lqmot39c9gn6p90d5pi0obnclpmurb544g5orpf
Multibase.encodeString(Base32HexPadUpper, str)        //res13: String = T9LQMOT39C9GN6P90D5PI0OBNCLPMURB544G5ORPF
                                                      //
Multibase.encodeString(Base32Z, str)                  //res14: String = hji4sa7djcjozg3jypf31yamzci3s65mfrrofa53x
Multibase.encodeString(Base58Flickr, str)             //res15: String = ZxaJjNnAzU5jHQLhoLrXxcVM66Ca1VkLWAT
Multibase.encodeString(Base58BTC, str)                //res16: String = zYAjKoNbau5KiqmHPmSxYCvn66dA1vLmwbt
                                                      //
Multibase.encodeString(Base64, str)                   //res17: String = mTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw
Multibase.encodeString(Base64Pad, str)                //res18: String = MTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw==
Multibase.encodeString(Base64URL, str)                //res19: String = uTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw
Multibase.encodeString(Base64URLPad, str)             //res20: String = UTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw==
```

## API

## Maintainers

[@fluency03](https://github.com/fluency03)

## Contribute

PRs accepted.

Small note: If editing the README, please conform to the [standard-readme](https://github.com/RichardLitt/standard-readme) specification.

## License

MIT © 2018 [@fluency03](https://github.com/fluency03)
