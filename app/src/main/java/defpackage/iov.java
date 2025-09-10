package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iov implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public iov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        if (this.e == 0) {
            tzx tzxVar = this.d;
            tzx tzxVar2 = this.c;
            return new gga(this.a, this.b, tzxVar2, tzxVar, null, null);
        }
        tzs.b(this.d);
        tzs.b(this.a);
        tzs.b(this.c);
        gzi gziVar = gzs.a;
        return hgd.a;
    }

    public iov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }
}
