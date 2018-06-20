(ns structured-data)

(defn do-a-thing [x]
  (let [xnx (+ x x)]
    (Math/pow xnx xnx)))

(defn spiff [v]
  (let [a (get v 0)
        b (get v 2)]
        (+ a b)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[a b c] v]
    (+ a c)))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
        (- x2 x1)))

(defn height [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
        (- y2 y1)))


(defn square? [rectangle]
  (if (= (height rectangle) (width rectangle))
    true
    false))

(defn area [rectangle]
  (* (height rectangle) (width rectangle)))

(defn contains-point? [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle
        [a b] point]
    (if (and (<= x1 a x2) (<= y1 b y2))
      true
      false)))

(defn contains-rectangle? [outer inner]
  (let [[[x1 y1] [x2 y2]] outer
       [[a1 b1] [a2 b2]] inner]
  (if (and (contains-point? outer [a1 b1]) (contains-point? outer [a2 b2]))
    true
    false)))

(defn title-length [book]
  (count (:title book)))

(defn author-count [book]
  (count (:authors book)))

(defn multiple-authors? [book]
  (if (> (author-count book) 1)
    true
    false))

(defn add-author [book new-author]
    (assoc book :authors (conj (:authors book) new-author)))

(defn alive? [author]
  (not (contains? author :death-year)))

(defn element-lengths [collection]
  (map count collection))

(defn second-elements [collection]
  (let [grab-2 (fn [x] (get x 1))]
    (map grab-2 collection)))

(defn titles [books]
  (let [titles (fn [x] (:title x))]
    (map titles books)))

(defn monotonic? [a-seq]
  )

(defn stars [n]
  (let [concats (concat (re\peat n "*"))]
    (apply str concats)))

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
