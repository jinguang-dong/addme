package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tdd {
    public static final tdd a;
    public static final tdd b;
    public static final tdd c;
    private static final tdd[] e;
    private static int f;
    public final int d;
    private final String g;

    private tdd() {
        this.g = "kInvalid";
        this.d = 0;
        f = 1;
    }

    public static tdd a(int i) {
        tdd[] tddVarArr = e;
        if (i < 3 && i >= 0) {
            tdd tddVar = tddVarArr[i];
            if (tddVar.d == i) {
                return tddVar;
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            tdd tddVar2 = tddVarArr[i2];
            if (tddVar2.d == i) {
                return tddVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tdd.class));
    }

    public final String toString() {
        return this.g;
    }

    static {
        tdd tddVar = new tdd();
        a = tddVar;
        tdd tddVar2 = new tdd("kNv12");
        b = tddVar2;
        tdd tddVar3 = new tdd(mPfBwqXsnpXI.ylcBqvFgyXwERY);
        c = tddVar3;
        e = new tdd[]{tddVar, tddVar2, tddVar3};
        f = 0;
    }

    private tdd(String str) {
        this.g = str;
        int i = f;
        f = i + 1;
        this.d = i;
    }
}
