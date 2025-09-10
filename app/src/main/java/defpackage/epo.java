package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epo {
    public final epp a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ epq d;

    public epo(epq epqVar, epp eppVar) {
        this.d = epqVar;
        this.a = eppVar;
        this.b = eppVar.e ? null : new boolean[epqVar.d];
    }

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
