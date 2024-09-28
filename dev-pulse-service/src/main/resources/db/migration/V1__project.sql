CREATE TABLE project
(
    id      UUID      NOT NULL PRIMARY KEY,
    name    TEXT      NOT NULL,
    prefix  TEXT      NOT NULL UNIQUE,
    created TIMESTAMP NOT NULL
);
