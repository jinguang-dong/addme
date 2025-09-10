package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzq implements qzn {
    private static final qzn a = new qzn() { // from class: qzp
        @Override // defpackage.qzn
        public final qzm a(qxf qxfVar) {
            throw new IllegalStateException();
        }
    };
    private volatile qzn b;
    private qzm c;

    public qzq(qzn qznVar) {
        this.b = qznVar;
    }

    @Override // defpackage.qzn
    public final qzm a(qxf qxfVar) {
        a.I(Objects.equals("", ""));
        qzn qznVar = this.b;
        qzn qznVar2 = a;
        if (qznVar != qznVar2) {
            synchronized (this) {
                if (this.b != qznVar2) {
                    this.c = this.b.a(qxfVar);
                    this.b = qznVar2;
                }
            }
        }
        return this.c;
    }
}
