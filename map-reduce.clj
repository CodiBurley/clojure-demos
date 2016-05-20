; Author: Codi Burley. May 20, 2016.

; Defines a funcion that maps and reduce in one pass through, so you don't
; need to pass through a list twice to map then reduce.
; Essentially maps each element before it reduces it into the result

(defn map-reduce
  ([map-func red-func l]
    (reduce #(red-func %1 (map-func %2)) l))
  ([map-func red-func init l]
    (reduce #(red-func %1 (map-func %2)) init l)))
