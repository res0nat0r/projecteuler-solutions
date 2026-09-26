set default-list := true

clean:
  for x in p??? ; do cd ${x} ; lein clean ; cd .. ; done

run problem: 
  @echo running {{problem}}
  cd {{problem}} && lein run {{problem}}

run-all:
  for x in p??? ; do cd ${x} ; lein run ; cd .. ; done
