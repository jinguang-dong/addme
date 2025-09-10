package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcc implements mch {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mcc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mch
    public final void c(int i) {
        int i2 = this.b;
        Object obj = this.a;
        if (i2 != 0) {
            ((fzb) obj).j = i;
        } else {
            ((mcd) obj).c = true;
        }
    }

    @Override // defpackage.mch
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.mch
    public final /* synthetic */ void a(byte[] bArr) {
    }
}
