package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qiw extends qis {
    final /* synthetic */ qfy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiw(Executor executor, qfy qfyVar) {
        super(executor);
        this.b = qfyVar;
    }

    @Override // defpackage.qis
    public final qgi k() throws InterruptedException {
        qfy qfyVar = this.b;
        qfyVar.shutdown();
        sxo sxoVar = sxo.a;
        return new qgi(new qgi(qfyVar.a.a(sxoVar, new qfj())).a(sxoVar, new qiv(qfyVar)));
    }
}
