package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugz implements Serializable {
    private static final long serialVersionUID = 0;
    private final uhf[] a;

    public ugz(uhf[] uhfVarArr) {
        this.a = uhfVarArr;
    }

    private final Object readResolve() {
        uhf uhfVarPlus = uhg.a;
        int i = 0;
        while (true) {
            uhf[] uhfVarArr = this.a;
            if (i >= uhfVarArr.length) {
                return uhfVarPlus;
            }
            uhfVarPlus = uhfVarPlus.plus(uhfVarArr[i]);
            i++;
        }
    }
}
