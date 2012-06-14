// Ex 2.5.1
val abs: (Int => Int) = num => if(num < 0) -num else num

// Ex 2.5.2
def isEven(n: Int): Boolean = 
  n % 2 == 0

def not(fun: Int => Boolean): Int => Boolean = 
  a => !fun(a)

val isOdd: Int => Boolean = not(isEven)

