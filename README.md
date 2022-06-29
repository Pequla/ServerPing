# ServerPing

Are you looking for an easy to use Minecraft Server List Ping library with a permissive licence? Look no further, you
just found it.

### Usage

If you are using Maven just add the following to your `pom.xml`

> This library uses [GitHub Maven Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry) for its maven repository

```xml
<dependencies>
    <dependency>
        <groupId>com.pequla</groupId>
        <artifactId>server-ping</artifactId>
        <version>1.1</version>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.7</version>
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
