(ns lein-less-npm.plugin
  (:require [leiningen.plugin.less-css-npm :refer :all]))

(defn hooks []
  (install-hooks))
