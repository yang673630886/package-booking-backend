CREATE TABLE employee
(
    id   INTEGER PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    age  int(4)      NOT NULL
);

create table book
(
    bookNo          integer primary key,
    recipient       varchar(64),
    telNum          integer,
    status          varchar(64),
    reservationTime varchar(64),
    bookWeight      varchar(64)
);
