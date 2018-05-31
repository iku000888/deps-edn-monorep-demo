(ns bar.core
  (:require [foo.core :as foo]))

(defn say-foo []
  (foo/say-foo))
