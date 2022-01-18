:: 1% is the grammar file name without .g4 2% is the starting token
:: grammar path has to be absolute, else antlr add the relative path to file
@set GRAMMAR_PATH=C:\Users\mati8\Desktop\Semestr5\MIAK\Colang\ColangCompiler\resources
@set OUTPUT_PATH=.\src\me\miak\parser
@echo Generating antlr files...
@java org.antlr.v4.Tool %GRAMMAR_PATH%\%1.g4 -o %OUTPUT_PATH% -visitor
::@echo Compiling...
::@call javac -cp %classpath% %GRAMMAR_PATH%\parser\%2*.java
@echo Done!
::grun %GRAMMAR_PATH%\parser1 %2 -gui