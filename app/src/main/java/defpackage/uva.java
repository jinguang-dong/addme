package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uva {
    public static final uwc a = new uwc("CLOSED");

    public static final Object a(uvb uvbVar, long j, uiu uiuVar) {
        while (true) {
            long j2 = uvbVar.b;
            if (j2 >= j && !uvbVar.u()) {
                return uvbVar;
            }
            Object objM = uvbVar.m();
            uwc uwcVar = a;
            if (objM == uwcVar) {
                return uwcVar;
            }
            uvb uvbVar2 = (uvb) objM;
            if (uvbVar2 != null) {
                uvbVar = uvbVar2;
            } else {
                uvb uvbVar3 = (uvb) uiuVar.a(Long.valueOf(j2 + 1), uvbVar);
                if (uvbVar.a.d(null, uvbVar3)) {
                    if (uvbVar.u()) {
                        uvbVar.q();
                    }
                    uvbVar = uvbVar3;
                }
            }
        }
    }
}
