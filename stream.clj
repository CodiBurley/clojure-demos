; Author: Codi Burley. Feb 29, 2016.

; using lists
(defn even-nums
  ([] (even-nums 0))
  ([n] (cons n (cons #(even-nums (+ n 2)) '()))))

; using vectors
(defn even-nums
  ([] (even-nums 0))
  ([n]  [n #(even-nums (+ n 2))]))

(defn my-take [n [init-val init-thunk]]
  (loop [i (- n 1), thunk init-thunk, result (list init-val)]
    (if (<= i 0)
      (reverse result)
      (let [[thunk-val new-thunk] (thunk)]
        (recur (- i 1)
               new-thunk
               (cons thunk-val result))))))

; using lazy-seq
(defn even-nums
  ([] (even-nums 0))
  ([n] (lazy-seq (cons n (even-nums (+ n 2))))))
