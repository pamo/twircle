# twircle

* Step 0: Displaying tweets containing the word "football"
- Create a command-line clojure app which when run will produce a live feed showing all tweets containing the word "football".

* Step 1: Display a live feed of all tweets within the bay area
- Hint: twitter also lets you filter based on tweet's geolocation:
- https://dev.twitter.com/docs/streaming-apis/parameters#locations
* Step 2: Categorize tweets based on keywords look for certain keywords in every tweet received (e.g. "happy", "sad", "mad", "stoked", "wtf") and use that information to categorize each tweet. Print out the category of each tweet in the filtered stream (e.g. "happy tweet", "sad tweet", "unknown tweet").
* Step 2.1 (optional): Plug in a real sentiment analyzer use a "real" sentiment analysis library (which could be a clojure library or another JVM language) to categorize incoming tweets.
* Step 4: Produce a rolling average of sentiment for a geolocation
- Figure out a cunning way to roll up the sentiment analysis of individual tweets into an aggregate score for an entire stream of tweets. Use that to report the general mood of San Francisco.
* Step 5: Analyze different places simultaneously Keep track of several streams simultanously, and use them to categorize the mood of multiple locales.
- Hint: twitter doesn't let you consume multiple distinct streams concurrently, so you'll have to multiplex your queries into one super-stream and then demux them as you bring them in for processing.
## Bonus Points
* Pull in a list of teams currently playing from some API somewhere and use that to decide what geolocated tweet streams to process.
* Use Clojurescript to display geolocated tweets on a google map in a web page.
