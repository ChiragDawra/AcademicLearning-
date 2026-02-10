const http = require('http');
const fs = require('fs');

const myServer = http.createServer((req, res) => {
    if(req.url === '/favicon.ico') {
        res.writeHead(204);
        res.end();
        return;
    }
    const log = `Request URL: ${req.url}, Method: ${req.method}\n`;
    fs.appendFile('log.txt', log, (err) => {
        if (err) {
            res.statusCode = 500;
            res.end('server error');
            return;
        }
        else {
            switch(req.url) {
                case '/':
                    res.end('This is the home page');
                    break;
                
                case '/about':
                    res.end('This is the about page');
                    break;
                
                case '/contact':
                    res.end('This is the contact page');
                    break;
                case '/signup':
                    if(req.method==='GET') res.end('this is signup page')
                    else if(req.method==='POST') {
                        res.end('sign up succesfully')
                    }
                default:
                    res.statusCode = 404;
                    res.end('404 Page not found');
            }
        }
    })
    // res.write('Hello to my server');
    // res.end('Goodbye');
})
myServer.listen(3000, () => {
    console.log('Server is running on port 3000');
})