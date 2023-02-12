# ServerPing

Are you looking for a simple-to-use Minecraft Server List Ping library with a permissive licence? Look no further, you
just found it.

### Usage

If you are using Maven just add the following to your `pom.xml`

```xml
<repositories>
    <repository>
        <id>pequla-repo</id>
        <url>https://maven.pequla.com/releases</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.pequla</groupId>
        <artifactId>server-ping</artifactId>
        <version>1.2</version>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```

### Example

```java
public class ServerPingExample {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("play.beocraft.net");
        int port = 25565;
        ServerPing ping = new ServerPing(new InetSocketAddress(address, port));
        StatusResponse response = ping.fetchData();
        System.out.println(response.getPlayers().getOnline());
    }
}
```
