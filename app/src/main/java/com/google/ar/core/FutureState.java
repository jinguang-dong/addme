package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum FutureState {
    PENDING(0),
    CANCELLED(1),
    DONE(2);

    final int nativeCode;

    FutureState(int i) {
        this.nativeCode = i;
    }

    static FutureState forNumber(int i) {
        for (FutureState futureState : values()) {
            if (futureState.nativeCode == i) {
                return futureState;
            }
        }
        throw new FatalException(a.bv(i, "Unexpected value for native FutureState, value="));
    }
}
