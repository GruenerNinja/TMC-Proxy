import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.nio.charset.StandardCharsets;

public class ProxyHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        try {
            if (msg instanceof ByteBuf) {
                ByteBuf buf = (ByteBuf) msg;
                byte[] bytes = new byte[buf.readableBytes()];
                buf.readBytes(bytes);

                String message = new String(bytes, StandardCharsets.UTF_8);
                // Hier kannst du die empfangenen Chat-Nachrichten verarbeiten
                // Zum Beispiel: Überprüfen auf bestimmte Zeichenkette und entsprechende Aktion ausführen

                // Beispiel: Wenn die Nachricht "test" enthält, sende sie an den Spieler "player1" zurück
                if (message.contains("test")) {
                    ProxiedPlayer player = // Hier den Spieler anhand des Namens "player1" abrufen
                            player.sendMessage("Du hast 'test' gesagt!");
                }
            }
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }
}
