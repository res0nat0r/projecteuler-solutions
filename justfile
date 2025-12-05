default:
  just --list

clean:
  rm -f ??? *.hi *.o

build problem:
  ghc -O {{problem}}.hs

run problem: (build problem)
  ./{{problem}}

build-all:
  for x in *.hs;do ghc -O $x ; done
