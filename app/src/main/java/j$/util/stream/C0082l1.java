package j$.util.stream;

/* renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0082l1 extends Y0 {
    public long b;
    public long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082l1(InterfaceC0079k1 interfaceC0079k1, long j) {
        super(interfaceC0079k1);
        this.d = j;
        this.b = j;
        this.c = Long.MAX_VALUE;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            ((InterfaceC0079k1) this.a).accept((InterfaceC0079k1) obj);
        }
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        ((InterfaceC0079k1) this.a).c(j >= 0 ? Math.max(-1L, Math.min(j - this.d, this.c)) : -1L);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final boolean e() {
        return this.c == 0 || ((InterfaceC0079k1) this.a).e();
    }
}
