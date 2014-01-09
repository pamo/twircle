(ns twircle.auth
  (:use 
    [twitter.oauth]
    [twitter.callbacks]
    [twitter.callbacks.handlers]
    [twitter.api.restful]
    [twitter.api.streaming])
  (:require
    [clojure.data.json :as json]
    [http.async.client :as ac])
  (:import
    (twitter.callbacks.protocols AsyncStreamingCallback)
    (twitter.callbacks.protocols SyncSingleCallback)))


(def tokens (read-string (slurp "resources/creds.clj")))

(def creds (make-oauth-creds
             (:app-consumer-key tokens)
             (:app-consumer-secret tokens)
             (:user-access-token tokens)
             (:user-access-token-secret tokens)))

(def stream-callback
       (AsyncStreamingCallback. (comp println #(:text %) json/read-json #(str %2)) 
                                (comp println response-return-everything)
                                exception-print))
(defn -main
  "hello"
  [& args]
  (println creds)

(statuses-filter :params {:track "football"}
                          :oauth-creds creds
                          :callbacks stream-callback))
