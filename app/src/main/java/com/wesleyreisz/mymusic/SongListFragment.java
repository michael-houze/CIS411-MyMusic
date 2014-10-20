package com.wesleyreisz.mymusic;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wesleyreisz.mymusic.model.Song;
import com.wesleyreisz.mymusic.service.MockMusicService;

import java.util.List;

/**
 * Created by Michael on 10/20/2014.
 */
public class SongListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_song_list_fragment,container, false);
    }
}
