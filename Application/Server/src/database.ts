import { createPool } from 'mysql2/promise';

export async function connect () {
   const connection = await createPool({
      host : 'localhost',
      user : 'root',
      password : 'Colombia123',
      database : 'cryptoapp',
      port : 3306,
      connectionLimit : 10
   })

   return connection;
}
