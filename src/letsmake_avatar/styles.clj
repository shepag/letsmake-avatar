(ns avatar-maker.styles
  (:require
   [spade.core :refer [defclass]]))

(declare avatar-box-style)
(declare control-label-style)
(declare background-color-box-style)
(declare bg)
(declare background-color-container-style)
(declare pos)
(declare pos-button-style)
(declare head-style)

(def border-radius "12px")
(def lighter-grey "#dbdbdb")
(def default-grey "#ccc")

(defclass avatar-box-style [bg]
  {:background bg :border-radius "6px" :flex 1})

(defclass control-label-style []
  {:font-size "24px" :color default-grey :margin-right "16px"})

(defclass background-color-box-style [bg]
  {:background    bg
   :width         "36px"
   :height        "36px"
   :top           "2px"
   :left          "2px"
   :border-radius border-radius
   :cursor        "pointer"})

(defclass background-color-container-style [pos]
  (assoc (if (= pos "inner")
           {:background lighter-grey
            :width      "40px"
            :height     "40px"}
           {:background default-grey
            :width      "44px"
            :height     "44px"})
         :display :flex
         :justify-content :center
         :align-items :center
         :border-radius border-radius))

(defclass pos-button-style []
  {:width "40px"
   :border "none"
   :background default-grey
   :border-top-left-radius "4px"
   :border-bottom-left-radius "4px"
   :display "flex" :justify-content "center" :align-items "center"})

(defclass head-style [] {:fill "#000"})