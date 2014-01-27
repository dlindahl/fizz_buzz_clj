(ns fizz-buzz.core
  (:gen-class))

(defn fizz?
  "Returns fizz if fizzy"
  [number]
  (= 0 (mod number 3))
)

(defn buzz?
  "Returns buzz if buzzy"
  [number]
  (= 0 (mod number 5))
)

(defn fizzbuzz?
  "Returns fizzbuzz if fizzy AND buzzy"
  [number]
  (and (fizz? number) (buzz? number))
)

(defn
  ^{:doc "makeitso returns fizz, buzz, fizzbuzz, or the number"
    :user/comment "checks if a number is a fizz, a buzz, a fizzbuzz, or a number"
  }
  makeitso
  [number] number
  (if (fizzbuzz? number)
    "fizzbuzz"
    (if (fizz? number)
      "fizz"
      (if (buzz? number)
        "buzz"
        (str number)
      )
    )
  )
)


(defn -main
  [number] number
  (println (makeitso (new Integer number)))
)
