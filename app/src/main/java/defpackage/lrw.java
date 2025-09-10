package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Phaser;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lrw implements lss {
    public static final sgv a = sgv.g("lrw");
    public final lrl b;

    protected lrw(lrl lrlVar) {
        this.b = lrlVar;
    }

    @Override // defpackage.lss
    public final void A(Throwable th) {
        this.b.A(th);
    }

    final Executor B() {
        return this.b.e;
    }

    @Override // defpackage.lss
    public final void C() {
        this.b.C();
    }

    @Override // defpackage.lss
    public final void D() {
        this.b.D();
    }

    @Override // defpackage.lss
    public void E() {
        lpa.l();
    }

    @Override // defpackage.lss
    public final void F(nfm nfmVar, Throwable th) {
        this.b.F(nfmVar, th);
    }

    @Override // defpackage.lss
    public final void G(boolean z, boolean z2) {
        this.b.G(z, z2);
    }

    @Override // defpackage.lss
    public final void H() {
        this.b.H();
    }

    @Override // defpackage.lss
    public void I() {
        this.b.I();
    }

    @Override // defpackage.lss
    public final void J(String str) {
        this.b.ad(str);
    }

    public final void K() {
        lrl lrlVar = this.b;
        Phaser phaser = lrlVar.l;
        int registeredParties = (phaser.getRegisteredParties() - phaser.getArrivedParties()) - 1;
        lrlVar.ad(registeredParties > 0 ? a.bv(registeredParties, "Waiting for expected media items: ") : "No more expected media items.");
        phaser.arriveAndAwaitAdvance();
    }

    public final void L() {
        lrl lrlVar = this.b;
        lrlVar.e.execute(new lmw(lrlVar, 4));
    }

    public final void M(String str) {
        ((sgt) a.c().M(4355)).E("[%s] %s", l(), str);
    }

    final ggg N() {
        return this.b.E;
    }

    @Override // defpackage.lss
    public final void R() {
        this.b.R();
    }

    @Override // defpackage.lss
    public void S() {
        this.b.Y();
    }

    @Override // defpackage.lss
    public final void T(pjo pjoVar) {
        this.b.T(pjoVar);
    }

    @Override // defpackage.lss
    public void U(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        lpa.o();
    }

    @Override // defpackage.lss
    public final void V(icv icvVar) {
        this.b.n = icvVar;
    }

    @Override // defpackage.lss
    public final void X(nfm nfmVar) {
        this.b.X(nfmVar);
    }

    @Override // defpackage.lss
    public void Z(pas pasVar) {
        lrl lrlVar = this.b;
        lrlVar.b.m(lrlVar.f, Optional.ofNullable(((mdo) lrlVar.i).o));
        lrlVar.ad("startEmpty");
        lrlVar.E.r(1, 2);
        Object obj = lrlVar.C.a;
        ltd ltdVarL = lrlVar.l();
        ((mfq) obj).b.put(ltdVarL, new tym((Bitmap) null, 0, pasVar));
        lrlVar.D = new ggg(ltdVarL, (byte[]) null);
    }

    @Override // defpackage.lln
    public final par a() {
        return this.b.d;
    }

    @Override // defpackage.lss
    public final void aa(long j) {
        this.b.aa(j);
    }

    @Override // defpackage.lss
    public final /* synthetic */ void ab() {
        lpa.k(this);
    }

    @Override // defpackage.lss
    public final void ac(Integer num) {
        this.b.ac(null);
    }

    @Override // defpackage.lss
    public final void ae(Bitmap bitmap, int i) {
        this.b.ae(bitmap, i);
    }

    @Override // defpackage.lss
    public final void af(Bitmap bitmap) {
        this.b.af(bitmap);
    }

    @Override // defpackage.lss
    public final void ag(Bitmap bitmap, int i) {
        this.b.ag(bitmap, i);
    }

    @Override // defpackage.lss
    public final boolean ah() {
        return this.b.w;
    }

    @Override // defpackage.lss
    public boolean ai() {
        return false;
    }

    @Override // defpackage.lss
    public final void aj() {
        this.b.aj();
    }

    @Override // defpackage.lss
    public final void ak() {
        this.b.ak();
    }

    @Override // defpackage.lss
    public final void am(int i) {
        this.b.am(i);
    }

    @Override // defpackage.lss
    public final void an(ggg gggVar) {
        this.b.an(gggVar);
    }

    @Override // defpackage.lln
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.lln
    public final void c(par parVar) {
        this.b.c(parVar);
    }

    @Override // defpackage.lln
    public final void d(llq llqVar) {
        this.b.d(llqVar);
    }

    @Override // defpackage.lss
    public final int e() {
        return this.b.e();
    }

    @Override // defpackage.lss
    public final long f() {
        return this.b.u;
    }

    @Override // defpackage.lss
    public final fse g() {
        return this.b.h;
    }

    @Override // defpackage.lss
    public final icv h() {
        return this.b.n;
    }

    final lru i() {
        return this.b.g;
    }

    @Override // defpackage.lss
    public final lsu j() {
        return this.b.j();
    }

    @Override // defpackage.lss
    public final lsw k() {
        return this.b.q;
    }

    @Override // defpackage.lss
    public final ltd l() {
        return this.b.l();
    }

    @Override // defpackage.lss
    public final ltf m() {
        return this.b.c;
    }

    @Override // defpackage.lss
    public final ltg n() {
        return this.b.n();
    }

    @Override // defpackage.lss
    public final mdm o() {
        return this.b.i;
    }

    @Override // defpackage.lss
    public final rwc p() {
        return this.b.v;
    }

    @Override // defpackage.lss
    public final rwc q() {
        return this.b.p;
    }

    public final lsw r() {
        return this.b.q;
    }

    @Override // defpackage.lss
    public final syu s() {
        return this.b.s;
    }

    @Override // defpackage.lss
    public final syu t() {
        return this.b.t();
    }

    @Override // defpackage.lss
    public syu u(byte[] bArr, mfo mfoVar) {
        return lpa.m();
    }

    @Override // defpackage.lss
    public syu v(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        return lpa.n();
    }

    @Override // defpackage.lss
    public final String w() {
        return this.b.w();
    }

    final rwc x(mfo mfoVar) {
        return this.b.r(mfoVar, null);
    }

    @Override // defpackage.lss
    public final void y(ltb ltbVar) {
        this.b.y(ltbVar);
    }

    public final szh z() {
        return this.b.k;
    }
}
