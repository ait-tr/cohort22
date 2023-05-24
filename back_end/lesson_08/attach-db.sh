#!/bin/bash -x

docker run -it --network=host --rm mysql mysql --host=127.0.0.1 --user=webapp --password=secret events
