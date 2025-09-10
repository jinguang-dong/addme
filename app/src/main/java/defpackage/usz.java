package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class usz extends utt {
    public long a = -1;
    public uhb b;

    @Override // defpackage.utt
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        usx usxVar = (usx) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = usxVar.b;
        if (j < usxVar.c) {
            usxVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.utt
    public final /* bridge */ /* synthetic */ uhb[] b(Object obj) {
        boolean z = unf.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((usx) obj).j(j);
    }
}
