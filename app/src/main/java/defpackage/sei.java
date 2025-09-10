package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sei extends sef implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final int b;

    public sei(Object obj, int i) {
        this.a = obj;
        this.b = i;
        ujp.bq(i, "count");
    }

    @Override // defpackage.sec
    public final int a() {
        return this.b;
    }

    @Override // defpackage.sec
    public final Object b() {
        return this.a;
    }
}
