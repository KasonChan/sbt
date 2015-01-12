package A

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

object A {
  def main(args: Array[String]): Unit = {
    val s = "Hello"

    val f: Future[String] = Future {
      s + " future!"
    }

    f onSuccess {
      case msg => println(msg)
    }

    echo("Hello") onSuccess {
      case msg => println(msg)
    }

    println("main: World")

    val c = future(5 * 42)
    c onSuccess {

      case msg => Thread.sleep(1); println(msg)
    }

    for (i <- 1 to 5)
      println(i)

    echo("World") onSuccess {
      case msg => println(msg)
    }
  }

  def echo(msg: String): Future[String] = Future {
    Thread.sleep(1)
    "echo: " + msg
  }
}