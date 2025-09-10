package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);

    final int nativeCode;

    PlaybackStatus(int i) {
        this.nativeCode = i;
    }

    static PlaybackStatus forNumber(int i) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        throw new FatalException(a.bv(i, "Unexpected value for native PlaybackStatus, value="));
    }
}
