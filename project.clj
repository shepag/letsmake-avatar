(defproject letsmake-avatar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [ring/ring-devel "1.6.3"]
                 [metosin/reitit "0.5.5"]
                 [hiccup "1.0.5"]
                 [net.dhleong/spade "1.1.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler letsmake-avatar.core/app}
  :repl-options {:init-ns letsmake-avatar.core})
