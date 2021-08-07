Basic
1. The API storeurl shall take a URL as a parameter and save that into a table with a unique short
key and a count(usage count) initialised to 0.  -- Done
Use in-memory data structures instead of a database to store the data.
Use any appropriate logic to generate the unique short key. -- Done
2. The API get shall take a URL as a parameter and return the unique short key after incrementing
the usage count. -- Done
3. The API count shall take a URL as a parameter and should return the latest usage count.
4. The API list should return all urls and counts with pagination. The return value is in JSON.
5. APIs shall be simultaneously executed by multi-users.
