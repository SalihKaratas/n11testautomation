create table users(
      username varchar_ignorecase(128) not null primary key,
      password varchar_ignorecase(512) not null,
      enabled boolean not null);

create table authorities (
      username varchar_ignorecase(128) not null,
      authority varchar_ignorecase(128) not null);

create unique index idx_auth_username on authorities (username,authority);