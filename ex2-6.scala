type Pred[A] = A => Boolean

// Ex 2.6.1
def isDivisibleBy(divisor: Int): Pred[Int] = 
  num => num % divisor == 0

def isEven(num: Int): Boolean = 
  isDivisibleBy(2).apply(num)

// Ex 2.6.2
// def 
