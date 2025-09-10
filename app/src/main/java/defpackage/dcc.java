package defpackage;

/* compiled from: PG */
@ueo
/* loaded from: classes2.dex */
public abstract class dcc extends dcv {
    public dcc(dco dcoVar) {
        super(dcoVar);
    }

    public final void a(Object obj) {
        dfq dfqVarD = d();
        try {
            b(dfqVarD, obj);
            dfqVarD.a.executeInsert();
        } finally {
            f(dfqVarD);
        }
    }

    protected abstract void b(dfq dfqVar, Object obj);
}
