1.city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```sql
 SELECT *
FROM city
 INNER JOIN country ON country.country_id = city.country_id;
```
2.customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```sql
 SELECT first_name,last_name,payment.customer_id
 FROM customer
 INNER JOIN payment ON payment.customer_id = customer.customer_id;
```
3.customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```sql
SELECT customer.first_name,customer.last_name,*
FROM rental
JOIN customer ON rental.customer_id = customer.customer_id;
```