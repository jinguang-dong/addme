package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsh implements bss {
    final /* synthetic */ bsn a;
    final /* synthetic */ int b;
    final /* synthetic */ bss c;
    private final /* synthetic */ bss d;

    public bsh(bss bssVar, bsn bsnVar, int i, bss bssVar2) {
        this.a = bsnVar;
        this.b = i;
        this.c = bssVar2;
        this.d = bssVar;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.bss
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.d.e();
    }

    @Override // defpackage.bss
    public final void f() {
        bsn bsnVar = this.a;
        bsnVar.d = this.b;
        this.c.f();
        bsnVar.g(bsnVar.d);
    }

    @Override // defpackage.bss
    public final void g() {
        this.d.g();
    }
}
