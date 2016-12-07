all: 001 002

001: 001.hs
	stack ghc 001.hs

002: 002.hs
	stack ghc 002.hs

clean: 
	rm ??? *.hi *.o
