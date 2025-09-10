package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sxl extends sxm {
    final /* synthetic */ sxn a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxl(sxn sxnVar, Callable callable, Executor executor) {
        super(sxnVar, executor);
        this.a = sxnVar;
        this.c = callable;
    }

    @Override // defpackage.sys
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.sys
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.sxm
    public final void c(Object obj) {
        this.a.e(obj);
    }
}
