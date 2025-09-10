package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaf implements tzx {
    private final tzx a;
    private final /* synthetic */ int b;

    public jaf(tzx tzxVar, int i, byte[] bArr) {
        this.b = i;
        tzxVar.getClass();
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? b() : b() : b();
    }

    public final rwc b() {
        int i = this.b;
        if (i == 0) {
            return rwc.j(tzs.b(this.a));
        }
        tzx tzxVar = this.a;
        return i != 1 ? rwc.j(tzxVar) : rwc.j(tzxVar.a());
    }

    public jaf(tzx tzxVar, int i) {
        this.b = i;
        tzxVar.getClass();
        this.a = tzxVar;
    }

    public jaf(tzx tzxVar, int i, char[] cArr) {
        this.b = i;
        tzxVar.getClass();
        this.a = tzxVar;
    }
}
