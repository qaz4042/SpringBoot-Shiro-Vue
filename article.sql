-- auto-generated definition
create table article_catalog
(
    id            int auto_increment
        primary key,
    content       varchar(255) default ''                null comment '文章内容',
    create_time   timestamp    default CURRENT_TIMESTAMP null comment '创建时间',
    update_time   timestamp    default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    delete_status varchar(1)   default '1'               null comment '是否有效  1.有效  2无效'
)
    comment '文章目录表';