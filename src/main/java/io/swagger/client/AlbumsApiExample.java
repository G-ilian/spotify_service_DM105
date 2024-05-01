package io.swagger.client;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlbumsApi;
import java.io.FileWriter;
import java.io.IOException;

public class AlbumsApiExample {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth_2_0
        OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
        String acessToken = "SEU_TOKEN_DE_ACESSO";

        oauth_2_0.setAccessToken(acessToken);

        AlbumsApi apiInstance = new AlbumsApi();
        String country = "BR"; // String |
        Integer limit = 20; // Integer |
        Integer offset = 5; // Integer |
        try {
            InlineResponse20010 result = apiInstance.getNewReleases(limit,offset);
            // Write JSON string to a file
            writeToFile("RESULTADO_ALBUNS.json", result.toString());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#getNewReleases");
            e.printStackTrace();
        }
    }
    private static void writeToFile(String fileName, String content) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Resultado gravado em " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo " + fileName);
            e.printStackTrace();
        }
    }
}