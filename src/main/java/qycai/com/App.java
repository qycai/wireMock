package qycai.com;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class App {
    //定义mock服务的端口
    private static final int PORT = 9090;

    //定义mock服务的地址
        private static final String LOCALHOST = "localhost";

    //定义mapping文件目录
    private static final String MOCK_DIR = "mock";

    public static void main(String[] args) {
        WireMockServer wireMockServer = new WireMockServer(options().port(PORT).usingFilesUnderClasspath(MOCK_DIR));
        wireMockServer.start();
        WireMock.configureFor(LOCALHOST, PORT);
    }
}
