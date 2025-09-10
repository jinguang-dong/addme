package com.google.android.apps.camera.imax.cyclops.image;

import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CyclopsPhotoWriter {
    static {
        System.loadLibrary("cyclops");
    }

    public static native boolean writeToFile(byte[] bArr, byte[] bArr2, PanoMeta panoMeta, AudioTrack audioTrack, String str);
}
