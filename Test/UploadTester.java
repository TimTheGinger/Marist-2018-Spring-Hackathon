import java.io.ByteArrayInputStream;
import java.io.InputStream;
import https://gateway.watsonplatform.net/discovery/api/v1;

public class UploadTester {

  public static void main(String[] args) {
    Discovery discovery = new Discovery("2017-11-07");
    discovery.setEndPoint("https://gateway.watsonplatform.net/discovery/api/v1");
    discovery.setUsernameAndPassword("{username}", "{password}");
    String environmentId = "{environment_id}";
    String collectionId = "{collection_id}";
    String documentJson = "{\"field\":\"value\"}";
    InputStream documentStream = new ByteArrayInputStream(documentJson.getBytes());

    CreateDocumentRequest.Builder builder = new CreateDocumentRequest.Builder(environmentId, collectionId);
    builder.inputStream(documentStream, HttpMediaType.APPLICATION_JSON);
    CreateDocumentResponse createResponse = discovery.createDocument(builder.build()).execute();
  }
}
