(comment "Ex 2.6.1")

(defn isDivisibleBy [divisor]
  (fn [num] (= (rem num divisor) 0))
)

(defn isEven [num]
  ((isDivisibleBy 2) num)
)
