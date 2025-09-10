package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkg implements tiw {
    public static final tiw a = new tke(2);
    private static final tiw d = new tke(2);
    public final tjb b;
    public final ConcurrentMap c = new ConcurrentHashMap();

    public tkg(tjb tjbVar) {
        this.b = tjbVar;
    }

    public static tix d(Class cls) {
        return (tix) cls.getAnnotation(tix.class);
    }

    public static Object e(tjb tjbVar, Class cls) {
        return tjbVar.a(new tmk(cls), true).a();
    }

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        tix tixVarD = d(tmkVar.a);
        if (tixVarD == null) {
            return null;
        }
        return b(this.b, tihVar, tmkVar, tixVarD, true);
    }

    final tiv b(tjb tjbVar, tih tihVar, tmk tmkVar, tix tixVar, boolean z) {
        tiv tivVarA;
        Object objE = e(tjbVar, tixVar.a());
        boolean z2 = objE instanceof tiv;
        boolean zB = tixVar.b();
        if (z2) {
            tivVarA = (tiv) objE;
        } else if (objE instanceof tiw) {
            tiw tiwVarC = (tiw) objE;
            if (z) {
                tiwVarC = c(tmkVar.a, tiwVarC);
            }
            tivVarA = tiwVarC.a(tihVar, tmkVar);
        } else {
            if (objE instanceof tir) {
            } else if (!(objE instanceof tik)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objE.getClass().getName() + " as a @JsonAdapter for " + tmkVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            tkw tkwVar = new tkw(objE instanceof tik ? (tik) objE : null, tihVar, tmkVar, z ? a : d, zB);
            zB = false;
            tivVarA = tkwVar;
        }
        return (tivVarA == null || !zB) ? tivVarA : tivVarA.b();
    }

    public final tiw c(Class cls, tiw tiwVar) {
        tiw tiwVar2 = (tiw) this.c.putIfAbsent(cls, tiwVar);
        return tiwVar2 != null ? tiwVar2 : tiwVar;
    }
}
