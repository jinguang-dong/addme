package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brb implements bst, brv {
    public final bvh a;
    public bqz b;
    public boolean c;

    public brb(bvh bvhVar, bqz bqzVar) {
        this.a = bvhVar;
        this.b = bqzVar;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.chw
    public final float dg(long j) {
        return chp.J(this.a, j);
    }

    @Override // defpackage.chq
    public final float dh(float f) {
        return chp.L(this.a, f);
    }

    @Override // defpackage.chq
    public final float di(int i) {
        return chp.M(this.a, i);
    }

    @Override // defpackage.chq
    public final float dj(long j) {
        return chp.N(this.a, j);
    }

    @Override // defpackage.chq
    public final float dk(float f) {
        return chp.O(this.a, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final int mo0do(float f) {
        return chp.P(this.a, f);
    }

    @Override // defpackage.chq
    public final long dp(long j) {
        return chp.Q(this.a, j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return chp.K(this.a, f);
    }

    @Override // defpackage.chq
    public final long dr(float f) {
        return chp.R(this.a, f);
    }

    @Override // defpackage.bst
    public final bss ds(int i, int i2, Map map, uiq uiqVar) {
        return bko.K(this.a, i, i2, map, uiqVar);
    }

    @Override // defpackage.brv
    public final boolean dt() {
        return false;
    }

    @Override // defpackage.bst
    public final bss du(int i, int i2, Map map, uiq uiqVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bqs.c(a.bD(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new bra(i, i2, map, uiqVar, this);
    }

    @Override // defpackage.brv
    public final cib m() {
        return this.a.m();
    }
}
