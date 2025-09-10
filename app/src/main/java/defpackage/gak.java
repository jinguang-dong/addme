package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gak implements gai {
    private final Range a;
    private final rwc b;
    private final boolean c;

    public gak(Range range, rwc rwcVar, boolean z) {
        this.a = range;
        this.b = rwcVar;
        this.c = z;
    }

    @Override // defpackage.gai
    public final Range a() {
        if (this.c) {
            rwc rwcVar = this.b;
            if (rwcVar.h()) {
                return (Range) rwcVar.c();
            }
        }
        return this.a;
    }

    @Override // defpackage.gai
    public final Range b() {
        if (this.c) {
            rwc rwcVar = this.b;
            if (rwcVar.h()) {
                return (Range) rwcVar.c();
            }
        }
        return this.a;
    }
}
