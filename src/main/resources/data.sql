
INSERT INTO invoice (id,client,vat_rate,invoice_date) VALUES (100,'Matso',15.0,'2018-07-16 10:00:00.000');
INSERT INTO invoice (id,client,vat_rate,invoice_date) VALUES (101,'Carl',15.0,'2018-07-16 10:00:00.000');
INSERT INTO invoice (id,client,vat_rate,invoice_date) VALUES (102,'Khwinana',15.0,'2018-07-16 10:00:00.000');

INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (300,1,'Dell Laptops',12459.99,100);
INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (301,2,'Samsang Tab',4300.50,100);
INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (302,5,'Beats By Dre Headphones',4999.99,100);

INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (303,2,'Nikon DSLR',4499.99,101);
INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (304,1,'Nikon Wide Angle Lens',14300.50,101);
INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (305,1,'Voyager T1000 Tripod',4999.99,101);

INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (306,1,'Castle Lite NRB Case',160.99,102);
INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (307,2,'Glenfidch 12yr old',499.50,102);
INSERT INTO line_item (id,quantity,description,unit_price,invoice_id) VALUES (308,2,'Ice Cube 1kg',12.99,102);
