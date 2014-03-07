(ns leiningen.less-css-npm.plugin
  (:require [robert.hooke
             leiningen.compile]))

(defn less-css-npm
  [project & args]
  (prn "LESS COMPILE TIME MOFO")
  (clojure.java.shell/sh "npm.cmd" "lessc" "resources/public/css/less/application.less" "resources/public/css/application.css"))


(defn activate []
  (rober.hooke/add-hook
   #'leiningen.compile/compile
   #'less-css-npm))
