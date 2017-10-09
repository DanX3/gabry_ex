TARGET=Main.class
SRCS=$(shell find -name "*.java")
all: $(TARGET)
	java Main

$(TARGET): $(SRCS)
	javac $^

%.java:
	javac $@

clean:
	rm -rf *.class

