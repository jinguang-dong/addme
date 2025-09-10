package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class shn extends shq {
    final /* synthetic */ shq a;
    final /* synthetic */ shq b;

    public shn(shq shqVar, shq shqVar2) {
        this.a = shqVar;
        this.b = shqVar2;
    }

    @Override // defpackage.shq
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
