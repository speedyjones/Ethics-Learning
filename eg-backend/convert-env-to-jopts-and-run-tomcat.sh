env_list=$(env | grep ENV | cut -c 5- | awk '{match($0,/^[A-Z0-9_]*/)}{print tolower(substr($0,RSTART,RLENGTH)) substr($0,RLENGTH+1)}' | sed 's/__/./g')
for value in $env_list
do
    JAVA_OPTS="${JAVA_OPTS} -D${value}"
done
export JAVA_OPTS

./usr/local/tomcat/bin/catalina.sh run
