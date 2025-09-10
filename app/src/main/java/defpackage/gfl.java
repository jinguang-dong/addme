package defpackage;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfl implements ozp {
    private final ozp a;
    private final mfd b;

    public gfl(ozp ozpVar, mfd mfdVar) {
        this.a = ozpVar;
        this.b = mfdVar;
    }

    @Override // defpackage.ozp
    public final synchronized void A(int i, int i2) {
        this.a.A(i, i2);
    }

    @Override // defpackage.ozp
    public final synchronized void B() {
        this.a.B();
    }

    @Override // defpackage.ozp
    public final synchronized void C() {
        this.a.C();
    }

    @Override // defpackage.ozp
    public final synchronized void D() {
        this.a.D();
    }

    @Override // defpackage.ozp
    public final MediaRecorder a() {
        return ((ozm) this.a).a;
    }

    @Override // defpackage.ozp
    public final synchronized Surface b() {
        return this.a.b();
    }

    @Override // defpackage.ozp
    public final synchronized void c() {
        this.a.c();
    }

    @Override // defpackage.ozp
    public final synchronized void d() {
        try {
            this.b.j(mfc.MEDIA_RECORDER_PREPARE_START);
            this.a.d();
        } finally {
            this.b.a();
        }
    }

    @Override // defpackage.ozp
    public final synchronized void e() {
        this.a.e();
    }

    @Override // defpackage.ozp
    public final synchronized void f() {
        this.a.f();
    }

    @Override // defpackage.ozp
    public final synchronized void g() {
        this.a.g();
    }

    @Override // defpackage.ozp
    public final synchronized void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.ozp
    public final synchronized void i(int i) {
        this.a.i(i);
    }

    @Override // defpackage.ozp
    public final synchronized void j(int i) {
        this.a.j(i);
    }

    @Override // defpackage.ozp
    public final synchronized void k(int i) {
        this.a.k(i);
    }

    @Override // defpackage.ozp
    public final synchronized void l(int i) {
        this.a.l(i);
    }

    @Override // defpackage.ozp
    public final synchronized void m(double d) {
        this.a.m(d);
    }

    @Override // defpackage.ozp
    public final synchronized void n(Surface surface) {
        this.a.n(surface);
    }

    @Override // defpackage.ozp
    public final synchronized void o(float f, float f2) {
        this.a.o(f, f2);
    }

    @Override // defpackage.ozp
    public final synchronized void p(long j) {
        this.a.p(j);
    }

    @Override // defpackage.ozp
    public final void q(FileDescriptor fileDescriptor) {
        this.a.q(fileDescriptor);
    }

    @Override // defpackage.ozp
    public final synchronized void r(MediaRecorder.OnErrorListener onErrorListener) {
        this.a.r(onErrorListener);
    }

    @Override // defpackage.ozp
    public final synchronized void s(MediaRecorder.OnInfoListener onInfoListener) {
        this.a.s(onInfoListener);
    }

    @Override // defpackage.ozp
    public final synchronized void t(int i) {
        this.a.t(i);
    }

    @Override // defpackage.ozp
    public final synchronized void u(FileDescriptor fileDescriptor) {
        this.a.u(fileDescriptor);
    }

    @Override // defpackage.ozp
    public final synchronized void v(String str) {
        this.a.v(str);
    }

    @Override // defpackage.ozp
    public final synchronized void w(int i) {
        this.a.w(i);
    }

    @Override // defpackage.ozp
    public final synchronized void x(int i) {
        this.a.x(i);
    }

    @Override // defpackage.ozp
    public final synchronized void y(int i) {
        this.a.y(i);
    }

    @Override // defpackage.ozp
    public final synchronized void z(int i) {
        this.a.z(i);
    }
}
