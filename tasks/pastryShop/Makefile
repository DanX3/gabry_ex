TARGET=Main

SRCS=$(shell find . -type f -name "*.java")
CLASSES=$(shell find . -type f -name "*.java" | sed 's/java/class/g')


all: $(TARGET)

$(TARGET): $(SRCS) $(CLASSES)
	java $(TARGET)

%.class: %.java
	javac $<

print:
	@echo $(CLASSES)
	@echo $(SRCS)

clean:
	rm -rf *.class
