# AWSDeveloper
 
## Environement setup

### SSHClient

1. Putty (free)
2. Xshell (free for personal use)

### AWS CLI installation

1. npm install awscli
2. npm install aws-shell (auto completion for many things)
- aws --version
- aws help

1. apt-get update & apt-get upgrade
2. apt-get install python-pip
3. pip install awscli
4. pip install aws-shell

## CLI Overview

- every command starts with aws

### Environement variables

- AWS_ACCESS_KEY_ID
- AWS_SECRET_ACCESS_KEY
- AWS_SESSION_TOKEN

### AWS credentials file

- Linux : ¬/.aws/credentials
- Windows: c/user/.aws/credentials

### CLI Configuration file

- Linux: ¬/.aws/config
- Windows: c/user/.aws/credentials

- ```aws configure``` changes CLI configuration file and AWS credential file

### AWS plugins for all IDE's (VS, Eclipse)

## JMESPath Query

- To filter and prettify output in aws cli http://jmespath.org/examples.html

