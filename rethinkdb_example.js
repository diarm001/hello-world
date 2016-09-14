$> rethinkdb

// point the browser to localhost:8080

//create a table

r.db('DB_NAME').tableCreate('TABLE_NAME')

// Insert some JSON into the table

r.table('Sweets').insert([{ name: 'All-sorts', flavour: sour },
                            { name: 'Bullseye', flavour: sweet }])

//Count the amount of "Sweets in the table"

r.table('Sweets').count()

// Filter the sour sweets

r.table('Sweets').filter(r.row('flavour').eq('sour'))  

                      