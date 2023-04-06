# DynamoDB-JDBC
A JDBC 4.0 Compliant Driver for Amazon DynamoDB

## Setup DynamoDB local environment: Using Java
1. java runtime environment 6.x or higher
2. download DynamoDB local [download DynamoDB](https://s3.us-west-2.amazonaws.com/dynamodb-local/dynamodb_local_latest.zip)
3. run commend
```bash
 java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```
4. (optional) download NoSQL Workbench for DynamoDB [Download for Windows](https://s3.amazonaws.com/nosql-workbench/WorkbenchDDBLocal-win.exe
