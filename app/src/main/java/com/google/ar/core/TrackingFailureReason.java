package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);

    final int nativeCode;

    TrackingFailureReason(int i) {
        this.nativeCode = i;
    }

    static TrackingFailureReason forNumber(int i) {
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i) {
                return trackingFailureReason;
            }
        }
        throw new FatalException(a.bv(i, "Unexpected value for native TrackingFailureReason, value="));
    }
}
