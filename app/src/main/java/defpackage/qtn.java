package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtn implements qov {
    final /* synthetic */ syx a;
    public final /* synthetic */ qtp b;

    public qtn(qtp qtpVar, syx syxVar) {
        this.a = syxVar;
        this.b = qtpVar;
    }

    @Override // defpackage.qov
    public final void i(qna qnaVar) {
        qtp qtpVar = this.b;
        qtpVar.d.a(3, qnaVar.a);
        qtpVar.a();
        qtpVar.f = this.a.d(new pev(this, qnaVar, 14, null), 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.qov
    public final void j(qna qnaVar) {
        qtp qtpVar = this.b;
        qtpVar.d.a(4, qnaVar.a);
        qtpVar.a();
        qtpVar.e = this.a.d(new ovw(this, qnaVar, 13, null), 10L, TimeUnit.SECONDS);
    }
}
