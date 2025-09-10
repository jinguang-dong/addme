package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class emg extends enr {
    public emg() {
        super(null);
    }

    @Override // defpackage.enr
    public final void a(int i) {
        enz.c(emr.a, a.bv(i, "onCameraError called with no handler set: "));
    }

    @Override // defpackage.enr
    public final void b(RuntimeException runtimeException, String str, int i, int i2) {
        enz.d(emr.a, "onCameraException called with no handler set", runtimeException);
    }

    @Override // defpackage.enr
    public final void c(RuntimeException runtimeException) {
        enz.d(emr.a, "onDispatchThreadException called with no handler set", runtimeException);
    }
}
