package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myu {
    public final Object a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public myu(Object obj, String str, String str2, boolean z) {
        this.a = obj;
        this.c = str;
        this.d = str2;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, tzj] */
    public final kmz a(kmz kmzVar) {
        if (!this.b) {
            return kmzVar;
        }
        Object obj = this.a;
        return new kxz(kmzVar, (cxb) obj, (cxb) this.d, (let) this.c.a(), 0);
    }

    public myu(tzj tzjVar, tzj tzjVar2, tzj tzjVar3, rwc rwcVar) {
        this.a = new cxb(tzjVar);
        this.d = new cxb(tzjVar2);
        this.c = tzjVar3;
        this.b = ((Boolean) rwcVar.e(false)).booleanValue();
    }
}
