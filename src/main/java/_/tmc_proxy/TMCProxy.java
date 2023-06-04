import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.event.EventHandler;
import net.md_5.bungee.api.event.ChatEvent;

public class TMCProxy extends Plugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin-Initialisierung, z.B. Event-Registrierung
        getProxy().getPluginManager().registerListener(this, this);
    }

    // Event-Handler-Methode, um eingehende Chat-Ereignisse abzufangen
    @EventHandler
    public void onChat(ChatEvent event) {
        // Hier kannst du die empfangenen Chat-Nachrichten verarbeiten
        // Du kannst den ProxyHandler aufrufen oder eigene Logik implementieren
    }
}
