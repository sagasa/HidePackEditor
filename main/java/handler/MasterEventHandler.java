package handler;

import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

/**イベントハンドラ ここから各種ハンドラに投げる*/
public class MasterEventHandler {

	/**プレイヤーアップデート こいつで銃の発射判定その他を行う*/
	@SubscribeEvent
	public void onEvent(PlayerTickEvent event)	{
		PlayerTickHandler.PlayerUpdate(event);
	}

}
