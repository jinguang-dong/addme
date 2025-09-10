package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brx implements bst, brv {
    private final /* synthetic */ brv a;
    private final cib b;

    public brx(brv brvVar, cib cibVar) {
        this.a = brvVar;
        this.b = cibVar;
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
        return this.a.dg(j);
    }

    @Override // defpackage.chq
    public final float dh(float f) {
        return this.a.dh(f);
    }

    @Override // defpackage.chq
    public final float di(int i) {
        return this.a.di(i);
    }

    @Override // defpackage.chq
    public final float dj(long j) {
        return this.a.dj(j);
    }

    @Override // defpackage.chq
    public final float dk(float f) {
        return this.a.dk(f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final int mo0do(float f) {
        return this.a.mo0do(f);
    }

    @Override // defpackage.chq
    public final long dp(long j) {
        return this.a.dp(j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return this.a.dq(f);
    }

    @Override // defpackage.chq
    public final long dr(float f) {
        return this.a.dr(f);
    }

    @Override // defpackage.bst
    public final /* synthetic */ bss ds(int i, int i2, Map map, uiq uiqVar) {
        return bko.K(this, i, i2, map, uiqVar);
    }

    @Override // defpackage.brv
    public final boolean dt() {
        return this.a.dt();
    }

    @Override // defpackage.bst
    public final bss du(int i, int i2, Map map, uiq uiqVar) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bqs.c(a.bD(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new brw(i, i2, map);
    }

    @Override // defpackage.brv
    public final cib m() {
        return this.b;
    }
}
