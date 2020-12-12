INSERT INTO public.users
(a_email, addr_id, created_ts, email, first_name, is_active, last_name, manager_id, modified_by_id, modified_ts, phone1, phone2, pwd, role_id, store_id, tag, user_name)
VALUES('atestemail.com', 1, now(), 'test@email.com', 'sam', 'Y', 'simon', 1, 1, now(), '1234567890', '1234567890', 'abc1', 1, 1, 'manager', 'test@email.com');

INSERT INTO public.product_view
(brand, category_id, created_ts, description, discount, end_date, exp_date, mfd_date, modified_ts, "name", price, start_date)
VALUES('patanjali', 1, now(), 'pure for sure', 10.0, '2020-12-15', '2021-12-15', '2020-01-15', now(), 'honey', 250, '2020-01-15');