package com.doublesymmetry.trackplayer.extensions

import com.doublesymmetry.kotlinaudio.models.AudioPlayerState
import com.doublesymmetry.trackplayer.model.State

val AudioPlayerState.asLibState: State
    get() {
        return when(this) {
            AudioPlayerState.LOADING -> State.Connecting
            AudioPlayerState.READY -> State.Ready
            AudioPlayerState.BUFFERING -> State.Buffering
            AudioPlayerState.PAUSED -> State.Paused
            AudioPlayerState.PLAYING -> State.Playing
            AudioPlayerState.IDLE -> State.None
            AudioPlayerState.ENDED -> State.Stopped
        }
    }
