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
import com.github.fluency03.multibase.Multibase
import com.github.fluency03.multibase.Base._

val str = "Multibase is awesome! \\o/"

Multibase.encodeString(Base32Upper, str)              // BJV2WY5DJMJQXGZJANFZSAYLXMVZW63LFEEQFY3ZP
Multibase.encodeString(Base32Pad, str)                // cjv2wy5djmjqxgzjanfzsaylxmvzw63lfeeqfy3zp
Multibase.encodeString(Base32PadUpper, str)           // CJV2WY5DJMJQXGZJANFZSAYLXMVZW63LFEEQFY3ZP

Multibase.encodeString(Base32Z, str)                  // hji4sa7djcjozg3jypf31yamzci3s65mfrrofa53x
Multibase.encodeString(Base58Flickr, str)             // ZxaJjNnAzU5jHQLhoLrXxcVM66Ca1VkLWAT
Multibase.encodeString(Base58BTC, str)                // zYAjKoNbau5KiqmHPmSxYCvn66dA1vLmwbt

Multibase.encodeString(Base64, str)                   // mTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw
Multibase.encodeString(Base64Pad, str)                // MTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw==
Multibase.encodeString(Base64URL, str)                // uTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw
Multibase.encodeString(Base64URLPad, str)             // UTXVsdGliYXNlIGlzIGF3ZXNvbWUhIFxvLw==


val encodedStr: String = Multibase.encode(Base16, str.getBytes)
// encodedStr: String = f4d756c74696261736520697320617765736f6d6521205c6f2f

val decodedBytes: Array[Byte] = Multibase.decode(encodedStr)
// decodedBytes: Array[Byte] = Array(77, 117, 108, 116, 105, 98, 97, 115, 101, 32, 105, 115, 32, 97, 119, 101, 115, 111, 109, 101, 33, 32, 92, 111, 47)

val decodedStr = new String(decodedBytes)
// decodedStr: String = Multibase is awesome! \o/
```

## API

## Maintainers

[@fluency03](https://github.com/fluency03)

## Contribute

PRs accepted.

Small note: If editing the README, please conform to the [standard-readme](https://github.com/RichardLitt/standard-readme) specification.

## License

MIT © 2018 [@fluency03](https://github.com/fluency03)
