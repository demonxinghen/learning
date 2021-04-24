## 常见错误
### issue 1
fatal: unable to access 'https://github.com/***/***.git/': OpenSSL SSL_read: Connection was reset, errno 10054

解决方法,打开git bash, 执行 git config --global http.sslVerify "false"

### issue 2
fatal: unable to access 'https://github.com/***/***.git/': Failed to connect to github.com port 443: Timed out
一般都是开了代理或者开了梯子

解决方法,打开git bash, 执行 git config --global --unset http.proxy