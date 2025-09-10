package com.google.vr.vrcore.controller.api;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import defpackage.tya;
import defpackage.tyb;
import defpackage.tyc;
import defpackage.tye;
import defpackage.tyf;
import defpackage.tyg;
import defpackage.tyi;
import defpackage.tyj;
import defpackage.tyn;
import defpackage.typ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeCallbacks implements ControllerServiceBridge.Callbacks {
    private final long a;
    private boolean b;

    public NativeCallbacks(long j) {
        this.a = j;
    }

    private native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleServiceConnected(long j, int i);

    private native void handleServiceDisconnected(long j);

    private native void handleServiceFailed(long j);

    private native void handleServiceInitFailed(long j, int i);

    private native void handleServiceUnavailable(long j);

    private native void handleStateChanged(long j, int i, int i2);

    private native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    private native void handleTrackingStatusEvent(long j, int i, long j2, int i2);

    private final void j(tyf tyfVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        NativeCallbacks nativeCallbacks = this;
        int i6 = 0;
        for (int i7 = 0; !nativeCallbacks.b && i7 < (i5 = tyfVar.l); i7++) {
            if (i7 >= i5) {
                throw new IndexOutOfBoundsException();
            }
            tya tyaVar = tyfVar.m[i7];
            nativeCallbacks.handleAccelEvent(nativeCallbacks.a, tyaVar.e, tyaVar.d, tyaVar.a, tyaVar.b, tyaVar.c);
        }
        for (int i8 = 0; !nativeCallbacks.b && i8 < (i4 = tyfVar.n); i8++) {
            if (i8 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            tyc tycVar = tyfVar.o[i8];
            nativeCallbacks.handleButtonEvent(nativeCallbacks.a, tycVar.e, tycVar.d, tycVar.a, tycVar.b);
        }
        for (int i9 = 0; !nativeCallbacks.b && i9 < (i3 = tyfVar.p); i9++) {
            if (i9 >= i3) {
                throw new IndexOutOfBoundsException();
            }
            tyg tygVar = tyfVar.q[i9];
            nativeCallbacks.handleGyroEvent(nativeCallbacks.a, tygVar.e, tygVar.d, tygVar.a, tygVar.b, tygVar.c);
        }
        for (int i10 = 0; !nativeCallbacks.b && i10 < (i2 = tyfVar.r); i10++) {
            if (i10 >= i2) {
                throw new IndexOutOfBoundsException();
            }
            tyi tyiVar = tyfVar.s[i10];
            nativeCallbacks.handleOrientationEvent(nativeCallbacks.a, tyiVar.e, tyiVar.d, tyiVar.a, tyiVar.b, tyiVar.c, tyiVar.f);
        }
        while (!nativeCallbacks.b && i6 < (i = tyfVar.t)) {
            if (i6 >= i) {
                throw new IndexOutOfBoundsException();
            }
            tyn tynVar = tyfVar.u[i6];
            nativeCallbacks.handleTouchEvent(nativeCallbacks.a, tynVar.e, tynVar.d, tynVar.b, tynVar.c, tynVar.f);
            i6++;
            nativeCallbacks = this;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void a(tyf tyfVar) {
        if (this.b) {
            return;
        }
        j(tyfVar);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void b(tye tyeVar) {
        int i;
        if (!this.b) {
            j(tyeVar);
            int i2 = 0;
            for (int i3 = 0; !this.b && i3 < (i = tyeVar.c); i3++) {
                if (i3 >= i) {
                    throw new IndexOutOfBoundsException();
                }
                tyj tyjVar = tyeVar.d[i3];
                handlePositionEvent(this.a, tyjVar.e, tyjVar.d, tyjVar.a, tyjVar.b, tyjVar.c);
            }
            while (true) {
                if (this.b) {
                    break;
                }
                int i4 = tyeVar.h;
                if (i2 < i4) {
                    if (i2 >= i4) {
                        throw new IndexOutOfBoundsException();
                    }
                    typ typVar = tyeVar.i[i2];
                    handleTrackingStatusEvent(this.a, typVar.e, typVar.d, typVar.a);
                    i2++;
                } else if (tyeVar.e) {
                    tyb tybVar = tyeVar.f;
                    handleBatteryEvent(this.a, tybVar.e, tybVar.d, tybVar.b, tybVar.a);
                    return;
                }
            }
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void c(tyi tyiVar) throws Throwable {
        try {
            try {
                if (this.b) {
                    return;
                }
                handleControllerRecentered(this.a, tyiVar.e, tyiVar.d, tyiVar.a, tyiVar.b, tyiVar.c, tyiVar.f);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void close() {
        this.b = true;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void d(int i, int i2) {
        if (this.b) {
            return;
        }
        handleStateChanged(this.a, i, i2);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void e() {
        if (this.b) {
            return;
        }
        handleServiceDisconnected(this.a);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void f() {
        if (this.b) {
            return;
        }
        handleServiceFailed(this.a);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void g(int i) {
        if (this.b) {
            return;
        }
        handleServiceInitFailed(this.a, i);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void h() {
        if (this.b) {
            return;
        }
        handleServiceUnavailable(this.a);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void i() {
        if (this.b) {
            return;
        }
        handleServiceConnected(this.a, 1);
    }
}
