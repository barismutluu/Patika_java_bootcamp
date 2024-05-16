```sql
## 1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE TEST (
ID INTEGER,
NAME VARCHAR(50) NOT NULL,
BIRTHDAY DATE,
EMAIL VARCHAR(100)
);
## 2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into test (id, name, birthday, email) values (1, 'Catlee', '1930-06-28', 'cchatan0@php.net');
insert into test (id, name, birthday, email) values (2, 'Jody', '1951-10-30', 'jshires1@bloglovin.com');
insert into test (id, name, birthday, email) values (3, 'Blakelee', '1935-11-05', 'bmurdie2@istockphoto.com');
insert into test (id, name, birthday, email) values (4, 'Philip', '1905-05-01', 'pbeckinsale3@yolasite.com');
insert into test (id, name, birthday, email) values (5, 'Leta', '2005-09-23', 'lbenoist4@independent.co.uk');
insert into test (id, name, birthday, email) values (6, 'Myca', '1912-12-27', 'mswyersexey5@kickstarter.com');
insert into test (id, name, birthday, email) values (7, 'Arte', '1904-02-26', 'agoldis6@i2i.jp');
insert into test (id, name, birthday, email) values (8, 'Desiree', '2016-09-08', 'djanning7@yahoo.co.jp');
insert into test (id, name, birthday, email) values (9, 'Isabelle', '1932-03-18', 'ibennion8@ycombinator.com');
insert into test (id, name, birthday, email) values (10, 'Claribel', '1917-12-26', 'cpadefield9@liveinternet.ru');
insert into test (id, name, birthday, email) values (11, 'Edvard', '1969-07-27', 'ecasementa@wufoo.com');
insert into test (id, name, birthday, email) values (12, 'Bjorn', '2000-04-28', 'bfeldharkerb@mayoclinic.com');
insert into test (id, name, birthday, email) values (13, 'Joyce', '1907-11-25', 'jvanyukhinc@apple.com');
insert into test (id, name, birthday, email) values (14, 'Colene', '1902-08-13', 'ccassellad@altervista.org');
insert into test (id, name, birthday, email) values (15, 'Manuel', '2004-02-18', 'mpratchette@weather.com');
insert into test (id, name, birthday, email) values (16, 'Zacharias', '2013-12-27', 'zbickerstafff@yelp.com');
insert into test (id, name, birthday, email) values (17, 'Marv', '1922-01-07', 'mrarityg@umich.edu');
insert into test (id, name, birthday, email) values (18, 'Letta', '1906-04-16', 'lfaash@jimdo.com');
insert into test (id, name, birthday, email) values (19, 'Schuyler', '1936-03-12', 'skeaysi@youku.com');
insert into test (id, name, birthday, email) values (20, 'Abrahan', '1972-05-16', 'amingardj@joomla.org');
insert into test (id, name, birthday, email) values (21, 'Nikolaos', '2022-05-29', 'nmonroek@yellowbook.com');
insert into test (id, name, birthday, email) values (22, 'Oliy', '1902-12-27', 'odelial@sourceforge.net');
insert into test (id, name, birthday, email) values (23, 'Wallie', '1977-10-07', 'wwhiffinm@rediff.com');
insert into test (id, name, birthday, email) values (24, 'Misti', '1945-03-26', 'mniemetzn@nsw.gov.au');
insert into test (id, name, birthday, email) values (25, 'Baxie', '1952-01-12', 'bduthieo@clickbank.net');
insert into test (id, name, birthday, email) values (26, 'Ericha', '1918-07-15', 'eleblancp@barnesandnoble.com');
insert into test (id, name, birthday, email) values (27, 'Morena', '1961-07-02', 'mtournieq@nyu.edu');
insert into test (id, name, birthday, email) values (28, 'Maxine', '2018-03-13', 'mtregidgor@army.mil');
insert into test (id, name, birthday, email) values (29, 'Bartlett', '1948-06-10', 'bchessons@barnesandnoble.com');
insert into test (id, name, birthday, email) values (30, 'Sarajane', '1974-09-19', 'srollot@reuters.com');
insert into test (id, name, birthday, email) values (31, 'Arleen', '1990-01-18', 'arealyu@harvard.edu');
insert into test (id, name, birthday, email) values (32, 'Jenine', '1924-03-24', 'jclampev@angelfire.com');
insert into test (id, name, birthday, email) values (33, 'Neely', '1942-03-18', 'nhundleyw@flickr.com');
insert into test (id, name, birthday, email) values (34, 'Dan', '1983-01-28', 'dsaywellx@newyorker.com');
insert into test (id, name, birthday, email) values (35, 'Nadya', '2020-12-09', 'nvanderbrugy@diigo.com');
insert into test (id, name, birthday, email) values (36, 'Amelina', '1909-05-02', 'acrangz@npr.org');
insert into test (id, name, birthday, email) values (37, 'Nickie', '1908-04-18', 'nepdell10@merriam-webster.com');
insert into test (id, name, birthday, email) values (38, 'Neddie', '1990-04-19', 'ncottrell11@time.com');
insert into test (id, name, birthday, email) values (39, 'Brock', '1950-08-01', 'brodrig12@elegantthemes.com');
insert into test (id, name, birthday, email) values (40, 'Griffith', '1948-05-22', 'gworley13@so-net.ne.jp');
insert into test (id, name, birthday, email) values (41, 'Dorothea', '1971-01-26', 'dwaren14@cmu.edu');
insert into test (id, name, birthday, email) values (42, 'Dolf', '1935-03-01', 'dreid15@state.gov');
insert into test (id, name, birthday, email) values (43, 'Stern', '1973-09-15', 'shorsey16@addthis.com');
insert into test (id, name, birthday, email) values (44, 'Demetre', '1930-12-06', 'dledgister17@slashdot.org');
insert into test (id, name, birthday, email) values (45, 'Nady', '1943-09-18', 'nwhichelow18@google.ca');
insert into test (id, name, birthday, email) values (46, 'Elisha', '1913-08-29', 'emattek19@about.me');
insert into test (id, name, birthday, email) values (47, 'Isaiah', '1946-12-31', 'iashingden1a@vimeo.com');
insert into test (id, name, birthday, email) values (48, 'Brewster', '2000-08-11', 'bgorton1b@nih.gov');
insert into test (id, name, birthday, email) values (49, 'Raddie', '1989-05-15', 'rschimoni1c@va.gov');
insert into test (id, name, birthday, email) values (50, 'Verge', '1957-10-15', 'vrozea1d@microsoft.com');

## 3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE test
SET name = 'Mayak',
email = 'cchatan0@php.net'
WHERE id = 2;
UPDATE test
SET name = 'Ali',
email = 'ali0@php.net'
WHERE id = 3;
UPDATE test
SET name = 'Alia',
email = 'ali0@php.net'
WHERE id = 1;
UPDATE test
SET name = 'Ali0',
email = 'alssi0@php.net'
WHERE id = 4;
UPDATE test
SET name = 'vvi',
email = 'av1230@php.net'
WHERE id = 6;
## 4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM test
WHERE name = 'Ali';
DELETE FROM TEST
WHERE NAME = 'Ali';
