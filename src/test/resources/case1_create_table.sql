CREATE TABLE `a_log` (
  `id` bigint(20) NOT NULL,
  `instruction_id` bigint(20) NOT NULL,
  `mid` bigint(20) NOT NULL,
  `sub_contract_id` bigint(20) NOT NULL,
  `trade_code` int(11) NOT NULL,
  `account_time` bigint(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_im` (`instruction_id`,`sub_contract_id`),
  KEY `idx_sub` (`sub_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8