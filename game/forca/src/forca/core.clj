(ns forca.core
  (:gen-class))

	(def total-de-vidas 6)

	(defn perdeu [] (println "Voce perdeu"))

	(defn jogo [vidas palavra]

		(if (= vidas 0) 
			(perdeu)
			(do
				(print vidas)
				(jogo (dec vidas))
			)
		)
	)



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println ""))
