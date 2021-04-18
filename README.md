# ServerPing

Are you looking for an easy to use Minecraft Server List Ping library with a permissive licence? Look no further, you
just found it.

### Usage

If you are using Maven just add the following to your `pom.xml`

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.Pequla</groupId>
    <artifactId>ServerPing</artifactId>
    <version>1.0</version>
</dependency>
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