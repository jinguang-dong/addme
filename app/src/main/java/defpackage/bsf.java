package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsf implements bts {
    public cib a = cib.b;
    public float b;
    public float c;
    final /* synthetic */ bsn d;

    public bsf(bsn bsnVar) {
        this.d = bsnVar;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.b;
    }

    @Override // defpackage.chw
    public final float b() {
        return this.c;
    }

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
    public final boolean dt() {
        bvm bvmVar = this.d.a;
        return bvmVar.aw() == 4 || bvmVar.aw() == 2;
    }

    @Override // defpackage.bst
    public final bss du(int i, int i2, Map map, uiq uiqVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bqs.c(a.bD(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new bse(i, i2, map, this, this.d, uiqVar);
    }

    @Override // defpackage.brv
    public final cib m() {
        return this.a;
    }

    @Override // defpackage.bts
    public final List p(Object obj, uiu uiuVar) {
        bsn bsnVar = this.d;
        bsnVar.h();
        bvm bvmVar = bsnVar.a;
        int iAw = bvmVar.aw();
        if (iAw != 1 && iAw != 3 && iAw != 2 && iAw != 4) {
            bqs.c(TOnSyMaYeslEl.jeaytuPBZZPX);
        }
        zu zuVar = bsnVar.m;
        Object objA = zuVar.a(obj);
        if (objA == null) {
            objA = (bvm) bsnVar.n.g(obj);
            if (objA != null) {
                if (bsnVar.j <= 0) {
                    bqs.c("Check failed.");
                }
                bsnVar.j--;
            } else {
                objA = bsnVar.e(obj);
                if (objA == null) {
                    objA = bsnVar.d(bsnVar.d);
                }
            }
            zuVar.j(obj, objA);
        }
        bvm bvmVar2 = (bvm) objA;
        if (ske.bE(bvmVar.u(), bsnVar.d) != bvmVar2) {
            int iIndexOf = bvmVar.u().indexOf(bvmVar2);
            if (iIndexOf < bsnVar.d) {
                bqs.b(a.bz(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = bsnVar.d;
            if (i != iIndexOf) {
                bsnVar.j(iIndexOf, i);
            }
        }
        bsnVar.d++;
        bsnVar.k(bvmVar2, obj, uiuVar);
        return (iAw == 1 || iAw == 3) ? bvmVar2.s() : bvmVar2.r();
    }
}
