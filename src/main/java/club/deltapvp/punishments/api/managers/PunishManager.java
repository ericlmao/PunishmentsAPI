package club.deltapvp.punishments.api.managers;

import club.deltapvp.punishments.api.PunishAPI;
import club.deltapvp.punishments.api.structure.Punishment;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

/**
 * @deprecated Moved to {@link PunishAPI#getPunishManager()}
 */
@Deprecated
public abstract class PunishManager {

    @Getter
    @Setter
    private static PunishManager instance;

    public abstract Optional<Punishment> findPunishment(String input);

    public abstract void executePunishment(CommandSender staff, OfflinePlayer offender, Punishment punishment, boolean silent);

    public abstract Map<String, Punishment> getPunishmentMap();

    public abstract Map<Long, ArrayList<Object>> getBanMap();

    public abstract Map<Long, ArrayList<Object>> getMuteMap();

    public abstract Map<Long, ArrayList<Object>> getWarnMap();

    public abstract Map<Long, ArrayList<Object>> getKickMap();

    public abstract void reload();
}