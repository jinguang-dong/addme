package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class utr {
    private int a;
    private uus b;
    public utt[] d;
    public int e;

    public final utj b() {
        uus uusVar;
        synchronized (this) {
            uusVar = this.b;
            if (uusVar == null) {
                uusVar = new uus(this.e);
                this.b = uusVar;
            }
        }
        return uusVar;
    }

    protected abstract utt h();

    protected abstract utt[] k();

    protected final utt l() {
        utt uttVarH;
        uus uusVar;
        synchronized (this) {
            utt[] uttVarArrK = this.d;
            if (uttVarArrK == null) {
                uttVarArrK = k();
                this.d = uttVarArrK;
            } else {
                int i = this.e;
                int length = uttVarArrK.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(uttVarArrK, length + length);
                    objArrCopyOf.getClass();
                    uttVarArrK = (utt[]) objArrCopyOf;
                    this.d = uttVarArrK;
                }
            }
            int i2 = this.a;
            do {
                uttVarH = uttVarArrK[i2];
                if (uttVarH == null) {
                    uttVarH = h();
                    uttVarArrK[i2] = uttVarH;
                }
                i2++;
                if (i2 >= uttVarArrK.length) {
                    i2 = 0;
                }
            } while (!uttVarH.a(this));
            this.a = i2;
            this.e++;
            uusVar = this.b;
        }
        if (uusVar != null) {
            uusVar.n(1);
        }
        return uttVarH;
    }

    protected final void m(utt uttVar) {
        uus uusVar;
        int i;
        uhb[] uhbVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            uusVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            uttVar.getClass();
            uhbVarArrB = uttVar.b(this);
        }
        for (uhb uhbVar : uhbVarArrB) {
            if (uhbVar != null) {
                uhbVar.fW(ufg.a);
            }
        }
        if (uusVar != null) {
            uusVar.n(-1);
        }
    }
}
