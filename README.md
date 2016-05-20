Functional Programming Demos
============================

Streams
-------
located in [**_stream.clj_**](https://github.com/CodiBurley/clojure-demos/blob/master/stream.clj)

Demonstates a basic stream (even-nums) and a funciton to utilize streams (my-take)
without the use of lazy-seq.

example: `(my-take 5 (even-nums)) ; -> (0 2 4 6 8)`

map-reduce
----------
located in [**_map-reduce.clj_**](https://github.com/CodiBurley/clojure-demos/blob/master/map-reduce.clj)

A function that maps an element before it reduces the element into the result. This ensures
that you do not need to make two passes of the list in order to do a map reduce.

example: `(map-reduce #(* % %) + [1 2 3 4]) ; -> 30 The sum of Squares`
