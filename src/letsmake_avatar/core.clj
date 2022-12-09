(ns letsmake-avatar.core
  (:require [reitit.ring :as ring]
            [hiccup.core :as h]))

(defn render [handler]
  (fn [request]
    (let [response (handler request)]
      (assoc response :body (h/html (:body response))))))

(defn index [_]
  {:status 200 :body [:html [:body [:div "HELLO"]]]})

(def app
  (ring/ring-handler
   (ring/router
    ["/" {:middleware [[render]]}
     ["" {:get index ::name ::index}]])))

(defn -main [& args]
  (run-jetty app {:port (Integer/valueOf (or (System/getenv "port") "3000"))}))