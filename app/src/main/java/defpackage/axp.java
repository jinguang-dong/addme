package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class axp implements axr {
    public final Object a;
    public Object b;
    private final ArrayList c = new ArrayList();

    public axp(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.axr
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.axr
    public final /* synthetic */ void b(uiu uiuVar, Object obj) {
        uiuVar.a(a(), obj);
    }

    @Override // defpackage.axr
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.axr
    public final void d(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.axr
    public /* synthetic */ void g() {
        throw null;
    }

    @Override // defpackage.axr
    public final void h() {
        this.b = bbn.a(this.c);
    }

    @Override // defpackage.axr
    public /* synthetic */ void f() {
    }
}
