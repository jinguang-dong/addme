package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqc {
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public boolean e = false;
    private final PendingIntent f;

    public rqc(int i, int i2, int i3, Integer num, PendingIntent pendingIntent) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.f = pendingIntent;
    }

    public final boolean a() {
        return b() != null;
    }

    public final PendingIntent b() {
        PendingIntent pendingIntent = this.f;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        return null;
    }
}
