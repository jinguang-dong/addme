package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tzs implements tzx, tzj {
    private static final Object a = new Object();
    private volatile tzx b;
    private volatile Object c = a;

    private tzs(tzx tzxVar) {
        this.b = tzxVar;
    }

    public static tzj b(tzx tzxVar) {
        if (tzxVar instanceof tzj) {
            return (tzj) tzxVar;
        }
        tzxVar.getClass();
        return new tzs(tzxVar);
    }

    public static tzx c(tzx tzxVar) {
        tzxVar.getClass();
        return tzxVar instanceof tzs ? tzxVar : new tzs(tzxVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objA = this.b.a();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objA) {
            throw new IllegalStateException(a.bA(objA, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = objA;
        this.b = null;
        return objA;
    }

    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
