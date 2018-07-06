
**Build, deploy and launch the application**


`mvn package && java -jar target/invoices-1.0.jar`


To view the database, launch the h2 console using the following:

`http://localhost:8080/h2-console`


**Application Usage**

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
 
 `[
    {
      "id": 100,
      "client": "Matso",
      "vatRate": 15,
      "invoiceDate": "2018-07-16T08:00:00.000+0000",
      "lineItems": [
        {
          "id": 300,
          "quantity": 1,
          "description": "Dell Laptops",
          "unitPrice": 12459.99,
          "lineItemTotal": 12459.99
        },
        {
          "id": 301,
          "quantity": 2,
          "description": "Samsang Tab",
          "unitPrice": 4300.5,
          "lineItemTotal": 8601
        },
        {
          "id": 302,
          "quantity": 5,
          "description": "Beats By Dre Headphones",
          "unitPrice": 4999.99,
          "lineItemTotal": 24999.95
        }
      ],
      "total": 736975.04,
      "vat": 690914.1,
      "subTotal": 46060.94
    },
    {
      "id": 101,
      "client": "Carl",
      "vatRate": 15,
      "invoiceDate": "2018-07-16T08:00:00.000+0000",
      "lineItems": [
        {
          "id": 303,
          "quantity": 2,
          "description": "Nikon DSLR",
          "unitPrice": 4499.99,
          "lineItemTotal": 8999.98
        },
        {
          "id": 304,
          "quantity": 1,
          "description": "Nikon Wide Angle Lens",
          "unitPrice": 14300.5,
          "lineItemTotal": 14300.5
        },
        {
          "id": 305,
          "quantity": 1,
          "description": "Voyager T1000 Tripod",
          "unitPrice": 4999.99,
          "lineItemTotal": 4999.99
        }
      ],
      "total": 452807.52,
      "vat": 424507.05,
      "subTotal": 28300.47
    },
    {
      "id": 102,
      "client": "Khwinana",
      "vatRate": 15,
      "invoiceDate": "2018-07-16T08:00:00.000+0000",
      "lineItems": [
        {
          "id": 306,
          "quantity": 1,
          "description": "Castle Lite NRB Case",
          "unitPrice": 160.99,
          "lineItemTotal": 160.99
        },
        {
          "id": 307,
          "quantity": 2,
          "description": "Glenfidch 12yr old",
          "unitPrice": 499.5,
          "lineItemTotal": 999
        },
        {
          "id": 308,
          "quantity": 2,
          "description": "Ice Cube 1kg",
          "unitPrice": 12.99,
          "lineItemTotal": 25.98
        }
      ],
      "total": 18975.52,
      "vat": 17789.55,
      "subTotal": 1185.97
    }
  ]`