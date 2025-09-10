package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzh extends ujq implements uif {
    final /* synthetic */ boolean a;
    final /* synthetic */ det b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzh(boolean z, det detVar, String str) {
        super(0);
        this.a = z;
        this.b = detVar;
        this.c = str;
    }

    @Override // defpackage.uif
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.a) {
            det detVar = this.b;
            String str = this.c;
            Object obj = detVar.a;
            synchronized (((dex) obj).g) {
            }
        }
        return ufg.a;
    }
}
