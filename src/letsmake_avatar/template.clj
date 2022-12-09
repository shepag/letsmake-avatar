(ns letsmake-avatar.template
  (:require [hiccup.core :as h]))

(defn template []
  (list
   "<!DOCTYPE html>"
   (h/html
    [:head
     [:meta {:charset " UTF-8 "}]
     [:title "Avatar Maker"]
     [:script {:src "https://unpkg.com/htmx.org@1.8.4" :integrity "sha384-wg5Y/JwF7VxGk4zLsJEcAojRtlVp1FKKdGy1qN+OMtdq72WRvX/EdRdqg/LOhYeV" :crossoriging "anonymous" :defer true}]]
    [:body
     ])))