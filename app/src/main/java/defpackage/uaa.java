package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uaa implements tzx {
    private static final Object a = new Object();
    private volatile tzx b;
    private volatile Object c = a;

    private uaa(tzx tzxVar) {
        this.b = tzxVar;
    }

    public static tzx b(tzx tzxVar) {
        return ((tzxVar instanceof uaa) || (tzxVar instanceof tzs)) ? tzxVar : new uaa(tzxVar);
    }

    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        tzx tzxVar = this.b;
        if (tzxVar == null) {
            return this.c;
        }
        Object objA = tzxVar.a();
        this.c = objA;
        this.b = null;
        return objA;
    }
}
