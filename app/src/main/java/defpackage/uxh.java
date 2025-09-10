package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uxh extends uvb {
    public final ocq c;

    public uxh(long j, uxh uxhVar, int i) {
        super(j, uxhVar, i);
        this.c = new ocq(uxg.f);
    }

    @Override // defpackage.uvb
    public final int a() {
        return uxg.f;
    }

    @Override // defpackage.uvb
    public final void l(int i, uhf uhfVar) {
        ocq ocqVar = this.c;
        ocqVar.x(i).c(uxg.e);
        s();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
