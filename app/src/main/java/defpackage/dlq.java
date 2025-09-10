package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlq implements bss {
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final int f;
    public final long g;
    public final chq h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    private final /* synthetic */ bss m;

    public dlq(bss bssVar, int i, int i2, int i3, List list, int i4, int i5, long j, chq chqVar, int i6, int i7, boolean z, boolean z2) {
        this.m = bssVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
        this.e = i4;
        this.f = i5;
        this.g = j;
        this.h = chqVar;
        this.i = i6;
        this.j = i7;
        this.k = z;
        this.l = z2;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.m.a();
    }

    @Override // defpackage.bss
    public final int b() {
        return this.m.b();
    }

    public final long c() {
        return (b() << 32) | (a() & 4294967295L);
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.m.e();
    }

    @Override // defpackage.bss
    public final void f() {
        this.m.f();
    }

    @Override // defpackage.bss
    public final void g() {
        this.m.g();
    }
}
