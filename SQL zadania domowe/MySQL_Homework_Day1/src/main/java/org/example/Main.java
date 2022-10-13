package org.example;
// POLECENIA LINK bo długie w hooy:
//https://lms.coderslab.pl/material/56/2-7/b76da61b-739a-4d18-aac1-d12cb67dfc38
public class Main01 {
    public String query1 = "SELECT * FROM users WHERE name LIKE 'Julia%';";
"
    public String query2 = "SELECT * FROM users ORDER BY email desc LIMIT 5;";

    public String query3 = "SELECT * FROM users WHERE name LIKE 'L%' AND email LIKE '%yahoo.com';";

    public String query4 = "SELECT * FROM users WHERE SHA2(CONCAT(name,salt),256) = password;";

    public String query5 = "SELECT id, title FROM offers WHERE price > 500000;";

    public String query6 = "SELECT id, price FROM offers WHERE activation_token = '' AND price BETWEEN 2000 and 400000";

    public String query7 = "SELECT title, price, phone, expire FROM offers WHERE status = '1' AND DATE_ADD(expire, INTERVAL 10 DAY) > CURRENT_TIMESTAMP();";

    public String query8 = "SELECT * FROM offers WHERE description LIKE '%violent%' AND phone LIKE '%2%' AND price > 50000;";

    public String query9 = "SELECT * FROM offers WHERE promoted = 0 AND price < 300000 AND title LIKE '%PLC';";

    public String query10 = "SELECT * FROM offers WHERE price*2 < 50000 AND promoted_to > CURRENT_TIMESTAMP();";

    public String query11 = "SELECT COUNT(*) as sum_active FROM offers WHERE expire > CURRENT_TIMESTAMP();";

    public String query12 = "SELECT owner, COUNT(*) as sum_user FROM offers WHERE expire > CURRENT_TIMESTAMP() AND status = 1 GROUP BY owner;";

    public String query13 = "SELECT status, COUNT(*) as counter FROM offers WHERE status != 0 GROUP BY status ORDER BY status DESC; ";

    public String query14 = "SELECT SUM(price) as sum_nonactive_nopromoted FROM offers WHERE promoted = 0 AND status = 1 AND expire < CURRENT_TIMESTAMP();";

    public String query15 = "SELECT ROUND(AVG(price),2) as avg_price FROM offers WHERE  expire > CURRENT_TIMESTAMP() AND promoted = 1 and price > 44645.04;";

}
