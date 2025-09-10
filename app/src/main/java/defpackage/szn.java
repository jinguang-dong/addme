package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class szn extends sys {
    final /* synthetic */ szo a;
    private final Callable b;

    public szn(szo szoVar, Callable callable) {
        this.a = szoVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.sys
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.sys
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.sys
    public final void d(Throwable th) {
        this.a.a(th);
    }

    @Override // defpackage.sys
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.sys
    public final boolean g() {
        return this.a.isDone();
    }
}
