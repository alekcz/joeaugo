(ns index
  (:require [pcp :as pcp]
            [garden.core :refer [css]]))

(def resp 
  (pcp/html
    [:html {:style "font-family: 'Thasadith', sans-serif;text-align: center;"
            :lang "en"}
      [:head 
        [:title "Joe Odhiambo Augo - In Memoriam"]
        [:meta {:charset "utf-8"}]
        [:meta {:name "viewport" :content "width=device-width,initial-scale=1"}]
        [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
        [:link {:rel "preconnect" :href "https://fonts.googleapis.com"}]
        [:link {:rel "preconnect" :href "https://fonts.gstatic.com" :crossorigin nil}]
        [:link {:href "https://fonts.googleapis.com/css2?family=Thasadith&display=swap" :rel "stylesheet"}]
        [:style 
          (css [:body {:background-color "#fffff4"}])
          (css [:p.info { :background-color "#EEE" 
                          :font-size "13px"
                          :margin-top "40px"
                          :padding "10px" 
                          :text-align "left" 
                          :width "300px"}])
          (css [:strong { :font-size "13px"}])
          (css [:code   { :font-size "12px" 
                          :font-weight "normal"}])
          (css [:.profile {:border-radius "100%"}])
          (css [:h1 {:font-size "60px" :margin-top "0px"}])
          (css [:h2{:font-size "30px" :margin-bottom "0px"}])]]
      [:body 
        [:div 
              {:style "display: flex; flex-direction: column; justify-content: center; align-items: center; min-height: 90vh;"
              :data-null ""}
              [:img.profile {:src "/profile.jpeg" :width "200px"}]
              [:br][:br]
              [:h2 "In loving memory of"]
              [:h1 "Joe Odhiambo Augo"]]]]))

(pcp/response 200 resp "text/html")            
