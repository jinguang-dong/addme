package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rvi extends rxc {
    @Override // defpackage.rxc
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
