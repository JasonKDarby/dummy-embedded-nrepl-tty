(ns embedded-nrepl-tty.core
  (:require [clojure.main :refer [main]]
            [nrepl.server :refer [start-server]]
            [nrepl.transport :as transport]))

(defonce server (start-server
                 :bind "127.0.0.1"
                 :transport-fn transport/tty
                 :greeting-fn transport/tty-greeting))

(prn (str "Started nrepl on port " (:port server)))

(main)



