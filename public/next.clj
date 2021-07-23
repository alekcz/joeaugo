(ns index
  (:require [pcp :as pcp]
            [garden.core :refer [css]]))

(def accent "#BB973A")

(def resp 
  (pcp/html
    [:html {:style "font-family: 'Thasadith', sans-serif;text-align: center;"
            :lang "en"}
      [:head 
        [:title "Joe Odhiambo - In Memoriam"]
        [:meta {:charset "utf-8"}]
        [:meta {:name "viewport" :content "width=device-width,initial-scale=1"}]
        [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
        [:link {:rel "preconnect" :href "https://fonts.googleapis.com"}]
        [:link {:rel "preconnect" :href "https://fonts.gstatic.com" :crossorigin nil}]
        [:link {:href "https://fonts.googleapis.com/css2?family=Thasadith:wght@400;700&display=swap" :rel "stylesheet"
                :onload "this.onload=null;this.removeAttribute('media')"
                :media "print"}]
        [:noscript
          [:link {:href "https://fonts.googleapis.com/css2?family=Thasadith:wght@400;700&display=swap" :rel "stylesheet"}]]
        [:style 
          (css [:* {:box-sizing "border-box"}])
          (css [:div {:display "flex"}])
          (css [:html :body {:margin "0px"
                       :padding "0px"}])
          (css [:h1 {:font-size "80px" :margin-top "0px" :text-align "left"}])
          (css [:p {:text-align "left"}])
          (css [:h2{:font-size "20px" :margin-bottom "0px"}])
          (css [:span {:margin-bottom "2px"}])
          (css [:a.button {:min-height "40px"
                         :padding "5px 20px"
                         :text-decoration "none"
                         :color "#fff"
                         :background-color "#7C90DB"
                         :display "flex"
                         :font-size "18px"
                         :justify-content "center"
                         :align-items "center"
                         :border-radius "8px"
                         :font-weight "700"}])
          (css [:.hero  {:background "linear-gradient(130.37deg, #C9DAE2 26.33%, #F1FAFF 71.25%)"
                         :height "700px"
                         :padding "60px 10vw"
                         :display "flex"
                         :position "relative"
                         :flex-direction "column"
                         :justify-content "center"}
                  [:div {:display "flex"}]
                  [:img {:height "auto"
                         :width "45vw"
                         :position "absolute"
                         :bottom "0px"
                         :right "10vw"
                         :max-width "30vw"}]])
          (css [:header {:display "flex"
                         :flex-direction "row"
                         :justify-content "space-between"
                         :position "absolute"
                         :top "60px"
                         :left "7vw"
                         :width "86vw"}])
          (css [:button {:width "240px"}])
          (css [:.section {:padding "70px 10vw"
                           :display "flex"
                           :justify-content "flex-start"
                           :align-items "flex-start"
                           :flex-direction "column"}])
          (css [:.section--alt {:background "#EBF8FF"
                                :align-items "center"}])   

          (css  [:.chapters {:display "flex"
                           :flex-direction "row"
                           :flex-wrap "wrap"
                           :justify-content "space-between"
                           :width "80vw"}])
          (css  [:.chapter {:display "flex" 
                            :flex-direction "column"
                            :flex-basis "48%"
                            :padding "5px"}])                                                     
          (css [:footer {:padding "60px 10vw"
                         :display "flex"
                         :flex-direction "column"
                         :justify-content "center"
                         :align-items "center"
                         :font-weight "bold"
                         :color accent
                         :font-size "18px"}])]]
      [:body 
        [:div.hero 
          [:header 
            [:div.word-mark "Joe Odhiambo"]
            [:div.menu "Service"]
            [:div.menu "Gallery"]
            [:div.menu "Stories"]
            [:div.menu "Donate"]
            [:button.menu "Contribute"]]
          [:div.subtitle "1961 - 2021"]
          [:div.heading 
            [:h1 "In Loving Memory"
            [:br] "Joe Odhiambo"]]
          [:button "Leave a message"]
          [:img {:src "img/header.png"}]]
        [:div.section
          ]
        [:div.section.section--alt]
        [:div.section
          [:div.subtitle "1961 - 2021"]
          [:div.title "A life well lived"]
          [:br][:br][:br]
          [:div.chapters
            (repeat
              4
              [:div.chapter
                [:img {:src "img/story.png"}]
                [:div.subtitle "Section Title"]
                [:div.dates "YYYY - YYYY"]
                [:p "Et has minim elitr intellegat. Mea aeterno eleifend antiopam ad, nam no suscipit quaerendum. At nam minimum ponderum. Est audiam animal molestiae te. Ex duo eripuit mentitum."]])]]
        [:div.section.section--alt
          [:div.subtitle "A helping hand"]
          [:div.title "In loving memory"]
          [:div.ctas
            [:button "Leave a message"]
            [:button "Make a contribution"]]]
        [:footer "1961 - 2021"]]]))

(pcp/response 200 resp "text/html")            
