package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxk extends sxm {
    final /* synthetic */ sxn a;
    private final sxh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxk(sxn sxnVar, sxh sxhVar, Executor executor) {
        super(sxnVar, executor);
        this.a = sxnVar;
        this.c = sxhVar;
    }

    @Override // defpackage.sys
    public final /* bridge */ /* synthetic */ Object a() {
        syu syuVarA = this.c.a();
        syuVarA.getClass();
        return syuVarA;
    }

    @Override // defpackage.sys
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.sxm
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.f((syu) obj);
    }
}
