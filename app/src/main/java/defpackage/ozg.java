package defpackage;

import android.hardware.HardwareBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ozg {
    final HardwareBuffer a;
    final long b;
    final int c;
    private final poj d;

    public ozg(poj pojVar, long j, int i) {
        this.d = pojVar;
        this.b = j;
        this.c = i;
        this.a = pojVar.f();
    }

    final void a() {
        HardwareBuffer hardwareBuffer = this.a;
        if (hardwareBuffer != null) {
            hardwareBuffer.close();
        }
        this.d.close();
    }
}
