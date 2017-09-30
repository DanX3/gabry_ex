all:
	@echo "Uso corretto: make <numero esercizio>"

allex: 1 2 3 4 5 6 7

1: Esercizio1.class
	java $(subst .class,,$<) Gabry!

2: Esercizio2.class
	java $(subst .class,$(empty),$<) 4
	java $(subst .class,$(empty),$<) 95262
	java $(subst .class,$(empty),$<) a

3: Esercizio3.class
	java $(subst .class,$(empty),$<) gabriele
	java $(subst .class,$(empty),$<) daniele
	java $(subst .class,$(empty),$<) supercalifragilistichespiralidoso

4: Esercizio4.class
	java $(subst .class,$(empty),$<) 3
	java $(subst .class,$(empty),$<) 10
	java $(subst .class,$(empty),$<) -1

5: Esercizio5.class
	java $(subst .class,$(empty),$<) 3
	java $(subst .class,$(empty),$<) 10
	java $(subst .class,$(empty),$<) -1

6: Esercizio6.class
	java $(subst .class,$(empty),$<)

7: Esercizio7.class
	java $(subst .class,$(empty),$<) 2 CPU
	java $(subst .class,$(empty),$<) 5 USB

%.class: %.java
	javac $<

clean:
	rm -f *.class
