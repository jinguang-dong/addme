package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bra implements bss {
    final /* synthetic */ uiq a;
    final /* synthetic */ brb b;
    private final int c;
    private final int d;
    private final Map e;

    public bra(int i, int i2, Map map, uiq uiqVar, brb brbVar) {
        this.a = uiqVar;
        this.b = brbVar;
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bss
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.e;
    }

    @Override // defpackage.bss
    public final void f() {
        this.a.a(this.b.a.l);
    }

    @Override // defpackage.bss
    public final void g() {
    }
}
