package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class req implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public req(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        ret retVar;
        Executor executor = (Executor) this.a.a();
        lat latVar = (lat) this.b.a();
        Object obj = ((tzu) this.d).a;
        Set setA = ((tzz) this.c).a();
        rwc rwcVar = (rwc) obj;
        rwc rwcVar2 = (rwc) ((tzu) this.e).a;
        rer rerVar = rer.a;
        HashMap map = new HashMap();
        if (rwcVar.h()) {
            rerVar = (rer) rwcVar.c();
            retVar = (ret) rwcVar2.f();
        } else {
            retVar = null;
        }
        ret retVar2 = retVar;
        sbp sbpVarJ = sbp.j(setA);
        int size = sbpVarJ.size();
        for (int i = 0; i < size; i++) {
            qsy.g((reo) sbpVarJ.get(i), map);
        }
        return new ree(executor, latVar, rerVar, map, retVar2);
    }
}
