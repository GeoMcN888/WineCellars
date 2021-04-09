insert into wines (name, grapes, country, region, year, picture, description) values ("Kelehr Red", "Moorish", "Italy", "Northern", "1999", "sjgernaqgerdhrdj", "Great quality red wine from Italy");
insert into wines (name, grapes, country, region, year, picture, description) values ("Dada Chocolat", "Merlot", "Italy", "Northern", "1976", "sjgernaqgerdhrdj", "Great quality Dada red wine from Italy");
insert into wines (name, grapes, country, region, year, picture, description) values ("Boolean Red", "Shiraz", "France", "Southern", "1989", "sjgernaqgerdhrdj", "Fruity aroma red wine");
insert into wines (name, grapes, country, region, year, picture, description) values ("Cottirol", "Merlot", "Italy", "Northern", "1979", "sjgernaqgerdhrdj", "Another wine");

insert into suppliers (name, country)  values ("Cash Vin", "France");
insert into suppliers (name, country)  values ("Tenute dItalia", "Italy");
insert into suppliers (name, country)  values ("Sommellerie de France", "France");
insert into suppliers (name, country)  values ("Lavinia", "France");
insert into suppliers (name, country)  values ("Carlota", "Spain");
insert into suppliers (name, country)  values ("La Llar del Vi", "Spain");
insert into suppliers (name, country)  values ("Italian Wine Merchants", "Italy");
insert into suppliers (name, country)  values ("Bodega Santa Cecilia", "Spain");
insert into suppliers (name, country)  values ("Fecovita", "Argentina");
insert into suppliers (name, country)  values ("Baggio", "Argentina");
insert into suppliers (name, country)  values ("Youngs Market Co.", "USA");
insert into suppliers (name, country)  values ("Empire Merchants", "USA");
insert into suppliers (name, country)  values ("Winebow Group", "USA");
insert into suppliers (name, country)  values ("Southern Glazers Wine & Spirits", "USA");
insert into suppliers (name, country)  values ("Breakthru Beverage Group", "USA");

insert into supplier_wines(supplier_id,wine_id) values (1,2);
insert into supplier_wines(supplier_id,wine_id) values (1,1);
insert into supplier_wines(supplier_id,wine_id) values (2,1);
insert into supplier_wines(supplier_id,wine_id) values (3,2);
insert into supplier_wines(supplier_id,wine_id) values (4,4);
insert into supplier_wines(supplier_id,wine_id) values (2,3);