const http = require('http');
const cal = require('./app.js');

const server = http.createServer((req,res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type','text/plain');
    res.end(cal());
});

server.listen(3001, () => {
    console.log("Rodando em http://localhost:3001/");
});