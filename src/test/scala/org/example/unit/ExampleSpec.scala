package org.example.unit

import org.example.HelloWorld
import org.scalatest.{FlatSpec, Matchers}

class ExampleSpec extends FlatSpec with Matchers {

  behavior of "example project"
  it should "compute text message" in {
    HelloWorld.computeMessage() shouldEqual "hello: "
  }

  it should "compute number" in {
    HelloWorld.computeNumber() shouldEqual 123
  }

  print("Hello");
}
