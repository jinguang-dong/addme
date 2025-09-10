package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwc {
    public bij a;
    public int b;
    public bdp c;
    public bdp d;
    public boolean e;
    final /* synthetic */ bwe f;

    public bwc(bwe bweVar, bij bijVar, int i, bdp bdpVar, bdp bdpVar2, boolean z) {
        this.f = bweVar;
        this.a = bijVar;
        this.b = i;
        this.c = bdpVar;
        this.d = bdpVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        bdp bdpVar = this.c;
        int i3 = this.b;
        return byi.p((bii) bdpVar.a[i + i3], (bii) this.d.a[i3 + i2]) != 0;
    }
}
