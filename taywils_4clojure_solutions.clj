;; http://www.4clojure.com/problem/1
(= true true)

;; http://www.4clojure.com/problem/2
4

;; http://www.4clojure.com/problem/3
"HELLO WORLD"

;; http://www.4clojure.com/problem/4
:a :b :c

;; http://www.4clojure.com/problem/5
'(1 2 3 4)

;; http://www.4clojure.com/problem/6
:a :b :c

;; http://www.4clojure.com/problem/7
[1 2 3 4]
  
;; http://www.4clojure.com/problem/8
#{:a :b :c :d}

;; http://www.4clojure.com/problem/9
2

;; http://www.4clojure.com/problem/10
(:b {:a 10 :b 20 :c 30})

;; http://www.4clojure.com/problem/11
{:b 2}

;; http://www.4clojure.com/problem/12
3

;; http://www.4clojure.com/problem/13
[20 30 40]
  
;; http://www.4clojure.com/problem/14
8

;; http://www.4clojure.com/problem/15
(fn [x] (* x 2))

;; http://www.4clojure.com/problem/16
#(str "Hello, " %1 "!")

;; http://www.4clojure.com/problem/17
'(6 7 8)

;; http://www.4clojure.com/problem/18
'(6 7)

;; http://www.4clojure.com/problem/19
#(nth %1 (- (count %1) 1))

;; http://www.4clojure.com/problem/20
#(nth %1 (- (count %1) 2))

;; http://www.4clojure.com/problem/21
#(cond 
  (= %2 0) (first %1) 
  :else (recur (rest %1) (dec %2)))

;; http://www.4clojure.com/problem/22
(fn [coll]
    (reduce + (map (fn [x] (if nil? x) 0 1) coll)))

;; http://www.4clojure.com/problem/23
#(reduce conj '() %1)

;; http://www.4clojure.com/problem/24
#(reduce + %1)

;; http://www.4clojure.com/problem/25
#(filter (fn [x] (if (odd? x) x nil)) %1)

;; http://www.4clojure.com/problem/26
(fn [n]
  (take n
    (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))))

;; http://www.4clojure.com/problem/27
(fn [coll]
  (if (= (reverse (seq coll)) (seq coll)) true false))

;; http://www.4clojure.com/problem/28
(fn my-flatten [coll]
  (if (sequential? coll)
    (apply concat (map my-flatten coll))
    (list coll)))

;; http://www.4clojure.com/problem/29
(fn [x]
  (clojure.string/upper-case
  	(apply str 
       (re-seq #"[A-Z]" x))))

;; http://www.4clojure.com/problem/30
(fn [coll]
  (let [rem-dupes (map (fn [item] (first item)) (partition-by identity coll))]
  (if (string? coll)
    (reduce str rem-dupes)
    rem-dupes)))

;; http://www.4clojure.com/problem/31
#(partition-by identity %)
