package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cji implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    cje[] j = new cje[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public cji(int i) {
        this.n = i;
    }

    public final void a(cje cjeVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                cje[] cjeVarArr = this.j;
                int length = cjeVarArr.length;
                if (i2 >= length) {
                    this.j = (cje[]) Arrays.copyOf(cjeVarArr, length + length);
                }
                cje[] cjeVarArr2 = this.j;
                int i3 = this.k;
                cjeVarArr2[i3] = cjeVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == cjeVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(cje cjeVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == cjeVar) {
                while (i2 < i - 1) {
                    cje[] cjeVarArr = this.j;
                    int i3 = i2 + 1;
                    cjeVarArr[i2] = cjeVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((cji) obj).c;
    }

    public final void d(cjf cjfVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(cjfVar, this, false);
        }
        this.k = 0;
    }

    public final void e(cjf cjfVar, cje cjeVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(cjfVar, cjeVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
