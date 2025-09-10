package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itn {
    private static final long g;
    public final Object a;
    public final pql b;
    public final long c;
    public final itm d;
    public long e;
    public int f;

    static {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        if (longPressTimeout <= 0) {
            longPressTimeout = 400;
        }
        g = longPressTimeout * 1000000;
    }

    public itn(itm itmVar) {
        long j = g;
        pql pqlVar = new pql();
        this.a = new Object();
        this.f = 1;
        itmVar.getClass();
        a.I(j > 0);
        this.d = itmVar;
        this.c = j;
        this.b = pqlVar;
    }
}
