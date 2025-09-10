package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsc implements bts, bst {
    final /* synthetic */ bsn a;
    private final /* synthetic */ bsf b;

    public bsc(bsn bsnVar) {
        this.a = bsnVar;
        this.b = bsnVar.f;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.b.b;
    }

    @Override // defpackage.chw
    public final float b() {
        return this.b.c;
    }

    @Override // defpackage.chw
    public final float dg(long j) {
        return chp.J(this.b, j);
    }

    @Override // defpackage.chq
    public final float dh(float f) {
        return chp.L(this.b, f);
    }

    @Override // defpackage.chq
    public final float di(int i) {
        return chp.M(this.b, i);
    }

    @Override // defpackage.chq
    public final float dj(long j) {
        return chp.N(this.b, j);
    }

    @Override // defpackage.chq
    public final float dk(float f) {
        return chp.O(this.b, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final int mo0do(float f) {
        return chp.P(this.b, f);
    }

    @Override // defpackage.chq
    public final long dp(long j) {
        return chp.Q(this.b, j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return chp.K(this.b, f);
    }

    @Override // defpackage.chq
    public final long dr(float f) {
        return chp.R(this.b, f);
    }

    @Override // defpackage.bst
    public final bss ds(int i, int i2, Map map, uiq uiqVar) {
        return bko.K(this.b, i, i2, map, uiqVar);
    }

    @Override // defpackage.brv
    public final boolean dt() {
        return this.b.dt();
    }

    @Override // defpackage.bst
    public final bss du(int i, int i2, Map map, uiq uiqVar) {
        return this.b.du(i, i2, map, uiqVar);
    }

    @Override // defpackage.brv
    public final cib m() {
        return this.b.a;
    }

    @Override // defpackage.bts
    public final List p(Object obj, uiu uiuVar) {
        bsn bsnVar = this.a;
        bvm bvmVar = (bvm) bsnVar.m.a(obj);
        if (bvmVar != null && bsnVar.a.u().indexOf(bvmVar) < bsnVar.d) {
            return bvmVar.s();
        }
        bdp bdpVar = bsnVar.h;
        if (bdpVar.b < bsnVar.e) {
            bqs.b("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = bdpVar.b;
        int i2 = bsnVar.e;
        if (i == i2) {
            bdpVar.n(obj);
        } else {
            bdpVar.d(i2, obj);
        }
        bsnVar.e++;
        zu zuVar = bsnVar.n;
        if (zu.e(zuVar, obj)) {
            bvm bvmVar2 = (bvm) zuVar.a(obj);
            bsd bsdVar = bvmVar2 != null ? (bsd) bsnVar.l.a(bvmVar2) : null;
            if (bsdVar != null && bsdVar.c) {
                bsnVar.k(bvmVar2, obj, uiuVar);
            }
        } else {
            bsnVar.o.j(obj, bsnVar.a(obj, uiuVar));
            bvm bvmVar3 = bsnVar.a;
            if (bvmVar3.aw() == 3) {
                bvmVar3.R(true);
            } else {
                bvm.ap(bvmVar3, true, 6);
            }
        }
        bvm bvmVar4 = (bvm) zuVar.a(obj);
        if (bvmVar4 == null) {
            return ufw.a;
        }
        List listX = bvmVar4.m().x();
        int size = listX.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bvz) listX.get(i3)).f.b = true;
        }
        return listX;
    }
}
