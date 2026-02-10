const http = require("http");
const fs = require("fs");
const url = require("url");

const server = http.createServer((req, res) => {
    if (req.url === "/favicon.ico") {
        res.end();
        return;
    }

    const myUrl = url.parse(req.url, true);
    console.log(myUrl, "myUrl");

    const log = `path is: ${req.url}, method is: ${req.method}\n`;

    fs.appendFile("log.txt", log, (err) => {

        if (err) {
            res.statusCode = 500;
            res.end("Server error");
            return;
        }

        switch (myUrl.pathname) {

            case "/":
                if (req.method === "GET") {
                    res.end("this is my home page");
                }
                break;

            case "/about":
                const myName = myUrl.query.myname;
                const lastName = myUrl.query.lname;
                res.end(`my name is ${myName} ${lastName}`);
                break;

            case "/contact":
                res.end("this is contact page");
                break;
            
            case "/signup":
                if(req.method === "GET"){
                    res.end("this is signup page");
                }
                else if(req.method === "POST"){
                    res.end("signup successfully");
                }

            default:
                res.statusCode = 404;
                res.end("Page not found");
        }
    });
});

server.listen(3000, () => {
    console.log("Server is running on port 3000");
});