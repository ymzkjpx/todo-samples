DROP SCHEMA IF EXISTS collection CASCADE ;
CREATE SCHEMA collection;

CREATE TABLE collection.book
(
    book_number VARCHAR (36) PRIMARY KEY ,
    book_author VARCHAR (100),
    book_title VARCHAR (100),
    book_genre VARCHAR (100),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);



