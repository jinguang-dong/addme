package com.google.android.apps.camera.manual.panel;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import defpackage.jkz;
import defpackage.kv;
import defpackage.ld;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ManualPanelLayoutManager extends LinearLayoutManager {
    private int a;
    private final Supplier b;

    public ManualPanelLayoutManager(Supplier supplier) {
        super(0);
        this.a = -1;
        this.b = supplier;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final void al(RecyclerView recyclerView, int i) {
        if (recyclerView.F == 2 && this.a == i) {
            return;
        }
        this.a = i;
        jkz jkzVar = new jkz(recyclerView.getContext(), 2);
        jkzVar.b = i;
        aZ(jkzVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final int d(int i, kv kvVar, ld ldVar) {
        int iAq = aq();
        int I = I();
        boolean z = true;
        boolean z2 = J() == ldVar.a() + (-1);
        boolean z3 = I == 0;
        if (!z3 && !z2) {
            return super.d(i, kvVar, ldVar);
        }
        if (((Boolean) this.b.get()).booleanValue()) {
            return super.d(i, kvVar, ldVar);
        }
        boolean z4 = iAq == 1;
        boolean z5 = (!z4 && z3) || (z4 && z2);
        if ((z4 || !z2) && (!z4 || !z3)) {
            z = false;
        }
        if (z5 && i < 0) {
            int iAp = z4 ? ap() - 1 : 0;
            int left = O(iAp).getLeft();
            return super.d(Math.min(left - Math.min(au(), left - i), iAp), kvVar, ldVar);
        }
        if (!z || i <= 0) {
            return super.d(i, kvVar, ldVar);
        }
        int right = O(z4 ? 0 : ap() - 1).getRight();
        return super.d(Math.max(right - Math.max(this.C - av(), right - i), 0), kvVar, ldVar);
    }
}
