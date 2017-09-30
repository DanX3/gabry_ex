TARGET=tasks.pdf

all: $(TARGET)

$(TARGET): tasks.tex
	pdflatex tasks.tex

clean:
	@rm -f *.aux *.toc *.log
