package com.WTFGeeks.treasuregoblins.client.handler;

import com.WTFGeeks.treasuregoblins.client.settings.Keybindings;
import com.WTFGeeks.treasuregoblins.reference.Key;
import com.WTFGeeks.treasuregoblins.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler 
{
	private static Key getPressedKeybinding()
	{
		if (Keybindings.charge.isPressed())
		{
			return Key.CHARGE;
		}
		else if (Keybindings.release.isPressed())
		{
			return Key.RELEASE;
		}
		
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		LogHelper.info(getPressedKeybinding());
	}


}
