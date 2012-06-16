type Pred[A] = A => Boolean

// Ex 2.6.1
def isDivisibleBy(divisor: Int): Pred[Int] = 
  num => num % divisor == 0

def isEven(num: Int): Boolean = 
  isDivisibleBy(2).apply(num)

// Ex 2.6.2
def isDivisibleBy3And5(num: Int): Boolean =
  isDivisibleBy(3).apply(num) && isDivisibleBy(5).apply(num) 

def isDivisibleBy3Or5(num: Int): Boolean =
  isDivisibleBy(3).apply(num) || isDivisibleBy(5).apply(num) 

def lift[T](a: Pred[T], b: Pred[T], combine: (Boolean, Boolean) => Boolean): Pred[T] =
  (x: T) => combine(a(x), b(x))
  
def isDivisibleBy3And5UseLift(num: Int): Boolean = 
  lift(isDivisibleBy(3), isDivisibleBy(5), _ && _).apply(num)

def isDivisibleBy3Or5UseLift(num: Int): Boolean = 
  lift(isDivisibleBy(3), isDivisibleBy(5), _ || _).apply(num)
