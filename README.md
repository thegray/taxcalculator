# Prerequisite:
Java 8, Maven and MySQL

# Database
This app will connect to MySQL with database named 'tax' , username 'root' and password 'root'

# Manual build instruction
At root project root directory, run command below
$./build.sh

# Manual run app
At root project root directory, run command below
To start in interactive mode:
$./run.sh

# Docker
before creating docker image/container, please build the app first by running the command below:
maven clean install
or
use manual build script provided before

# Documentations
Documentations can be found in ./doc/ directory
