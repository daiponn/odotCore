INSERT INTO odot_category(name, description, when_created) VALUES('TEST_CATEGORY1', 'TEST_DESCRIPTION1', CURRENT_DATE);
INSERT INTO odot_category(name, description, when_created) VALUES('TEST_CATEGORY2', 'TEST_DESCRIPTION2', CURRENT_DATE);
INSERT INTO odot_category(name, description, when_created) VALUES('TEST_CATEGORY3', 'TEST_DESCRIPTION3', CURRENT_DATE);
INSERT INTO odot_category(name, description, when_created) VALUES('TEST_CATEGORY4', 'TEST_DESCRIPTION4', CURRENT_DATE);

INSERT INTO odot_item(description, due_date, finished, category_id) VALUES('TODO Item #1', CURRENT_DATE, false, (SELECT id FROM odot_category WHERE name = 'TEST_CATEGORY1'));
INSERT INTO odot_item(description, due_date, finished, category_id) VALUES('TODO Item #2', CURRENT_DATE, false, (SELECT id FROM odot_category WHERE name = 'TEST_CATEGORY2'));
INSERT INTO odot_item(description, due_date, finished, category_id) VALUES('TODO Item #3', CURRENT_DATE, false, (SELECT id FROM odot_category WHERE name = 'TEST_CATEGORY3'));
INSERT INTO odot_item(description, due_date, finished, category_id) VALUES('TODO Item #4', CURRENT_DATE, false, (SELECT id FROM odot_category WHERE name = 'TEST_CATEGORY4'));
INSERT INTO odot_item(description) VALUES('TODO Item #5');  
INSERT INTO odot_item(description, due_date) VALUES('TODO Item #6', CURRENT_DATE);  
INSERT INTO odot_item(description, due_date, finished) VALUES('TODO Item #7', CURRENT_DATE, false);  
  
