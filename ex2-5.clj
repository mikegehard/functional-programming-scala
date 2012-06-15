(defn abs [num]
  (if (< num 0) (- num) num)
)

(defn isEven [num]
  (= (rem num 2) 0)
)

(def isOdd 
  (complement isEven)
)
