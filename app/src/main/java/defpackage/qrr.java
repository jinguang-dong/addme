package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qrr implements sxh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qrr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.sxh
    public final syu a() {
        int i = this.b;
        if (i == 0) {
            qrt qrtVar = (qrt) this.a;
            return (!qrtVar.m() || qrtVar.c.getAndSet(true)) ? syq.a : qrtVar.o(6, (qrf) qrtVar.b.a(), ((qri) qrtVar.e.a()).f);
        }
        if (i == 1) {
            ktx ktxVar = (ktx) this.a;
            ktxVar.b.e("orientation#enable", new iyz(ktxVar.f, 17));
            return ske.M(Boolean.TRUE);
        }
        if (i != 2) {
            if (i != 3) {
                return syq.a;
            }
            Object obj = this.a;
            return prt.c(((qsg) obj).b, new qly(obj, 4));
        }
        qrt qrtVar2 = (qrt) this.a;
        if (qrtVar2.m()) {
            qrh qrhVar = qrtVar2.f;
            if (((AtomicBoolean) qrhVar.g).getAndSet(false)) {
                ske.R(new gea(qrhVar, 14), qrhVar.d);
            } else {
                syu syuVar = syq.a;
            }
        }
        return syq.a;
    }
}
