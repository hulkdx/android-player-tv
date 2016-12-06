package com.cube.lush.player;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.widget.ArrayObjectAdapter;

import com.cube.lush.player.model.Channel;
import com.cube.lush.player.presenter.ChannelPresenter;

import java.util.Arrays;

/**
 * Fragment shown on the launch page of the app when the "Channels" menu item is selected.
 *
 * Created by tim on 30/11/2016.
 */
public class ChannelsFragment extends MediaBrowseFragment
{
	private ArrayObjectAdapter adapter = new ArrayObjectAdapter(new ChannelPresenter());

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setAdapter(adapter);
	}

	@Override
	protected void fetchData()
	{
		adapter.clear();
		adapter.addAll(0, Arrays.asList(Channel.values()));
		setLoadingFinished(false);
	}
}
