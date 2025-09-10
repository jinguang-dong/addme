package com.google.ar.core;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface EarthNetworkClientInterface {

    /* compiled from: PG */
    public enum ServiceMethod {
        LOCALIZE(0),
        FACADES(1),
        BLUESKY(2),
        WARMUP(3),
        TERRAIN_POINT(4),
        TERRAIN_CELL(5),
        VPS_AVAILABILITY(6);

        final int nativeCode;

        ServiceMethod(int i) {
            this.nativeCode = i;
        }
    }

    void post(ServiceMethod serviceMethod, ByteBuffer byteBuffer, EarthNetworkCallbackInterface earthNetworkCallbackInterface);
}
