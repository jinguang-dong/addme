package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bne {
    private boolean a;
    private bkw b;
    private float c = 1.0f;
    private cib d = cib.a;
    private fnd e;

    public static /* synthetic */ void f(bne bneVar, bmv bmvVar, long j, float f, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        bneVar.e(bmvVar, j, f, null);
    }

    private final fnd g() {
        fnd fndVar = this.e;
        if (fndVar != null) {
            return fndVar;
        }
        fnd fndVar2 = new fnd((char[]) null);
        this.e = fndVar2;
        return fndVar2;
    }

    public abstract long a();

    protected abstract void b(bmv bmvVar);

    protected boolean c(float f) {
        return false;
    }

    protected boolean d(bkw bkwVar) {
        return false;
    }

    public final void e(bmv bmvVar, long j, float f, bkw bkwVar) {
        if (this.c != f) {
            if (!c(f)) {
                if (f == 1.0f) {
                    fnd fndVar = this.e;
                    if (fndVar != null) {
                        fndVar.i(f);
                    }
                    this.a = false;
                } else {
                    g().i(f);
                    this.a = true;
                }
            }
            this.c = f;
        }
        if (!a.ao(this.b, bkwVar)) {
            if (!d(bkwVar)) {
                if (bkwVar == null) {
                    fnd fndVar2 = this.e;
                    if (fndVar2 != null) {
                        fndVar2.l(null);
                    }
                    this.a = false;
                } else {
                    g().l(bkwVar);
                    this.a = true;
                }
            }
            this.b = bkwVar;
        }
        cib cibVarN = bmvVar.n();
        if (this.d != cibVarN) {
            this.d = cibVarN;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bmvVar.m() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bmvVar.m() & 4294967295L)) - Float.intBitsToFloat(i2);
        bmvVar.o().c.j(fIntBitsToFloat, fIntBitsToFloat2);
        float f2 = -fIntBitsToFloat;
        float f3 = -fIntBitsToFloat2;
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.a) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                        bkg bkgVarT = bdq.t(0L, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L));
                        bku bkuVarB = bmvVar.o().b();
                        try {
                            bkuVarB.q(bkgVarT, g());
                            b(bmvVar);
                            bkuVarB.d();
                        } catch (Throwable th) {
                            bkuVarB.d();
                            throw th;
                        }
                    } else {
                        b(bmvVar);
                    }
                }
            } finally {
                bmvVar.o().c.j(f2, f3);
            }
        }
    }
}
