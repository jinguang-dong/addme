package com.google.android.apps.camera.imax.cyclops.image;

import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StereoPanorama {
    public final byte[] a;
    public final byte[] b;
    public final PanoMeta c;
    public AudioTrack d;

    public StereoPanorama(byte[] bArr, byte[] bArr2, PanoMeta panoMeta, AudioTrack audioTrack) {
        this.a = bArr;
        this.b = bArr2;
        this.c = panoMeta;
        this.d = audioTrack;
    }

    public StereoPanorama(byte[] bArr, byte[] bArr2, PanoMeta panoMeta) {
        this(bArr, bArr2, panoMeta, null);
    }
}
