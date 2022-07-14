create table info
(
    id            int auto_increment,
    type           int               null,
    name          varchar(50)       not null,
    title         varchar(50)       null,
    start_date_time datetime          null,
    end_date_time   datetime          null,
    repeat_collect_type int default 1 not null,
    repeat_value int null,
    is_auto_send    tinyint   default 0       not null,
    send_date_time   datetime          null,
    send_type int null,
    send_message varchar(1000) null,
    send_customer_type int null,
    send_customers varchar(1000) null,
    url varchar(1000) null,
    status int default 1 not null,
    other     varchar(2000)       null,
    is_deleted     tinyint default 0 not null,
    deleted_at     datetime          null,
    deleted_by     int               null,
    created_at     datetime          not null,
    created_by     int               null,
    updated_at     datetime          null,
    updated_by     int               null,
    constraint info_pk
        primary key (id)
);

