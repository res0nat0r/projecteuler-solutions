default:
  just --list

clean:
  rm -f ??? *.hi *.o

build problem:
  ghc -O {{problem}}.hs

run problem: (build problem)
  ./{{problem}}

runghc problem:
  runghc {{problem}}.hs

build-all:
  for x in *.hs ; do ghc -O $x ; done

run-all: build-all
  for x in ??? ; do echo ${x}: ; ./$x ; echo ; done
