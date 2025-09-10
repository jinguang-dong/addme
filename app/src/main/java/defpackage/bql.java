package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bql extends bij implements bqc, chq, bww {
    public Object a;
    public Object b;
    public PointerInputEventHandler c;
    public bpp d = bqh.a;
    public final bdp e;
    public final Object f;
    public long g;
    private uol h;
    private final bdp i;
    private bpp j;

    public bql(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
        bdp bdpVar = new bdp(new bqk[16]);
        this.e = bdpVar;
        this.f = bdpVar;
        this.i = new bdp(new bqk[16]);
        this.g = 0L;
    }

    private final void p(bpp bppVar, int i) {
        synchronized (this.f) {
            bdp bdpVar = this.i;
            bdpVar.o(bdpVar.b, this.e);
        }
        int i2 = i - 1;
        try {
            if (i2 == 0 || i2 == 2) {
                bdp bdpVar2 = this.i;
                Object[] objArr = bdpVar2.a;
                int i3 = bdpVar2.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((bqk) objArr[i4]).t(bppVar, i);
                }
            } else {
                bdp bdpVar3 = this.i;
                int i5 = bdpVar3.b - 1;
                Object[] objArr2 = bdpVar3.a;
                if (i5 < objArr2.length) {
                    while (i5 >= 0) {
                        ((bqk) objArr2[i5]).t(bppVar, i);
                        i5--;
                    }
                }
            }
        } finally {
            this.i.g();
        }
    }

    @Override // defpackage.chq
    public final float a() {
        return bko.B(this).o.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return bko.B(this).o.b();
    }

    @Override // defpackage.bww
    public final void cX() {
        bpp bppVar = this.j;
        if (bppVar == null) {
            return;
        }
        List list = bppVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bpv) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bpv bpvVar = (bpv) list.get(i2);
                    long j = bpvVar.a;
                    long j2 = bpvVar.c;
                    long j3 = bpvVar.b;
                    float f = bpvVar.e;
                    boolean z = bpvVar.d;
                    arrayList.add(new bpv(j, j3, j2, false, f, j3, j2, z, z, bpvVar.i, 0L));
                }
                bpp bppVar2 = new bpp(arrayList);
                this.d = bppVar2;
                p(bppVar2, 1);
                p(bppVar2, 2);
                p(bppVar2, 3);
                this.j = null;
                return;
            }
        }
    }

    @Override // defpackage.bij
    public final void cY() {
        o();
    }

    @Override // defpackage.bij
    public final void cZ() {
        o();
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

    @Override // defpackage.bww
    public final void l() {
        o();
    }

    @Override // defpackage.bqc
    public final caa m() {
        return bko.B(this).q;
    }

    @Override // defpackage.bqc
    public final Object n(uiu uiuVar, uhb uhbVar) {
        uml umlVar = new uml(ske.aE(uhbVar), 1);
        umlVar.x();
        bqk bqkVar = new bqk(this, umlVar);
        synchronized (this.f) {
            this.e.n(bqkVar);
            new uhh(ske.aE(ske.aD(uiuVar, bqkVar, bqkVar)), uhi.a).fW(ufg.a);
        }
        umlVar.d(new aaw(bqkVar, 8));
        return umlVar.i();
    }

    public final void o() {
        uol uolVar = this.h;
        if (uolVar != null) {
            uolVar.s(new bqb());
            this.h = null;
        }
    }

    @Override // defpackage.bww
    public final void u(bpp bppVar, int i, long j) {
        this.g = j;
        if (i == 1) {
            this.d = bppVar;
        }
        if (this.h == null) {
            this.h = ukc.C(C(), null, 4, new vf(this, (uhb) null, 20), 1);
        }
        p(bppVar, i);
        List list = bppVar.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bppVar = null;
                break;
            } else if (!akg.A((bpv) list.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        this.j = bppVar;
    }

    @Override // defpackage.bww
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.bww
    public final /* synthetic */ void y() {
    }
}
