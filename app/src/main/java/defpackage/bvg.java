package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvg implements bss {
    private final /* synthetic */ bss a;
    private final int b;
    private final int c;

    public bvg(bss bssVar, bvh bvhVar) {
        this.a = bssVar;
        bvu bvuVar = bvhVar.h;
        bvuVar.getClass();
        this.b = bvuVar.a;
        bvuVar.getClass();
        this.c = bvuVar.b;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bss
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.bss
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.bss
    public final void g() {
        this.a.g();
    }
}
