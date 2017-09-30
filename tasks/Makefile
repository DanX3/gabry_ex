#!/bin/bash
all:
	@echo "Uso corretto: make <numero esercizio>"

1: Esercizio1.class
	java $(subst .class,,$<) Gabry!

2: Esercizio2.class
	java $(subst .class,$(empty),$<) 4
	java $(subst .class,$(empty),$<) 95262
	java $(subst .class,$(empty),$<) a

%.class: %.java
	javac $<

clean:
	rm -f *.class
