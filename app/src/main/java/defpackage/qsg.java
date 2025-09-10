package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsg extends qpt implements qqs {
    public final qqp a;
    public final Context b;
    public final Executor e;
    public final uem f;
    public final tzj g;
    public final uem h;
    public final uem i;
    public final uem j;
    public final qsd k;
    public final qoa l;
    public final rcg m;

    public qsg(qqq qqqVar, Context context, Executor executor, qsd qsdVar, uem uemVar, tzj tzjVar, qoa qoaVar, rcg rcgVar, uem uemVar2, uem uemVar3, uem uemVar4) {
        super((char[]) null);
        this.a = qqqVar.a(executor, tzjVar, null);
        this.b = context;
        this.e = executor;
        this.k = qsdVar;
        this.f = uemVar;
        this.l = qoaVar;
        this.m = rcgVar;
        this.g = tzjVar;
        this.h = uemVar2;
        this.i = uemVar3;
        this.j = uemVar4;
    }

    @Override // defpackage.qqs
    public final void cA() {
        qrr qrrVar = new qrr(this, 3);
        Executor executor = this.e;
        ske.R(qrrVar, executor);
        ske.P(new pgr(this, 7), executor);
    }
}
