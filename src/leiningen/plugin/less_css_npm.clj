(ns leiningen.plugin.less-css-npm
  (:require [robert.hooke :refer :all]
            [leiningen.compile]
            [leiningen.less-css-npm]))

(defn wrap-compile
  [f & args]
  (leiningen.less-css-npm/less-css-npm (first args) (rest args)))

(defn install-hooks []
  (robert.hooke/add-hook
   #'leiningen.compile/compile
   wrap-compile))
