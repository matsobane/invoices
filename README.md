
**Build, deploy and launch the application**

`mvn package && target/`


To view the database, launch the h2 console using the following:

`http://localhost:8080/h2-console`


**Usage**

Using your favourate REST client.

_Add Invoice_  
URL:http://localhost:8080/invoices
Method:POST 
Request Payload:

`{
     "client": "Matsobane",
     "vatRate": 15,
     "invoiceDate": "2018-07-16T08:00:00.000+0000",
     "lineItems": [
       {
         "quantity": 1,
         "description": "Dell Screen",
         "unitPrice": 1459.99
       },
       {
         "quantity": 2,
         "description": "Samsang Tab",
         "unitPrice": 4300.5
       },
       {
         "quantity": 3,
         "description": "Beats By Dre Headphones",
         "unitPrice": 4999.99
       }
     ]
   }
   `
   
Expected Response headers should look something like: 

`{
   "date": "Fri, 06 Jul 2018 09:43:15 GMT",
   "content-length": "0",
   "status": 201
 }`
 
 _View All invoices_ 
 Method:GET 
 URL: http://localhost:8080/invoices
 Expected Response payload:
 
 ``