(ns leiningen.less-css-npm
  (:require [leiningen.less.process :refer :all]))

(defn less-css-npm
  [project & args]
  (let [input (:less-in project)
        output (:less-out project)]
    (if (and (string? input) (string? output))
      (exec (project :root)
            (list
             "lessc"
             "-x"
             input
             output))
      (prn ":less-in and/or :less-out not set properly!"))))
