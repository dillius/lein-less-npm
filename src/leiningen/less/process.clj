(ns leiningen.less.process
  (:require [clojure.java.io :as io]))

(defn iswin
  "Thanks to https://github.com/bodil/lein-npm"
  []
  (let [os (System/getProperty "os.name")]
    (-> os .toLowerCase (.contains "windows"))))

(defn- process
  "Thanks to https://github.com/bodil/lein-npm"
  [cwd args]
  (let [fargs (if (iswin) (concat '("cmd" "/C") args) args)
        proc  (ProcessBuilder. fargs)]
    (.directory proc (io/file cwd))
    (.redirectErrorStream proc true)
    (.start proc)))

(defn exec
  "Thanks to https://github.com/bodil/lein-npm"
  [cwd args]
  (let [proc (process cwd args)]
    (io/copy (.getInputStream proc) (System/out))
    (.waitFor proc)
    (.exitValue proc)))
