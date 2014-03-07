(ns leiningen.less-css-npm
  (:require [leiningen.less.process :refer :all]))

(defn less-css-npm
  [project & args]
  (prn "LESS COMPILE TIME MOFO NOT HOOK")
  (exec (project :root) (list "lessc" "-x" "resources/public/css/less/application.less" "resources/public/css/application.css")))
