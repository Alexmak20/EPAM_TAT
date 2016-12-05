
# This is first script which the start install vagrand file.
# author Alexey Makovski.
cd 
cd vagrant-lamp-wordpress
vagrant up 

vagrant ssh  -c 'sudo sh /vagrant/firstScript.sh; /bin/bash'--wait-exit
# Running tests
echo "Executing tests."
cd
cd C:\Users\Asus\project\Wordpress
mvn test

# Shuting down VM
# vagrant halt
