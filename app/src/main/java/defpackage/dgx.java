package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgx extends dgp {
    ArrayList u;
    int v;
    boolean w;
    private boolean x;
    private int y;
    private dgp[] z;

    public dgx(byte[] bArr) {
        this();
        O();
        N(new dge(2));
        N(new dgc());
        N(new dge(1));
    }

    private final void P(dgp dgpVar) {
        this.u.add(dgpVar);
        dgpVar.g = this;
    }

    private final void Q(dgp[] dgpVarArr) {
        Arrays.fill(dgpVarArr, (Object) null);
        this.z = dgpVarArr;
    }

    private final dgp[] R() {
        dgp[] dgpVarArr = this.z;
        this.z = null;
        if (dgpVarArr == null) {
            dgpVarArr = new dgp[this.u.size()];
        }
        return (dgp[]) this.u.toArray(dgpVarArr);
    }

    @Override // defpackage.dgp
    public final boolean A() {
        for (int i = 0; i < this.u.size(); i++) {
            if (((dgp) this.u.get(i)).A()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dgp
    public final /* bridge */ /* synthetic */ void E(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((dgp) this.u.get(i)).E(view);
        }
        super.E(view);
    }

    @Override // defpackage.dgp
    public final /* bridge */ /* synthetic */ void G(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((dgp) this.u.get(i)).G(view);
        }
        super.G(view);
    }

    @Override // defpackage.dgp
    public final /* bridge */ /* synthetic */ void H() {
        this.y |= 1;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dgp) this.u.get(i)).H();
            }
        }
    }

    @Override // defpackage.dgp
    public final void I() {
        this.y |= 2;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((dgp) this.u.get(i)).I();
        }
    }

    @Override // defpackage.dgp
    public final /* synthetic */ void J(long j) {
        this.a = j;
    }

    @Override // defpackage.dgp
    public final /* bridge */ /* synthetic */ void K() {
        ArrayList arrayList;
        this.b = 0L;
        if (this.b < 0 || (arrayList = this.u) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dgp) this.u.get(i)).K();
        }
    }

    @Override // defpackage.dgp
    public final void L(com comVar) {
        this.s = comVar;
        this.y |= 8;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((dgp) this.u.get(i)).L(comVar);
        }
    }

    @Override // defpackage.dgp
    public final void M(com comVar) {
        super.M(comVar);
        this.y |= 4;
        if (this.u != null) {
            for (int i = 0; i < this.u.size(); i++) {
                ((dgp) this.u.get(i)).M(comVar);
            }
        }
    }

    public final void N(dgp dgpVar) {
        P(dgpVar);
        if (this.b >= 0) {
            dgpVar.K();
        }
        if ((this.y & 1) != 0) {
            dgpVar.H();
        }
        if ((this.y & 2) != 0) {
            dgpVar.I();
        }
        if ((this.y & 4) != 0) {
            dgpVar.M(this.t);
        }
        if ((this.y & 8) != 0) {
            dgpVar.L(this.s);
        }
    }

    public final void O() {
        this.x = false;
    }

    @Override // defpackage.dgp
    public final void b(dgy dgyVar) {
        if (C(dgyVar.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dgp dgpVar = (dgp) arrayList.get(i);
                if (dgpVar.C(dgyVar.b)) {
                    dgpVar.b(dgyVar);
                    dgyVar.c.add(dgpVar);
                }
            }
        }
    }

    @Override // defpackage.dgp
    public final void c(dgy dgyVar) {
        if (C(dgyVar.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dgp dgpVar = (dgp) arrayList.get(i);
                if (dgpVar.C(dgyVar.b)) {
                    dgpVar.c(dgyVar);
                    dgyVar.c.add(dgpVar);
                }
            }
        }
    }

    @Override // defpackage.dgp
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.dgp
    public final boolean d() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            if (!((dgp) this.u.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.u.size();
    }

    public final dgp g(int i) {
        if (i < 0 || i >= this.u.size()) {
            return null;
        }
        return (dgp) this.u.get(i);
    }

    @Override // defpackage.dgp
    /* renamed from: i */
    public final dgp clone() {
        dgx dgxVar = (dgx) super.clone();
        dgxVar.u = new ArrayList();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            dgxVar.P(((dgp) this.u.get(i)).clone());
        }
        return dgxVar;
    }

    @Override // defpackage.dgp
    public final String m(String str) {
        String strM = super.m(str);
        for (int i = 0; i < this.u.size(); i++) {
            strM = strM + "\n" + ((dgp) this.u.get(i)).m(str.concat("  "));
        }
        return strM;
    }

    @Override // defpackage.dgp
    public final void n() {
        super.n();
        dgp[] dgpVarArrR = R();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            dgpVarArrR[i].n();
        }
        Q(dgpVarArrR);
    }

    @Override // defpackage.dgp
    public final void o(dgy dgyVar) {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((dgp) this.u.get(i)).o(dgyVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.dgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(android.view.ViewGroup r13, defpackage.dgz r14, defpackage.dgz r15, java.util.ArrayList r16, java.util.ArrayList r17) {
        /*
            r12 = this;
            long r0 = r12.a
            java.util.ArrayList r2 = r12.u
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L3d
            java.util.ArrayList r5 = r12.u
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            dgp r6 = (defpackage.dgp) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            boolean r5 = r12.x
            if (r5 != 0) goto L22
            if (r4 != 0) goto L30
            r4 = r3
        L22:
            long r9 = r6.a
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2d
            long r9 = r9 + r0
            r6.J(r9)
            goto L30
        L2d:
            r6.J(r0)
        L30:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.r(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgx.r(android.view.ViewGroup, dgz, dgz, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // defpackage.dgp
    public final void u(View view) {
        super.u(view);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((dgp) this.u.get(i)).u(view);
        }
    }

    @Override // defpackage.dgp
    public final void v() {
        this.p = 0L;
        dgv dgvVar = new dgv(this);
        for (int i = 0; i < this.u.size(); i++) {
            dgp dgpVar = (dgp) this.u.get(i);
            dgpVar.D(dgvVar);
            dgpVar.v();
            long j = dgpVar.p;
            if (this.x) {
                this.p = Math.max(this.p, j);
            } else {
                long j2 = this.p;
                dgpVar.r = j2;
                this.p = j2 + j;
            }
        }
    }

    @Override // defpackage.dgp
    public final void w(View view) {
        super.w(view);
        dgp[] dgpVarArrR = R();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            dgpVarArrR[i].w(view);
        }
        Q(dgpVarArrR);
    }

    @Override // defpackage.dgp
    protected final void x() {
        if (this.u.isEmpty()) {
            z();
            s();
            return;
        }
        dgw dgwVar = new dgw(this);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dgp) arrayList.get(i)).D(dgwVar);
        }
        this.v = this.u.size();
        if (this.x) {
            ArrayList arrayList2 = this.u;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((dgp) arrayList2.get(i2)).x();
            }
            return;
        }
        for (int i3 = 1; i3 < this.u.size(); i3++) {
            ((dgp) this.u.get(i3 - 1)).D(new dgu((dgp) this.u.get(i3)));
        }
        dgp dgpVar = (dgp) this.u.get(0);
        if (dgpVar != null) {
            dgpVar.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgx.y(long, long):void");
    }

    public dgx() {
        this.u = new ArrayList();
        this.x = true;
        this.w = false;
        this.y = 0;
    }
}
