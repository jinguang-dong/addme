package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cih {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    private static volatile aab c = new aab(null);
    private static final Object[] d;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        synchronized (objArr) {
            f(c, 1.15f, new cii(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f(c, 1.3f, new cii(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f(c, 1.5f, new cii(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f(c, 1.8f, new cii(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f(c, 2.0f, new cii(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if (d(c.b(0)) - 0.01f > 1.03f) {
            return;
        }
        chx.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static final boolean a(float f) {
        return f >= 1.03f;
    }

    public static final cig b(float f) {
        float fD;
        cig ciiVar;
        if (!a(f)) {
            return null;
        }
        cig cigVar = (cig) aac.a(c, c(f));
        if (cigVar != null) {
            return cigVar;
        }
        int iA = c.a(c(f));
        if (iA >= 0) {
            return (cig) c.e(iA);
        }
        int i = -(iA + 1);
        int i2 = i - 1;
        if (i >= c.c()) {
            cii ciiVar2 = new cii(new float[]{1.0f}, new float[]{f});
            e(f, ciiVar2);
            return ciiVar2;
        }
        if (i2 < 0) {
            float[] fArr = b;
            ciiVar = new cii(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = d(c.b(i2));
            ciiVar = (cig) c.e(i2);
        }
        float fD2 = cij.d(0.0f, 1.0f, fD, d(c.b(i)), f);
        cig cigVar2 = (cig) c.e(i);
        float[] fArr2 = new float[9];
        for (int i3 = 0; i3 < 9; i3++) {
            float f2 = b[i3];
            float fB = ciiVar.b(f2);
            fArr2[i3] = fB + ((cigVar2.b(f2) - fB) * fD2);
        }
        cii ciiVar3 = new cii(b, fArr2);
        e(f, ciiVar3);
        return ciiVar3;
    }

    private static final int c(float f) {
        return (int) (f * 100.0f);
    }

    private static final float d(int i) {
        return i / 100.0f;
    }

    private static final void e(float f, cig cigVar) {
        synchronized (d) {
            aab aabVarClone = c.clone();
            f(aabVarClone, f, cigVar);
            c = aabVarClone;
        }
    }

    private static final void f(aab aabVar, float f, cig cigVar) {
        aabVar.f(c(f), cigVar);
    }
}
