(defmulti my-multi #(if (even? %) :even :odd))
(defmethod my-multi :even [arg] (println arg "is even"))
(defmethod my-multi :odd [arg] (println arg "is odd"))
(my-multi 6)
(my-multi 7)

