# Microservice Product Transaction

### Heroku: This app can be found at https://sha-microsrvc-m2-transaction.herokuapp.com/

### Endpoints:

#### Save Transaction

````
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 42

{
    "userId": 2,
    "productId": 3
}
````

#### Get All Transactions of User

````
GET /api/transaction/2 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
````

#### Delete Transaction By Id

````
DELETE /api/transaction/2 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
````
