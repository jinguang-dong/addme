package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcz implements qcr {
    final /* synthetic */ rwc a;
    final /* synthetic */ Context b;
    private final /* synthetic */ int c;

    public qcz(rwc rwcVar, Context context, int i) {
        this.c = i;
        this.a = rwcVar;
        this.b = context;
    }

    @Override // defpackage.qcr
    public final void a(String str, int i) {
        if (this.c != 0) {
            if (i == 1) {
                rwc rwcVar = this.a;
                if (rwcVar.h()) {
                    prh.u(this.b, (Class) rwcVar.c(), str);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            rwc rwcVar2 = this.a;
            if (rwcVar2.h()) {
                prh.u(this.b, (Class) rwcVar2.c(), str);
            }
        }
    }

    @Override // defpackage.qcr
    public final void b(String str, int i) {
        if (this.c != 0) {
            if (i == 0) {
                rwc rwcVar = this.a;
                if (rwcVar.h()) {
                    prh.v(this.b, (Class) rwcVar.c(), str);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 0) {
            rwc rwcVar2 = this.a;
            if (rwcVar2.h()) {
                prh.v(this.b, (Class) rwcVar2.c(), str);
            }
        }
    }
}
