#!/bin/bash
echo "Entering Ununtu."

echo "Importing sql table."

mysql -u root -proot wordpress < /vagrant/wordpressBD1.sql
echo "Exiting Ubuntu."