(defproject twircle "0.1.0-SNAPSHOT"
  :description "Geolocated Twitter Sentiment Analysis"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [twitter-api "0.7.5"]]
  :main ^:skip-aot twircle.auth
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
