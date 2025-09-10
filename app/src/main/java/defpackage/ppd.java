package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppd {
    public pos a;
    public Set b;
    public Set c;
    public Set d;
    public ppa e;
    private sbp f;

    public final ppe a() {
        Set set;
        Set set2;
        ppa ppaVar;
        sbp sbpVar;
        Set set3 = this.b;
        if (set3 == null || (set = this.c) == null || (set2 = this.d) == null || (ppaVar = this.e) == null || (sbpVar = this.f) == null) {
            throw new IllegalStateException();
        }
        return new ppe(this.a, set3, set, set2, ppaVar, sbpVar);
    }

    public final void b(sbp sbpVar) {
        sbpVar.getClass();
        this.f = sbpVar;
    }
}
