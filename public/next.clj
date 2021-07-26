(ns index
  (:require [pcp :as pcp]
            [garden.core :refer [css]]))

(def accent "#BB973A")
(def white "#FFFFFF")
(def weib "#0D274F")

(defn bg [n]
  (str "background-image: url(img/gallery"n".png);"))

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
        [:link {:href "https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&family=Playfair+Display&display=swap" :rel "stylesheet"
                :onload "this.onload=null;this.removeAttribute('media')"
                :media "print"}]
        [:noscript
          [:link {:href "https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&family=Playfair+Display&display=swap" :rel "stylesheet"}]]
        [:style 
          (css  [:* {:box-sizing "border-box"}]
                [:div {:display "flex"}]
                [:a {:cursor "pointer"}]
                [:html :body {:margin "0px"
                       :padding "0px"
                       :font-family "Open Sans, sans-serif"
                       :font-weight "300"
                       :font-size "18px"}]
                [:.playfair {:font-family "Playfair Display, serif"
                             :font-weight "400"}]
                [:h1 {:font-size "88px" :margin-top "0px" :text-align "left" :color weib :margin-bottom "40px"}]
                [:.subtitle {:color accent
                             :font-weight "700"
                             :margin "12px 0"
                             :text-transform "uppercase"}]
                [:p {:text-align "left"}]
                [:h2 {:font-size "54px" :margin-bottom "60px"  :margin-top "0px" :line-height "64px" :color weib :text-align "left"}]
                [:h3 {:font-size "42px" :margin-bottom "40px"  :margin-top "0px" :line-height "50px" :color weib}]
                [:span {:margin-bottom "2px"}]
                [:.word-mark {:text-transform "uppercase"
                              :font-weight "700"}]
                [:.hero  {:background "linear-gradient(130.37deg, #C9DAE2 26.33%, #F1FAFF 71.25%)"
                         :height "700px"
                         :padding "90px 10vw"
                         :display "flex"
                         :position "relative"
                         :flex-direction "column"
                         :justify-content "center"}
                  [:div {:display "flex"}]
                  [:img {:height "auto"
                         :width "37vw"
                         :position "absolute"
                         :bottom "0px"
                         :right "10vw"}]]
                [:header {:display "flex"
                         :flex-direction "row"
                         :justify-content "space-between"
                         :position "absolute"
                         :top "60px"
                         :left "7vw"
                         :width "86vw"}]
                [:.menu {:line-height "25px"
                          :display "flex"
                          :justify-content "center"
                          :align-items "center"
                          :margin "5px 10px"
                          :font-weight "700"
                          :color weib
                          :text-decoration "none"}]
                [:.menu:hover {:text-decoration "underline"}]
                [:.filler {:flex-grow "9999"}]
                [:.button {:width "auto"
                          :max-width "300px"
                          :height "50px"
                          :text-decoration "none"
                          :padding "5px 15px"
                          :display "flex"
                          :font-size "17px"
                          :justify-content "center"
                          :align-items "center"
                          :text-transform "uppercase"
                          :font-weight "600"
                          :letter-spacing "3px"}]
                [:.button:hover {:text-decoration "none"}]
                [:.primary {:color white
                            :background-color accent}]
                [:.secondary {:min-width "200px"
                              :color accent
                              :border-color accent
                              :background-color "rgba(155, 105, 30, 0.09)"
                              :margin-right "20px"}]
                [:.section {:padding "70px 10vw"
                           :display "flex"
                           :justify-content "flex-start"
                           :align-items "flex-start"
                           :flex-direction "column"}]
                [:.section--alt {:background "#EBF8FF"
                                 :align-items "center"}] 
                [:.section--navy {:background weib}] 
                [:.section--thin {:padding "140px 10px 0px 10px"
                                  :justify-content "center"}
                  [:.title {:margin-left "10vw"}]
                  [:.subtitle {:margin-left "10vw"}]]  
                [:.section--family {:background "#EBF8FF"
                                    :padding-top "500px"
                                    :padding "500px 0px 0px 0px"
                                    :background-image "url(img/all.png)"
                                    :background-repeat "no-repeat"
                                    :background-position "top center"
                                    :min-height "400px"}] 
                [:.fade {:flex-direction "column"
                         :background "linear-gradient(rgba(255, 255, 255, 0) 9.96%, rgba(255, 255, 255, 0.82) 45.04%, rgba(255, 255, 255, 0.97) 75.08%);"
                         :width "100%"
                         :margin-top "-200px"
                         :padding "200px 10vw 0px 10vw"}]
                [:.stream {:margin-bottom "60px"}]
                [:.aside {:display "flex"
                          :flex-direction "column"
                          :justify-content "center"
                          :margin-left "70px"}
                  [:p {:margin "0px 0px 20px 0px"}]
                  [:.subtitle {:font-weight "400"
                               :text-transform "capitalize"}]]
                [:a.watch {:display "flex"
                           :flex-direction "row"
                           :justify-content "center"
                           :align-items "center"
                           :width "240px"
                           :border-radius "25px"
                           :height "50px"
                           :background white
                           :font-size "16px"
                           :text-decoration "none"
                           :text-transform "uppercase"
                           :font-weight "700"
                           :color weib
                           :margin "10px 0"}]
                [:.play {:width "12px"
                         :margin-left "10px"}]
                [:.title {:text-align "left"}]
                [:.chapters {:display "flex"
                             :flex-direction "row"
                             :flex-wrap "wrap"
                             :justify-content "space-between"
                             :width "100%"
                             :padding "0px 10vw"
                             :background white}]
                [:.chapter {:display "flex" 
                            :flex-direction "column"
                            :flex-basis "30%"
                            :padding "5px"
                            :margin-bottom "60px"}
                  [:p {:font-size "18px"
                       :line-height "26px"
                       :letter-spacing "0.3px"
                       :font-weight "400"}]
                  [:div.subtitle {:font-size "24px"
                               :margin "0"}]]
                [:.gallery {:display "flex"
                             :flex-direction "row"
                             :flex-wrap "wrap"
                             :justify-content "center"
                             :padding "0px 10px 60px 10px"
                             :background white}]
                [:.image {:width "22vw"
                          :height "22vw"
                          :margin "10px"
                          :background-size "cover"
                          :background-repeat "no-repeat"}]
                [:.holder {:width "23vw"
                          :height "2px"
                          :background-size "cover"
                          :background-repeat "no-repeat"}]
                [:.dates {:color weib
                          :font-weight "600"}]    
                [:.white {:color white}]                                               
                [:footer {:padding "60px 10vw"
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
            [:div.menu.word-mark "Joe Odhiambo"]
            [:div.filler]
            [:a.menu {:href "#memorials"} "Memorials"]
            [:a.menu {:href "#gallery"} "Gallery"]
            [:a.menu {:href "#stories"} "Stories"]
            [:a.menu {:href "https://secure.changa.co.ke/myweb/share/48583"} "Donate"]
            [:div.filler]
            [:a.button.menu.primary {:href "https://secure.changa.co.ke/myweb/share/48583"} "Contribute"]]
          [:br] 
          [:br] 
          [:br] 
          [:br] 
          [:div.subtitle "1961 - 2021"]
          [:div.heading 
            [:h1.playfair "In Loving Memory"
            [:br] "Joe Odhiambo"]]
          [:a.primary.button {:href "https://www.kudoboard.com/boards/Dm8efC7E"} "Leave a message"]
          [:img {:src "img/header.png"}]]
        [:div#memorials.section.section--navy
          [:h2.title.playfair.white "Memorial services"]
          [:div.stream
            [:a {:href "https://www.youtube.com/watch?v=LrNO0UHHDjU&ab_channel=GraphicExposure"}
              [:img {:src "img/stream0.png"}]]
            [:div.aside 
              [:div.subtitle "Pretoria, South Africa (11:00 AM - 26th July 2021)"]
              [:p.white "Et has minim elitr intellegat. Mea aeterno eleifend antiopam ad, nam no suscipit quaerendum."]
              [:a.watch {:href "https://www.youtube.com/watch?v=LrNO0UHHDjU&ab_channel=GraphicExposure"} "Watch Livestream" [:img.play {:src "img/play.svg"}]]]]
          [:div.stream
            [:a {:src "https://www.youtube.com/channel/UCO_CFevOouGCB8E4fnPEBzg"}
              [:img {:src "img/stream1.png"}]]
            [:div.aside  
              [:div.subtitle "Nairobi, Kenya (12:00 PM - 29th July 2021)"]
              [:p.white "Et has minim elitr intellegat. Mea aeterno eleifend antiopam ad, nam no suscipit quaerendum."]
              [:a.watch {:href "https://www.youtube.com/watch?v=LrNO0UHHDjU&ab_channel=GraphicExposure"} "Watch Livestream" [:img.play {:src "img/play.svg"}]]]]
          [:div.stream
            [:a {:src "https://www.youtube.com/channel/UCO_CFevOouGCB8E4fnPEBzg"}
              [:img {:src "img/stream2.png"}]]
            [:div.aside  
              [:div.subtitle "Asembo Kanyikela, Kenya (08:30 AM - 31st July 2021)"]
              [:p.white "Et has minim elitr intellegat. Mea aeterno eleifend antiopam ad, nam no suscipit quaerendum."]
              [:a.watch {:href "https://www.youtube.com/watch?v=LrNO0UHHDjU&ab_channel=GraphicExposure"} "Watch Livestream" [:img.play {:src "img/play.svg"}]]]]]
        [:div#gallery.section.section--thin
          [:div.subtitle "Photo Gallery"]
          [:h2.title.playfair "Worth 1000 Words"]
          [:div.gallery 
            (for [n (range 8)]
              [:div.image {:style (bg (inc n))}])
            [:div.holder]]]
        [:div#stories.section.section--family
          [:div.fade
            [:div.subtitle "1961 - 2021"]
            [:h3.title.playfair "A life well lived"]]
          [:div.chapters
            [:div.chapter
                [:img {:src "img/early.png"}]
                [:div.subtitle "Early life"]
                [:div.dates "YYYY - YYYY"]
                [:p "Born on the 24th of August 1961, Joe was the fourth born child of the late Engineer Apollo Odhiambo Augo and the late Mama Grace Nellie Akumu of Asembo Kanyikela."]]
            [:div.chapter
                [:img {:src "img/professional.png"}]
                [:div.subtitle "Professional"]
                [:div.dates "YYYY - YYYY"]
                [:p "Et has minim elitr intellegat. Mea aeterno eleifend antiopam ad, nam no suscipit quaerendum. At nam minimum ponderum. Est audiam animal molestiae te. Ex duo eripuit mentitum."]]
            [:div.chapter
                [:img {:src "img/family.png"}]
                [:div.subtitle "Family"]
                [:div.dates "YYYY - YYYY"]
                [:p "Joe married the love of his life, Alice, in 1989. In addition to being  a loving husband to her, he was also a fabulous  father to their two children Leo and Sally. Joe and his family  have been  stationed in southern Africa since 1990."]]
            [:div.chapter
                [:img {:src "img/husband.png"}]
                [:div.subtitle "Husband"]
                [:div.dates "YYYY - YYYY"]
                [:p "Et has minim elitr intellegat. Mea aeterno eleifend antiopam ad, nam no suscipit quaerendum. At nam minimum ponderum. Est audiam animal molestiae te. Ex duo eripuit mentitum."]]]]
        [:div.section.section--alt
          [:div.subtitle "A helping hand"]
          [:h3.title.playfair "In loving memory"]
          [:div.ctas
            [:a.button.secondary {:href "https://www.kudoboard.com/boards/Dm8efC7E"} "Leave a message"]
            [:a.button.primary {:href "https://secure.changa.co.ke/myweb/share/48583"} "Make a contribution"]]]
        [:footer "1961 - 2021"]]]))

(pcp/response 200 resp "text/html")            
