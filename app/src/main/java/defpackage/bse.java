package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bse implements bss {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ bsf d;
    final /* synthetic */ bsn e;
    final /* synthetic */ uiq f;

    public bse(int i, int i2, Map map, bsf bsfVar, bsn bsnVar, uiq uiqVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = bsfVar;
        this.e = bsnVar;
        this.f = uiqVar;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bss
    public final int b() {
        return this.a;
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.c;
    }

    @Override // defpackage.bss
    public final void f() {
        bvu bvuVar;
        if (!this.d.dt() || (bvuVar = ((bva) this.e.a.n()).g) == null) {
            this.f.a(this.e.a.n().l);
        } else {
            this.f.a(bvuVar.l);
        }
    }

    @Override // defpackage.bss
    public final void g() {
    }
}
