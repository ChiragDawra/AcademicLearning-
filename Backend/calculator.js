const http = require('http');
const { URL } = require('url');

const server = http.createServer((req, res) => {
    const parsedUrl = new URL(req.url, `http://${req.headers.host}`);
    const pathname = parsedUrl.pathname;

    if (pathname === '/calc') {
        const num1 = Number(parsedUrl.searchParams.get('num1'));
        const num2 = Number(parsedUrl.searchParams.get('num2'));
        const op = parsedUrl.searchParams.get('op');

        if (isNaN(num1) || isNaN(num2)) {
            res.end('Please provide valid numbers');
            return;
        }

        let result;

        switch (op) {
            case 'add':
                result = num1 + num2;
                break;

            case 'sub':
                result = num1 - num2;
                break;

            case 'mul':
                result = num1 * num2;
                break;

            case 'div':
                if (num2 === 0) {
                    res.end('Division by zero is not allowed');
                    return;
                }
                result = num1 / num2;
                break;

            default:
                res.end('Invalid operation. Use add, sub, mul, or div');
                return;
        }

        res.end(`Result: ${result}`);
    } else {
        res.end('Route not found');
    }
});

server.listen(4000, () => {
    console.log('Server running on port 4000');
});