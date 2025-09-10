package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvf extends qsy implements qqs {
    public final tzj a;
    public final AtomicReference b;
    public final qpf c;
    private final syx d;

    public qvf(qqq qqqVar, syx syxVar, tzj tzjVar, uem uemVar, qpf qpfVar) {
        super((char[]) null);
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        this.d = syxVar;
        this.a = tzjVar;
        this.c = qpfVar;
        qqqVar.a(syxVar, new tzj() { // from class: qve
            @Override // defpackage.tzj
            public final Object a() {
                qvc qvcVarD = qvd.d();
                qvcVarD.b(true);
                return qvcVarD.a();
            }
        }, uemVar);
        atomicReference.set(qpfVar.c(1.0f));
    }

    @Override // defpackage.qqs
    public final void cA() {
        this.d.execute(new qly(this, 5));
    }
}
