(ns index
  (:require [pcp :as pcp]
            [garden.core :refer [css]]))

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
          (css [:html :body {:margin "0px"
                       :padding "0px"}])
          (css [:.info { :background-color "rgb(122,144,194)" 
                          :font-size "16px"
                          :margin-top "10px"
                          :padding "15px" 
                          :text-align "left" 
                          :width "310px"
                          :border-radius "8px"
                          :color "#fff"}])
          (css [:.strong {:margin-right "10px" :font-weight "700" :width "100px"
                          :display "flex"
                          :justify-content "flex-start"
                          :align-items "center" }])
          (css [:code   { :font-size "12px" 
                          :font-weight "normal"}])
          (css [:.profile {:border-radius "100%"}])
          (css [:.details {:display "flex"}])
          (css [:.line {:display "flex" :margin-bottom "3px"}])
          (css [:h1 {:font-size "40px" :margin-top "0px"}])
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
          (css [:.hero {:background "linear-gradient(130.37deg, #C9DAE2 26.33%, #F1FAFF 71.25%)"
                          :height "700px"}])
          (css [:header {:display "flex"
                         :flex-direction "row"}])]]
      [:body 
        [:div.hero 
          [:header 
            [:div.word-mark "Joe Odhiambo"]
            [:div.menu "Service"]
            [:div.menu "Gallery"]
            [:div.menu "Stories"]
            [:div.menu "Donate"]
            [:div.menu "Contribute"]]
          [:div.subtitle "1961 - 2021"]
          [:div.]]
        [:div.line 
              {:style "display: flex; flex-direction: column; justify-content: center; align-items: center; min-height: 90vh;"
              :data-null ""}
              [:br][:br]
              [:img.profile {:src "/profile.jpeg" :width "150px" :height "150px"}]
              [:br][:br]
              [:h2 "In loving memory of"]
              [:h1 "Joe Odhiambo"]
              [:h2 "Contribute via EFT"]
              [:div.info
                [:div.line [:div.strong "Name: "] [:div.details "DCO Owaga"]]
                [:div.line [:div.strong "Bank: "] [:div.details "ABSA"]]
                [:div.line [:div.strong "Account No: "]  [:div.details "9094613153"]]
                [:div.line [:div.strong "Branch Code: "]  [:div.details "632005"]]
                [:div.line [:div.strong "Swift Code: "]  [:div.details "ABSAZAJJ"]]
                [:div.line [:div.strong "Reference: "] [:div.details "Your Name & Surname"]]]
              [:h2 "Contribute via M-pesa"]
              [:div.info
                [:div.line [:div.strong "Mpesa: "] [:div.details "+254798212410"]]
                [:div.line [:div.strong "Reference: "] [:div.details "Your Name & Surname"]]]
              [:h2 "Contribute online"]
              [:div.info
                [:div.line 
                    [:div "Use this link to contribute online: "
                    [:a {:href "https://secure.changa.co.ke/myweb/share/48583"} "here"]]]]
              [:br]
              [:br]
              [:a.button {:href "https://www.kudoboard.com/boards/Dm8efC7E" :target "_blank"} "Offer condolences"]
              [:br]
              [:br]]]]))

(pcp/response 200 resp "text/html")            
