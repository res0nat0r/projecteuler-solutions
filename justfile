clean:
  rm -f ??? *.hi *.o

p001:
  ghc -O 001.hs

p002:
  ghc -O 002.hs

all: p001 p002
