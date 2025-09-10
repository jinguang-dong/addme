package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvt extends bte implements bst, bwb {
    public boolean i;
    public boolean j;
    public boolean k;
    public final btd l;
    public zu m;
    public bad n;

    public bvt() {
        uiq uiqVar = btf.a;
        this.l = new bso(this);
    }

    protected static final void P(bwi bwiVar) {
        buf bufVar;
        bwi bwiVar2 = bwiVar.v;
        if (!a.ao(bwiVar2 != null ? bwiVar2.s : null, bwiVar.s)) {
            ((bvz) bwiVar.W()).v.e();
            return;
        }
        bug bugVarI = bwiVar.W().i();
        if (bugVarI == null || (bufVar = ((bvz) bugVarI).v) == null) {
            return;
        }
        bufVar.e();
    }

    public abstract long E();

    public abstract bry F();

    public abstract bss G();

    public abstract bvm H();

    public abstract bvt I();

    public abstract bvt J();

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(defpackage.bvm r32, defpackage.btk r33) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvt.K(bvm, btk):void");
    }

    public final void L(bss bssVar) {
        zu zuVar;
        int i;
        int i2;
        zu zuVar2;
        int i3;
        char c;
        long j;
        int i4;
        int i5;
        int i6;
        zu zuVar3 = this.m;
        if (this.k) {
            return;
        }
        bssVar.g();
        if (zuVar3 != null) {
            Object[] objArr = zuVar3.c;
            long[] jArr = zuVar3.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j2 = jArr[i7];
                    char c2 = 7;
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            int i10 = 8;
                            i2 = 8 - ((~i8) >>> 31);
                            if (i9 >= i2) {
                                break;
                            }
                            if ((j2 & 255) < 128) {
                                zw zwVar = (zw) objArr[(i7 << 3) + i9];
                                c = c2;
                                Object[] objArr2 = zwVar.b;
                                long[] jArr2 = zwVar.a;
                                j = j3;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    i3 = i7;
                                    int i11 = 0;
                                    while (true) {
                                        long j4 = jArr2[i11];
                                        zuVar2 = zuVar3;
                                        if ((((~j4) << c) & j4 & j) != j) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j4 & 255) < 128) {
                                                    i6 = i10;
                                                    bvm bvmVar = (bvm) ((bxf) objArr2[(i11 << 3) + i13]).get();
                                                    if (bvmVar != null) {
                                                        if (dt()) {
                                                            i5 = i13;
                                                            bvmVar.R(false);
                                                        } else {
                                                            i5 = i13;
                                                            bvmVar.S(false);
                                                        }
                                                        j4 >>= i6;
                                                        i13 = i5 + 1;
                                                        i10 = i6;
                                                    } else {
                                                        i5 = i13;
                                                    }
                                                } else {
                                                    i5 = i13;
                                                    i6 = i10;
                                                }
                                                j4 >>= i6;
                                                i13 = i5 + 1;
                                                i10 = i6;
                                            }
                                            i4 = i10;
                                            if (i12 == i4) {
                                                break;
                                            }
                                        } else {
                                            i4 = i10;
                                        }
                                        if (i11 != length2) {
                                            i11++;
                                            i10 = i4;
                                            zuVar3 = zuVar2;
                                        }
                                    }
                                    j2 >>= i4;
                                    i9++;
                                    c2 = c;
                                    j3 = j;
                                    i7 = i3;
                                    zuVar3 = zuVar2;
                                } else {
                                    zuVar2 = zuVar3;
                                    i3 = i7;
                                }
                            } else {
                                zuVar2 = zuVar3;
                                i3 = i7;
                                c = c2;
                                j = j3;
                            }
                            i4 = 8;
                            j2 >>= i4;
                            i9++;
                            c2 = c;
                            j3 = j;
                            i7 = i3;
                            zuVar3 = zuVar2;
                        }
                        zuVar = zuVar3;
                        int i14 = i7;
                        if (i2 != 8) {
                            break;
                        } else {
                            i = i14;
                        }
                    } else {
                        zuVar = zuVar3;
                        i = i7;
                    }
                    if (i == length) {
                        break;
                    }
                    i7 = i + 1;
                    zuVar3 = zuVar;
                }
            } else {
                zuVar = zuVar3;
            }
            zuVar.i();
        }
    }

    public abstract void M();

    @Override // defpackage.bwb
    public final void N(boolean z) {
        bvt bvtVarJ = J();
        bvm bvmVarH = bvtVarJ != null ? bvtVarJ.H() : null;
        if (a.ao(bvmVarH, H())) {
            this.i = z;
        } else {
            if ((bvmVarH == null || bvmVarH.aw() != 3) && (bvmVarH == null || bvmVarH.aw() != 4)) {
                return;
            }
            this.i = z;
        }
    }

    public abstract boolean O();

    @Override // defpackage.chw
    public final /* synthetic */ float dg(long j) {
        return chp.J(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dh(float f) {
        return chp.L(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float di(int i) {
        return chp.M(this, i);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dj(long j) {
        return chp.N(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dk(float f) {
        return chp.O(this, f);
    }

    @Override // defpackage.bsu
    public final int dl(bqv bqvVar) {
        int iP;
        if (O() && (iP = p(bqvVar)) != Integer.MIN_VALUE) {
            return iP + (bqvVar instanceof btv ? chy.a(this.e) : chy.b(this.e));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final /* synthetic */ int mo0do(float f) {
        return chp.P(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dp(long j) {
        return chp.Q(this, j);
    }

    @Override // defpackage.chw
    public final /* synthetic */ long dq(float f) {
        return chp.K(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dr(float f) {
        return chp.R(this, f);
    }

    @Override // defpackage.bst
    public final /* synthetic */ bss ds(int i, int i2, Map map, uiq uiqVar) {
        return bko.K(this, i, i2, map, uiqVar);
    }

    @Override // defpackage.brv
    public boolean dt() {
        return false;
    }

    @Override // defpackage.bst
    public final bss du(int i, int i2, Map map, uiq uiqVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bqs.c(a.bD(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new bvs(i, i2, map, uiqVar, this);
    }

    public abstract int p(bqv bqvVar);
}
